package restaurant.dbModel;

import javax.persistence.*;
import java.util.UUID;
import java.util.List;

@Entity
@Table(name="restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    @OneToMany(mappedBy = "restaurant")
    private List<VisitLog> visitLogList;

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

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<VisitLog> getVisitLogList() {
        return visitLogList;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAverageCost(float averageCost) {
        this.averageCost = averageCost;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setVisitLogList(List<VisitLog> visitLogList) {
        this.visitLogList = visitLogList;
    }
}
