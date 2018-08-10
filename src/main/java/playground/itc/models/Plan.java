package playground.itc.models;

import java.util.ArrayList;
import java.util.List;

public class Plan {

    private final List<Shipment> shipments = new ArrayList<>();

    private final List<Vehicle> vehiclesUsed = new ArrayList<>();

    public Plan(List<Shipment> shipments, List<Vehicle> vehiclesUsed) {
        this.shipments.addAll(shipments);
        this.vehiclesUsed.addAll(vehiclesUsed);
    }

    public List<Shipment> getShipments() {
        return shipments;
    }

    public List<Vehicle> getVehiclesUsed() {
        return vehiclesUsed;
    }

    public double getCost() {
        return getShipments().stream().mapToDouble(Shipment::getShipmentCost).sum();
    }

    public double getTotalKms() {
        // TODO: 09/08/18 implement
        return 0.;
    }
}
