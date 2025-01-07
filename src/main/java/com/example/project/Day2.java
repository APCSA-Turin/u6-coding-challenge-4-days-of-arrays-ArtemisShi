
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
       String list[][]= new String[2][names.length];
       String[] niceList = list[0];
       String[] naughtyList = list[1];
        for(int i=0;i<names.length;i++){
            Random random = new Random();
            boolean rand = random.nextBoolean();
            if(rand){
                niceList[i]=names[i];
            }
            else{
                naughtyList[i]=names[i];
            }
        }
        return list; //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}