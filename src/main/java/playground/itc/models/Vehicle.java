package playground.itc.models;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private final int truckId;

    private final long capacity;

    private final String type;

    private final Cluster originCluster;

    private Cluster currentLocation;

    private final double dailyFixedCharge;

    private final double loadRunPerKMCharge;

    private final double deadRunPerKMCharge;

    private final List<Shipment> shipments = new ArrayList<>();

    public Vehicle(int truckId, long capacity, String type, Cluster originCluster, double dailyFixedCharge, double loadRunPerKMCharge, double deadRunPerKMCharge) {
        this.truckId = truckId;
        this.capacity = capacity;
        this.type = type;
        this.originCluster = originCluster;
        this.dailyFixedCharge = dailyFixedCharge;
        this.loadRunPerKMCharge = loadRunPerKMCharge;
        this.deadRunPerKMCharge = deadRunPerKMCharge;
        this.currentLocation = originCluster;
    }

    public int getTruckId() {
        return truckId;
    }

    public long getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public Cluster getOriginCluster() {
        return originCluster;
    }

    public double getDailyFixedCharge() {
        return dailyFixedCharge;
    }

    public double getLoadRunPerKMCharge() {
        return loadRunPerKMCharge;
    }

    public double getDeadRunPerKMCharge() {
        return deadRunPerKMCharge;
    }

    public Cluster getCurrentLocation() {
        return currentLocation;
    }

    public List<Shipment> getShipments() {
        return shipments;
    }

    protected void addShipment(Shipment shipment) {
        this.currentLocation = shipment.getDestination();
        shipments.add(shipment);
    }

    public double getCharge(Shipment shipment) {
        // TODO: 09/08/18  Use location and market distance matrix
        return 0.;
    }

    public long getTripDuration(Shipment shipment) {
        // TODO: 09/08/18 implement;
        return 0;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "truckId=" + truckId +
                ", capacity=" + capacity +
                ", type='" + type +
                ", originCluster=" + originCluster +
                ", currentLocation=" + currentLocation +
                ", dailyFixedCharge=" + dailyFixedCharge +
                ", loadRunPerKMCharge=" + loadRunPerKMCharge +
                ", deadRunPerKMCharge=" + deadRunPerKMCharge +
                ", shipments=" + shipments +
                '}';
    }
}
