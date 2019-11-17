

public class Car extends Vehicle {
    private int nbs;

    public Car(int nbs, String id, double baseCost) {
        super(id, baseCost, color);
        if(nbs>0)this.nbs = nbs;
    }
    
    public double cost(){
        if(nbs<=4)return getBCost()-tax;
        return (getBCost()-tax)+((nbs-4)*0.1*getBCost());
    }
    public void changeColor(String color){
	this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +super.toString()+ ", nbs=" + nbs + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(!(obj instanceof Car))return false;
        Car c = (Car)obj;
        return this.cost()==c.cost();
    }
}
