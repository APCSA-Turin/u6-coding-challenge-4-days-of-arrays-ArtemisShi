package com.example.project;
import java.util.Random;
import java.util.Scanner;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};
     
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input your name: ");
            String name= scan.nextLine();
            System.out.println("Input: "+name);
            System.out.println("Your new elf name is: " + generateElfName(name));
        }
        public static String generateElfName(String name){
            if(name.equals("")||name==null){
                throw new IllegalArgumentException("Name cannot be null or empty");
        }
        int pick = (int)((Math.random()*4)+1);
        return elf_names[pick]+" " +name;  
    }
}