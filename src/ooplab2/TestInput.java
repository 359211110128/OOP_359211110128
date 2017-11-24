package ooplab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.management.BufferPoolMXBean;

public class TestInput {
    public  static  void  main(String [] args) throws IOException {
        //BufferadReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));


        System.out.print(" What is your name?");
        String name = reader.readLine();
        System.out.print("Your name is"+name);


}//main
}//class
