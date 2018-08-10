package playground.itc.models;

public class Market {

    private final int marketId;

    private final String name;

    private final Cluster cluster;

    private final long constantFetchDist;

    private final long reverseFetchDist;

    public Market(int marketId, String name, Cluster cluster, long constantFetchDist, long reverseFetchDist) {
        this.marketId = marketId;
        this.name = name;
        this.cluster = cluster;
        this.constantFetchDist = constantFetchDist;
        this.reverseFetchDist = reverseFetchDist;
    }

    public int getMarketId() {
        return marketId;
    }

    public String getName() {
        return name;
    }

    public Cluster getCluster() {
        return cluster;
    }

    public long getConstantFetchDist() {
        return constantFetchDist;
    }

    public long getReverseFetchDist() {
        return reverseFetchDist;
    }
}
