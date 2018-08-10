package playground.itc.models;

import java.util.HashMap;
import java.util.Map;

public class Cluster {

    private final int clusterId;

    private final String name;

    /**
     * Market ID to arbitrage cost map
     */
    private final Map<Integer, Double> arbitrageCostMap = new HashMap<>();

    private final double surgePrice;

    public Cluster(int clusterId, String name, Map<Integer, Double> arbitrageCostMap, long surgePrice) {
        this.clusterId = clusterId;
        this.name = name;
        this.arbitrageCostMap.putAll(arbitrageCostMap);
        this.surgePrice = surgePrice;
    }

    public int getClusterId() {
        return clusterId;
    }

    public String getName() {
        return name;
    }

    public double getArbitrageCost(Market market) {
        return arbitrageCostMap.get(market.getMarketId());
    }

    public double getSurgePrice() {
        return surgePrice;
    }

    private void setArbitrageCost(Market market, double cost) {
        arbitrageCostMap.put(market.getMarketId(), cost);
    }

    @Override
    public String toString() {
        return "Cluster{" +
                "clusterId=" + clusterId +
                ", name='" + name + '\'' +
                ", arbitrageCostMap=" + arbitrageCostMap +
                ", surgePrice=" + surgePrice +
                '}';
    }
}
