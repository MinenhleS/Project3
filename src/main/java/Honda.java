public class Honda extends Car{

   private String regNo;

    public String model() {
        return super.model();
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

}
