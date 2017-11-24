/**
 * @author Jude Kallista-Fitzpatrick
 *Date:11/23/2017
 *Purpose: To establish myCar, herCar, and hisCar. It will then display each with toString. After that it will change the make, color, horsepower, and engine size.
 */

import CarPack.Car;

public class CarActivity {

    public static void main(String[] args) {

        Car myCar = new Car();
        System.out.println("myCar: "+myCar.toString());
        Car hisCar = new Car("Honda","Black",3.5, 400 );
        System.out.println("hisCar: "+hisCar.toString());
        Car herCar = new Car("Volks", "Pink", 2.5, 300);
        System.out.println("herCar: "+herCar.toString());

        myCar.setMake("Ferrari");
        hisCar.setMake("Ferrari");
        herCar.setMake("Ferrari");

        myCar.setColor("Blue");
        hisCar.setColor("Blue");
        herCar.setColor("Blue");

        myCar.setEngineSize(6.5);
        hisCar.setEngineSize(6.5);
        herCar.setEngineSize(6.5);

        myCar.setHorsePower(650);
        hisCar.setHorsePower(650);
        herCar.setHorsePower(650);

        System.out.println (myCar.getColor()+" "+myCar.getHorsePower()+" "+myCar.getMake()+" "+myCar.getEngineSize());
        System.out.println (hisCar.getColor()+" "+hisCar.getHorsePower()+" "+hisCar.getMake()+" "+hisCar.getEngineSize());
        System.out.println (herCar.getColor()+" "+herCar.getHorsePower()+" "+herCar.getMake()+" "+herCar.getEngineSize());
    }
}
