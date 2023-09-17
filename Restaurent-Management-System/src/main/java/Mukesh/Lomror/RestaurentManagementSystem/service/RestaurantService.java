package Mukesh.Lomror.RestaurentManagementSystem.service;

import Mukesh.Lomror.RestaurentManagementSystem.model.Restaurant;
import Mukesh.Lomror.RestaurentManagementSystem.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;
    public List<Restaurant> getAll() {
        return restaurantRepo.getAll();
    }

    public Restaurant getById(int id) {
        return restaurantRepo.getById(id);
    }

    public void addAll(List<Restaurant> restaurants) {
        restaurantRepo.addAll(restaurants);
    }

    public void updateById(int id, String special) {
        restaurantRepo.updateById(id,special);
    }

    public void deleteById(int id) {
        restaurantRepo.deleteById(id);
    }
}
