package com.fc.java.lecture;

import java.util.Scanner;
import com.fc.java.lecture.model.CarDTO;

public class CarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("car number");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.println("car name");
        String carName = scan.nextLine();

//        scan.nextLine();

        System.out.println("car price");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.println("car oner");
        String carOner = scan.nextLine();

//        scan.nextLine();

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOner = carOner;

        showCarInfo(car);
        System.out.println(car.carName);
    }

    public static void showCarInfo(CarDTO car) {
        System.out.println("\ncar sn : " + car.carSn + "\ncar name : "+car.carName+"\ncar price : "+car.carPrice+"\ncar oner : "+car.carOner);
        car.carName = "Demon";
    }
}
