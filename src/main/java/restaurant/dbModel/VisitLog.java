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
    private Restaurant restaurantId;

    public VisitLog(UUID visitId, Date visitDate,Restaurant restaurant) {
        this.id = visitId;
        this.date = visitDate;
        this.restaurantId=restaurant;
    }
    public VisitLog(){}

    public UUID getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Restaurant getForeign() {
        return restaurantId;
    }
}
