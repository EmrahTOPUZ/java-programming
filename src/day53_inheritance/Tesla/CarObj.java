package day53_inheritance.Tesla;

public class CarObj {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar("Tesla",  " Model Y" , 48.000, 2021, 326);
        electricCar.drive(50);
        System.out.println(electricCar.toString());
        System.out.println("ec1 make = " + electricCar.getMake());
        System.out.println("ec1 model = " + electricCar.getModel());
        System.out.println("ec1 price = " + electricCar.getPrice());
        System.out.println("ec1 year = " + electricCar.getYear());
        System.out.println("ec1 range = " + electricCar.getRange());

        if (electricCar.getPrice() > 10000) {
            System.out.println(electricCar.getMake() + " - " +electricCar.getModel() + " is out of my budget" );
        }else {
            System.out.println("purchasing " + electricCar.toString());
        }

        System.out.println("Count = " + ElectricCar.getCount());

        ElectricCar ec2 =  new ElectricCar("Tesla" , "CyberTruck" , 59000, 2022, 300);
        System.out.println(ec2.toString());
        System.out.println("Count = " + ElectricCar.getCount());

        Roadster roadster = new Roadster("Tesla ","Roadster", 200.000, 2022,620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());

        ModelX myModelX = new ModelX("Tesla" , "Model X" ,89990.0, 2021,360);
        System.out.println(myModelX.toString());
        myModelX.drive(10);
        System.out.println("Having lunch..." );
        myModelX.drive(10);
        System.out.println("Range Remaining = " + myModelX.getRange());
        System.out.println("Total electric cars count = " + ElectricCar.getCount());



    }
}
