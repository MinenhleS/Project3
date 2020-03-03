public class Car implements Vehicle {


    @Override
    public String model() {
        return "Car 2020 model";
    }

    @Override
    public int ride(int acceleration, int brake) {
        return (acceleration - brake);
    }

}
