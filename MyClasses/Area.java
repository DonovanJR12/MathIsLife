package MyClasses;

//Imports
import static java.lang.System.exit;
import java.util.Scanner;
import static java.lang.Math.*;

public class Area {
     //Area Menu =======================================
     public void areaMenu(Scanner areaSelection){
        int select = 0;
        double sideLength;
        double base;
        double hieght;
        double radius;

        while(select != 5){
            sideLength =0;
            base = 0;
            hieght = 0;
            radius = 0;
            System.out.println("\n== Area Menu ==");
            System.out.println("1: Compute Square Area");
            System.out.println("2: Compute Rectangle Area");
            System.out.println("3: Compute Triangle Area");
            System.out.println("4: Compute Circle Area");
            System.out.println("5: Back to Main Menu");
            System.out.println("6: Exit");
            System.out.print("Selection: ");
            select = areaSelection.nextInt();

            switch(select){
                case 1: 
                    System.out.print("What is the side measurement: ");
                    sideLength = areaSelection.nextDouble();
                    System.out.print(areaSquare(sideLength));
                    break;
                case 2: 
                    System.out.print("What is the base measurement: ");
                    base = areaSelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = areaSelection.nextDouble();
                    System.out.print(areaRectangle(base, hieght));
                    break;
                case 3:                     
                    System.out.print("What is the base measurement: ");
                    base = areaSelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = areaSelection.nextDouble();
                    System.out.print(areaTriangle(base, hieght));
                    break;
                case 4: 
                    System.out.print("What is the radius measurement: ");
                    radius = areaSelection.nextDouble();
                    System.out.print(areaCircle(radius));
                    break;
                case 5: 
                    System.out.println("Back to Main Menu\n");
                    break;
                case 6:  
                    System.out.println("Exiting");
                    areaSelection.close();
                    exit(0);
                    break;
            }
        }
    }

       //AREA============================================
    //Compute Area for Square
    /*public static void areaSquare(double sideLength){
        System.out.println("\nArea for Square");
        System.out.println("A = s\u00B2");
        System.out.println("A = " + sideLength +"\u00B2");
        System.out.println("A = " + sideLength*sideLength);
    }*/
    public static double areaSquare(double sideLength){
        return (sideLength*sideLength);
    }
    //Coupute Area for Rectangle
    /*public static void areaRectangle(double base, double hieght){
        System.out.println("\nArea for Rectangle");
        System.out.println("A = b*h");
        System.out.println("A = " + base+" * "+hieght);
        System.out.println("A = " + base*hieght);
    }*/
    public static double areaRectangle(double base, double hieght){
        return (base*hieght);
    }
    //Compute Area for Triangle
    /*public static void areaTriangle(double base, double hieght){
        System.out.println("\nArea for Triangle");
        System.out.println("A = (1/2)*b*h");
        System.out.println("A = (1/2)" + base +"*"+hieght);
        System.out.println("A = (1/2)" + base*hieght);
        System.out.println("A = " + ((1.0/2.0)*base*hieght));
    }*/    
    public static double areaTriangle(double base, double hieght){
        return (((1.0/2.0)*base*hieght));
    }
    //Coupute Area for Circle
    /*public static void areaCircle(double radius){
        System.out.println("\nArea for Circle");
        System.out.println("A = \u03C0*r\u00B2");
        System.out.println("A = " +PI*radius*radius);
    }*/
    public static double areaCircle(double radius){
        return (PI*radius*radius);
    }
}
