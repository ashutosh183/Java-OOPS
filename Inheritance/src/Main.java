import java.sql.SQLOutput;

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

class SportsCar extends PetrolCar{
    String carType;
    String horsePower;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
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
        System.out.println("Single Level Inheritance");
        System.out.println(pc.getFuelType()+" "+pc.getCompany()+" "+pc.getMake()+" "+pc.getSeats()+" "+pc.getPlateNo());


        SportsCar sc = new SportsCar();
        sc.setCarType("Sports");
        sc.setHorsePower("860HP");

        sc.setCompany("Buggati");
        sc.setSeats(2);
        sc.setMake("Chiron");
        sc.setFuelType("Petrol");
        sc.setPlateNo("ASHUTOSH RUPALI");

        System.out.println("MULTILEVEL INHERITANCE");
        System.out.println(sc.getCarType()+" "+sc.getCompany()+" "+sc.getFuelType()+" "+sc.getHorsePower()+" "+sc.getMake()+" "+sc.getPlateNo()+" "+sc.getSeats());
    }
}