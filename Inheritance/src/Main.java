class Car{
    private String plateNo;
    private String make;
    private String company;

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

class PetrolCar extends Car{
    private String fuelType;
    private Integer seats;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Learning Inheritance");
        PetrolCar pc = new PetrolCar();
        pc.setFuelType("Petrol");
        pc.setSeats(7);

        pc.setCompany("Audi");
        pc.setMake("RS 8");
        pc.setPlateNo("TN 24 AK 0001");

        System.out.println(pc.getFuelType()+" "+pc.getCompany()+" "+pc.getMake()+" "+pc.getSeats()+" "+pc.getPlateNo());
    }
}