package MyClasses;

//Imports
import static java.lang.System.exit;
import java.util.Scanner;
import static java.lang.Math.*;

public class Perimeter {
    //Perimeter Menu =======================================
    public void perimeterMenu(Scanner perimeterSelection){
        int select = 0;
        double sideLength, side1, side2, side3;
        double base;
        double hieght;
        double radius;

        while(select != 5){
            sideLength =0;
            side1 = 0;
            side2 = 0;
            side3 = 0;
            base = 0;
            hieght = 0;
            radius = 0;
            System.out.println("\n== Perimeter Menu ==");
            System.out.println("1: Compute Square Perimeter");
            System.out.println("2: Compute Rectangle Perimeter");
            System.out.println("3: Compute Triangle Perimeter");
            System.out.println("4: Compute Circle Perimeter");
            System.out.println("5: Back to Main Menu");
            System.out.println("6: Exit");
            System.out.print("Selection: ");
            select = perimeterSelection.nextInt();

            switch(select){
                case 1: 
                    System.out.print("What is the side measurement: ");
                    sideLength = perimeterSelection.nextDouble();
                    perimeterSquare(sideLength);
                    break;
                case 2: 
                    System.out.print("What is the base measurement: ");
                    base = perimeterSelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = perimeterSelection.nextDouble();
                    perimeterRectangle(base, hieght);
                    break;
                case 3:                     
                    System.out.print("What is the measurement of side 1: ");
                    side1 = perimeterSelection.nextDouble();
                    System.out.print("What is the measurement of side 2: ");
                    side2 = perimeterSelection.nextDouble();
                    System.out.print("What is the measurement of side 3: ");
                    side3 = perimeterSelection.nextDouble();
                    perimeterTriangle(side1, side2, side3);
                    break;
                case 4: 
                    System.out.print("What is the radius measurement: ");
                    radius = perimeterSelection.nextDouble();
                    perimeterCircle(radius);
                    break;
                case 5: 
                    System.out.println("Back to Main Menu\n");
                    break;
                case 6:  
                    System.out.println("Exiting");
                    perimeterSelection.close();
                    exit(0);
                    break;
            }
        }
    }
//PERIMETER =========================================
    //Compute Perimeter for Square
    public static void perimeterSquare(double sideLength){
        System.out.println("\nPerimeter for Square");
        System.out.println("P = 4s");
        System.out.println("P = " + "4*"+sideLength);
        System.out.println("P = " + 4.0*sideLength);
    }
    //Coupute Perimeter for Rectangle
    public static void perimeterRectangle(double base, double hieght){
        System.out.println("\nPerimeter for Rectangle");
        System.out.println("P = 2b+2h");
        System.out.println("P = 2*" + base+" + 2*"+hieght);
        System.out.println("P = " + (2.0*base+2.0*hieght));
    }
    //Compute Perimeter for Triangle
    public static void perimeterTriangle(double side1, double side2, double side3){
        System.out.println("\nPerimeter for Triangle");
        System.out.println("P = s1+s2+s3");
        System.out.println("P = " + side1 +" + "+ side2 +" + "+side3);
        System.out.println("P = " + (side1+side2+side3));
    }
    //Coupute Perimeter for Circle
    public static void perimeterCircle(double radius){
        System.out.println("\nPerimeter for Circle");
        System.out.println("C = 2\u03C0r");
        System.out.println("C = 2\u03C0*"+radius);
        System.out.println("C = " + 2.0*PI*radius);
    }
}
