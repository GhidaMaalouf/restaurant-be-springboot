package restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restaurant.dbModel.Restaurant;

import java.util.List;
import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {

    List<Restaurant> findByName(String restaurantName);

    List<Restaurant> findByType(String restaurantType);

    List<Restaurant> findByNameAndType(String restaurantName, String restaurantType);
}
