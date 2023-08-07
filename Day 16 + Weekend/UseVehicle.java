class Vehicle
{
    private int numOfPassangers;
    private double fuelCapacity, fuelConsumptionRate;
    void setDetails(int numOfPassangers, double fuelCapacity, double fuelConsumptionRate)
    {
        this.numOfPassangers = numOfPassangers;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumptionRate = fuelConsumptionRate;
    }
    void getDetails()
    {
        System.out.println("VEHICLE DETAILS : ");
        System.out.println("Number of Passangers : " + numOfPassangers);
        System.out.println("Fuel Capacity : " + fuelCapacity);
        System.out.println("Fuel Consumption Rate : " + fuelConsumptionRate);
    }
}

class Truck extends Vehicle
{
    private double carryingCapacity;
    void setDetails(int numOfPassangers, double fuelCapacity, double fuelConsumptionRate, double carryingCapacity)
    {
        super.setDetails(numOfPassangers, fuelCapacity, fuelConsumptionRate);
        this.carryingCapacity = carryingCapacity;
    }
    void getDetails()
    {
        System.out.println("TRUCK DETAILS : ");
        super.getDetails();
        System.out.println("Carrying Capacity : " + carryingCapacity);
    }
}

class UseVehicle
{
    public static void main(String[] args)
    {
        Vehicle ob1 = new Vehicle();
        ob1.setDetails(50, 40.0, 9.5);
        ob1.getDetails();

        System.out.println();

        Truck ob2 = new Truck();
        ob2.setDetails(4, 45, 25, 100);
        ob2.getDetails();
    }
}