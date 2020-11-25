package restaurant.controller.version1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurant.dbModel.Restaurant;
import restaurant.dbModel.VisitLog;
import restaurant.service.RestaurantService;

import java.util.*;

@RestController
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/v1/restaurants/restaurant-by-name/{name}")
    public List<Restaurant> getRestaurantByName(@PathVariable String name){
        return restaurantService.getRestaurantByName(name);
    }
    @GetMapping("/v1/restaurants/restaurant-by-type/{type}")
    public List<Restaurant> getRestaurantByType(@PathVariable String type){
        return restaurantService.getRestaurantByType(type);
    }
    @GetMapping("/v1/restaurants/restaurant/{name}/{type}")
    public List<Restaurant> getRestaurantByNameAndType(@PathVariable String name,@PathVariable String type){
        return restaurantService.getRestaurantByNameAndType(name,type);
    }
    @GetMapping("/v1/restaurants/all-restaurants")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/v1/restaurants/visited-restaurants")
    public List<VisitLog> getAllVisitLog(){
        return restaurantService.getAllVisitLog();
    }
    @PostMapping("/v1/restaurants/add-visited-restaurant")
    public void addVisitLog(@RequestBody VisitLog visitedRestaurant){
        restaurantService.addVisitLog(visitedRestaurant);
    }


}
