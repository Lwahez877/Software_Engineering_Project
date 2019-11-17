package p2assignment4;

import java.util.Objects;

public abstract class Vehicle implements Sellable {
    private String id;
    private double baseCost;

    public Vehicle(String id, double baseCost) {
        this.id = id;
        this.baseCost = baseCost;
    }

    public String identity() {
        return id;
    }

    public double getBCost() {
        return baseCost;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", baseCost=" + baseCost + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(!(obj instanceof Vehicle))return false;
        Vehicle v = (Vehicle)obj;
        return this.baseCost==v.baseCost;
        //return this.baseCost==((Vehicle)obj).baseCost;
    }
    
}
