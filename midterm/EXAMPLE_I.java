import java.util.Scanner;

public class EXAMPLE_I {

    public static void main(String[] args) {

        // logical operators
        Scanner sc = new Scanner(System.in);
        
        /*System.out.println("You are playing a game! Press q or Q to quit: ");
          String response = sc.next();
          
          if(! response.equals("q") && response.equals("Q")){
          System.out.println("You quit the game");
          
          }else{
          System.out.println("You still play the game");
          }
          sc.close();*/
        //for loop
        /*for(int i = 10; i>=1; i--){
        System.out.println(i);
        }
        System.out.println("happy new year");*/
         
        // nested loops = a loop inside of a loop
        
        
        /*int rows;
        int columns;
        String symbol;
                            //column = vertical
                            //row = horizontal
         
         System.out.println("enter # of rows");
         rows = sc.nextInt();
          System.out.println("enter # of columns");
          columns = sc.nextInt();
          System.out.println("enter any sysmbol");
          symbol = sc.next();
          
          for(int i=1; i<=rows; i++){
          System.out.println();
          for(int j=1; j<=columns; j++){
          System.out.print(symbol);
        }
    }   sc.close();*/


        //array = used to store multiple value in a single variable
        
        String [] cars = {"Camaro", "Corvette" , "Tesla", "Honda","Rusi"};

         for(int i = 0; i<cars.length; i++)
            System.out.println(cars[i]);
            System.out.println("Enter number");
            int t = sc.nextInt();

            System.out.println(cars[t]);

        // 2d array = an array of array

       /*String[][] cars = new String[3][3];

        cars[0][0] = "00-camaro";
        cars[0][1] = "01-Corvette";
        cars[0][2] = "02-Rusi";
        cars[1][0] = "10-Lambo";
        cars[1][1] = "11-Raptor";
        cars[1][2] = "12-Ranger";
        cars[2][0] = "20-Navara";
        cars[2][1] = "21-Hilux";
        cars[2][2] = "22-Fajero";
        
        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+ " " );

            }    
        }
        System.out.println("Enter number");
        int y = sc.nextInt();
        System.out.println("Enter number");
        int x = sc.nextInt();
        System.out.println(cars[y][x]);

        /*String [][] cars = {
                                {"Camaro", "Pajero", "Raptor" }, 
                                {"Mustang", "Ranger", "Hilux" }, 
                                {"Navara", "Lambo", "Rusi"}
                        };
        for(int i=0; i<cars.length; i++){
            for(int j=0; j<cars.length; j++){
                System.out.println(cars[i][j] + " " );
                System.out.println("enter number");
                int y = sc.nextInt();
                System.out.println("Enter number");
                int x = sc.nextInt();
                System.out.println(cars[y][x]);
            }

        }
                //String = a reference data type that can store one or more characters
                //          reference data type hava access to useful methods

            /*String name = "   Joshua    ";

            boolean result = name.equals("Joshua"); // sensitive cases
            int result = name.length(); // will print the number of letter
            char result = name.charAt(4); // choose a letter from your name (Single letter)
            int result = name.indexOf("o");
            boolean result  = name.isEmpty();
            String result = name.toUpperCase();
            String result = name.toLowerCase();
            String result = name.trim();
            String result = name.replace('h', 'w');


            System.out.println(result);*/

            


        



    }
}