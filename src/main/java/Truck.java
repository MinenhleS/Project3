public class Truck implements  Vehicle{


    @Override
    public String model() {
        return "Truck 2020 model";
    }

    @Override
    public int ride(int acceleration, int brake) {
        return (acceleration - brake);
    }

}
