package Mukesh.Lomror.RestaurentManagementSystem.repository;

import Mukesh.Lomror.RestaurentManagementSystem.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepo {
    List<Restaurant> restaurantList = new ArrayList<>();

    public RestaurantRepo(){
        restaurantList.add(new Restaurant(1,"Ganga-Dhba","new Delhi",20,"paratha & sabji"));
    }
    public List<Restaurant> getAll() {
        return restaurantList;
    }

    public Restaurant getById(int id) {
        boolean found=false;
        for(Restaurant ele : restaurantList){
            if(ele.getRestId()==id){
                found=true;
                return ele;
            }
        }
        if(!found){
            throw new IllegalArgumentException("Restaurant with Id: "+ id + "Not Found");
        }

        return null;
    }

    public void addAll(List<Restaurant> restaurants) {
        restaurantList.addAll(restaurants);
    }

    public void updateById(int id, String special) {
        boolean found = false;
        for(Restaurant ele: restaurantList){
            if(ele.getRestId() ==  id){
                ele.setRestSpecial(special);
                found=true;
                break;
            }
        }

        if(!found){
            throw new IllegalArgumentException("Restaurant with this ID: "+id+"not found!!!!!");
        }
    }

    public List<Restaurant> deleteById(int id) {
        boolean found = false;
        for(Restaurant ele:restaurantList){
            if(ele.getRestId() == id){
                restaurantList.remove(ele);
                found = true;
                break;
            }
        }

        if(!found){
            throw new IllegalArgumentException("Restaurant with ID: "+id+ "not found");
        }

        return restaurantList;
    }
}
