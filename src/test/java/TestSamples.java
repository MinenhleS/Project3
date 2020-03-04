import org.junit.Assert;
import org.junit.Test;

public class TestSamples {

    Vehicle v1 = new Truck();
    Vehicle v2 = new Car();

    private  Honda honda;

    @Test
    public void shouldCheckTruckModel(){
        String result = v1.model();

        Assert.assertEquals("Truck 2020 model", result);

    }


    @Test
    public void shouldReturnCarModel(){
    honda = new Honda();
    String result = honda.model();

        Assert.assertEquals("Car 2020 model", result);
    }

    @Test
    public void shouldReturnRegNumber(){
        honda = new Honda();
        honda.setRegNo("CA50647");
        String results = honda.getRegNo();
        System.out.println(honda.getRegNo());


        Assert.assertEquals("CA50647", results);

    }

    @Test
    public void shouldRunAlternativeOfInheritance(){
        Opel opel = new Opel();
        
        String result = opel.model();

        Assert.assertEquals("Car 2020 model", result);

    }

}
