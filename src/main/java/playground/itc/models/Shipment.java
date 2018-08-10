package playground.itc.models;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

import static java.time.ZoneId.systemDefault;

public class Shipment {

    private final int shipmentId;

    private final LocalDate dueDate;

    private final Cluster source;

    private final Cluster destination;

    private final long loadDuration;

    private final long unloadDuration;

    /**
     * planning variable
     */
    private Route route;

    private final long load;

    public Shipment(int shipmentId, LocalDate dueDate, Cluster source, Cluster destination, long loadDuration, long unloadDuration, long load) {
        this.shipmentId = shipmentId;
        this.dueDate = dueDate;
        this.source = source;
        this.destination = destination;
        this.loadDuration = loadDuration;
        this.unloadDuration = unloadDuration;
        this.load = load;
    }

    public long getLoad() {
        return load;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Cluster getSource() {
        return source;
    }

    public Cluster getDestination() {
        return destination;
    }

    public long getLoadDuration() {
        return loadDuration;
    }

    public long getUnloadDuration() {
        return unloadDuration;
    }

    public long getTimeWindowEnd() {
        return dueDateInMS() + TimeUnit.DAYS.toMillis(2);
    }

    public long getTimeWindowStart() {
        return dueDateInMS() - TimeUnit.DAYS.toMillis(2);
    }

    /**
     * Only call when shipment fulfilled
     */
    public Double getShipmentCost() {
        return isFulfilled() ? route.cost() : null;
    }


    public Vehicle getShippingVehicle() {
        return isFulfilled() ? route.getVehicle() : null;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
        this.route.getVehicle().addShipment(this);
    }

    private boolean isFulfilled() {
        return route != null;
    }

    private long dueDateInMS() {
        return dueDate.atStartOfDay().atZone(OffsetDateTime.now().getOffset()).toInstant().toEpochMilli();
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId=" + shipmentId +
                ", dueDate=" + dueDate +
                ", source=" + source +
                ", destination=" + destination +
                ", loadDuration=" + loadDuration +
                ", unloadDuration=" + unloadDuration +
                ", route=" + route +
                ", load=" + load +
                '}';
    }
}
