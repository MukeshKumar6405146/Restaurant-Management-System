package Mukesh.Lomror.RestaurentManagementSystem.controller;

import Mukesh.Lomror.RestaurentManagementSystem.model.Restaurant;
import Mukesh.Lomror.RestaurentManagementSystem.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    // ******************* GET ALL RESTAURANT****************************

    @GetMapping("all")
    public List<Restaurant> getAll(){
        return restaurantService.getAll();
    }

    //********* GET BY ID *******************
    @GetMapping("{id}")
    public Restaurant getById(@PathVariable int id){
        return restaurantService.getById(id);
    }

    // ********** ADD RESTAURANT ****************

    @PostMapping("add")
    public String addAll(@RequestBody List<Restaurant> restaurants){
        restaurantService.addAll(restaurants);
        return "Restaurants are added successfully";
    }

    //********* UPDATE SPECIALIZATION ************
    @PutMapping("{id}/{special}")
    public String updateById(@PathVariable int id, @PathVariable String special){
        restaurantService.updateById(id,special);
        return "Specialization of Restaurant is successfully Updated";
    }

    //******************** DELETE BY ID **************

    @DeleteMapping("del/{id}")
    public String deleteById(@PathVariable int id){
        restaurantService.deleteById(id);
        return "restaurant with given id is successfully deleted!!!";
    }
}
