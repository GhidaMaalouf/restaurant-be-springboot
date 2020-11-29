package restaurant.dbModel;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class VisitLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Date date;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_restaurant")
    private Restaurant restaurant;

    public VisitLog(UUID visitId, Date visitDate,Restaurant restaurant) {
        this.id = visitId;
        this.date = visitDate;
        this.restaurant=restaurant;
    }
    public VisitLog(){}

    public UUID getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
