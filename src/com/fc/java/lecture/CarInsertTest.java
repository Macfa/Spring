package com.fc.java.lecture;

import com.fc.java.lecture.model.CarDAO;
import com.fc.java.lecture.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
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

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
//        insertCar(car);
//        System.out.println(car.carName);
    }
}
