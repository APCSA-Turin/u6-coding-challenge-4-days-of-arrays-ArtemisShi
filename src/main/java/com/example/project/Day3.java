package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        int idx=size-1;
        int pick=size/3;

        for(int i=0;i<size;i++){
          for(int j=0;j<size;j++){
            grid[i][j]=" ";
          }
        }
        
    
        //first and last rows
        for(int i=0;i<size;i+=idx){
          for(int j=0;j<size;j+=pick+1){
            grid[i][j]="*";
          }
        }

        //second rows
        for(int i=1;i<size;i+=idx-pick){
          for(int j=1;j<size;j+=pick){
            grid[i][j]="*";
          }
        }

        
        //middle row
        for(int j=0;j<size;j++){
          grid[size/2][j]="*";
        }

        for(int i=(size/2)-1;i<pick+4;i+=2){
          for(int j=pick;j<=size-pick-1;j++){
            grid[i][j]="*";
      }}
        


        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {

    }

    

    // Test for the snowflake generation
    public static void main(String[] args) {
      for (int i = 0; i < 7; i++){
        for (int j = 0; j < 7; j++)
            System.out.print(generateSnowflake(7)[i][j]+" ");
          System.out.println();
    }
    
   
    }
}
