package restaurant.dbModel;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@OneToMany(mappedBy = "rId")
    private  UUID id;
    @Column(name="name")
    private  String name;
    @Column(name="type")
    private  String type;
    @Column(name="phoneNumber")
    private  int phoneNumber;
    @Column(name="averageCost")
    private  float averageCost;
    @Column(name="address")
    private String address;
    @Column(name="imagePath")
    private String imagePath;


    public Restaurant(UUID id, String restaurantName, String restaurantType,
                      int phoneNumber, float averageCost, String address, String restaurantImagePath) {
        this.id = id;
        this.name = restaurantName;
        this.type = restaurantType;
        this.phoneNumber = phoneNumber;
        this.averageCost = averageCost;
        this.address = address;
        this.imagePath =restaurantImagePath;
    }

    public Restaurant(){}
    public UUID getId() {
        return id;
    }

    public String getRestaurantName() {
        return name;
    }

    public String getRestaurantType() {
        return type;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public float getAverageCost() {
        return averageCost;
    }

    public String getAddress() {
        return address;
    }

    public String getImagePath() {
        return imagePath;
    }
}
