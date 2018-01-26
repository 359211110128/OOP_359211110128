package ooplab7;

import java.util.Scanner;

public class mySuperCare {
    public static void  main (String[] args) {

        SuperCare s = new SuperCare();
        s = inputData(s);
        s.getSupercarInfo();

    }//main

    private static SuperCare inputData(SuperCare s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Supercar info ");
        System.out.print("Enter CarBrand : ");
        s.setCarBrand(scanner.nextLine());
        System.out.print("Enter CarColor : ");
        s.setCarColor(scanner.nextLine());
        System.out.print("Enter CarEnginesize : ");
        s.setCarEnginesize(scanner.nextLine());
        System.out.print("Enter CarMaxspeed : ");
        s.setCarMaxspeed(scanner.nextLine());
        System.out.print("Enter CountryofOrigin : ");
        s.setCountryofOrigin(scanner.nextLine());
        return s;
    }

}//class