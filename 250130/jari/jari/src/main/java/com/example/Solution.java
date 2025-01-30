package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    ArrayList<Car> carList = new ArrayList<>();    

    public void fileToList() {
        try {
            tryFileToList();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
        }
    }
    public void tryFileToList() throws FileNotFoundException {
        System.out.println("start...");
        
        File file = new File("jaribt.txt");
        Scanner sc = new Scanner(file);
        // sc.nextLine();
        while(sc.hasNext()) {
            String line = sc.nextLine();

            String[] lineArray = line.split(":");
            Car car = new Car();
            car.setPlate(lineArray[0]);
            car.setBrand(lineArray[1]);
            car.setYear(Integer.parseUnsignedInt(lineArray[2]));
            car.setFuel(lineArray[3]);
            car.setPrice(Double.parseDouble(lineArray[4]));
            boolean climate = true;
            if (lineArray[5].equals("0")) {
                climate = false;
            }
            car.setClimate(climate);
            car.setCert(LocalDate.parse(lineArray[6]));
            carList.add(car);
        }
        sc.close();
    
    }
    public void printPetrolDatas() {
        for( Car car  : carList  ) {
            if(car.getFuel().equals("benzin")) {
                System.out.printf(
                    "%s %s %d %s %.2f %s %s\n",
                    car.getPlate(),
                    car.getBrand(),
                    car.getYear(),
                    car.getFuel(),
                    car.getPrice(),                    
                    car.getClimate(),
                    car.getCert()
                    );
            }
        }
    }
    public void printOneMillionDatas() {
        for( Car car  : carList  ) {
            if(car.getPrice() < 1000000) {
                System.out.printf(
                    "%s %s %d %s %.2f %s %s\n",
                    car.getPlate(),
                    car.getBrand(),
                    car.getYear(),
                    car.getFuel(),
                    car.getPrice(),                    
                    car.getClimate(),
                    car.getCert()
                    );
            }
        }
    }
    public void printMoreThenOneYearDatas() {
        for( Car car  : carList  ) {
            LocalDate now = LocalDate.parse("2021-01-23");
            int diff = car.getCert().getYear() - now.getYear();
            if(diff > 1) {
                System.out.printf(
                    "%s %s %d %s %.2f %s %s\n",
                    car.getPlate(),
                    car.getBrand(),
                    car.getYear(),
                    car.getFuel(),
                    car.getPrice(),                    
                    car.getClimate(),
                    car.getCert()
                    );
            }
        }
    }
    public void printHondaDatas() {
        for( Car car  : carList  ) {
            if(car.getBrand().equals("Honda")) {
                System.out.printf(
                    "%s %s %d %s %.2f %s %s\n",
                    car.getPlate(),
                    car.getBrand(),
                    car.getYear(),
                    car.getFuel(),
                    car.getPrice(),                    
                    car.getClimate(),
                    car.getCert()
                    );
            }
        }
    }

}
