package restaurant.controller.version1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurant.dbModel.Restaurant;
import restaurant.dbModel.VisitLog;
import restaurant.service.RestaurantService;

import java.util.*;
//@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

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
