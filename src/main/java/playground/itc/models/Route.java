package playground.itc.models;

public class Route implements Move {

    private final Cluster sourceCluster;

    private final Cluster destinationCluster;

    private final Market sourceMarket;

    private final Market destinationMarket;

    private final Vehicle vehicle;

    private final long startEpoch;

    public Route(Cluster sourceCluster, Cluster destinationCluster, Market sourceMarket, Market destinationMarket, Vehicle vehicle, long startEpoch) {
        this.sourceCluster = sourceCluster;
        this.destinationCluster = destinationCluster;
        this.sourceMarket = sourceMarket;
        this.destinationMarket = destinationMarket;
        this.vehicle = vehicle;
        this.startEpoch = startEpoch;
    }

    public Cluster getSourceCluster() {
        return sourceCluster;
    }

    public Cluster getDestinationCluster() {
        return destinationCluster;
    }

    public Market getSourceMarket() {
        return sourceMarket;
    }

    public Market getDestinationMarket() {
        return destinationMarket;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public long getStartEpoch() {
        return startEpoch;
    }

    public double cost() {
        // TODO: 09/08/18 cost calculation
        return 0.;
    }
}
