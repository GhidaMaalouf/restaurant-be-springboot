package restaurant.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restaurant.dbModel.Restaurant;
import restaurant.dbModel.VisitLog;
import restaurant.repository.RestaurantRepository;
import restaurant.repository.VisitLogRepository;

import java.util.*;
@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private VisitLogRepository visitLogRepository;

    public List<Restaurant> getAllRestaurants(){
        return restaurantRepository.findAll();
    }

    public List<VisitLog> getAllVisitLog(){
        return visitLogRepository.findAll();
    }

    public void addVisitLog(VisitLog visit){
        visitLogRepository.save(visit);
    }

}
