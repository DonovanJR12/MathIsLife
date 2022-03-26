package MyClasses;

//Imports
import static java.lang.System.exit;
import java.util.Scanner;
import static java.lang.Math.*;

public class SurfaceArea {

    
    //Surface Area Menu =======================================
    public void SAMenu(Scanner SASelection){
        int select = 0;
        double sideLength;
        double width;
        double length;
        double base;
        double hieght;
        double radius;

        while(select != 7){
            sideLength = 0;
            width = 0;
            length = 0;
            base = 0;
            hieght = 0;
            radius = 0;
            
        
            System.out.println("\n== Surface Area Menu ==");
            System.out.println("1: Compute Surface Area of Rectanglar Prism");
            System.out.println("2: Compute Surface Area of Right Prism");
            System.out.println("3: Compute Surface Area of Cylinder");
            System.out.println("4: Compute Surface Area of Pyramid");
            System.out.println("5: Compute Surface Area of Cone");
            System.out.println("6: Compute Surface Area of Sphere");
            System.out.println("7: Back to Main Menu");
            System.out.println("8: Exit");
            System.out.print("Selection: ");
            select = SASelection.nextInt();

            switch(select){
                case 1: 
                    System.out.print("What is the length measurement: ");
                    length = SASelection.nextDouble();
                    System.out.print("What is the width measurement: ");
                    width = SASelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = SASelection.nextDouble();
                    SARectanglarPrism(length, width, hieght);
                    break;
                case 2: 
                    System.out.print("What is the base measurement: ");
                    base = SASelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = SASelection.nextDouble();
                    System.out.print("What is the width measurement: ");
                    width = SASelection.nextDouble();
                    SARightPrism(base, width, hieght);
                    break;
                case 3:                     
                    System.out.print("What is the hieght measurement: ");
                    hieght = SASelection.nextDouble();
                    System.out.print("What is the radius measurement: ");
                    radius = SASelection.nextDouble();
                    SACylinder(radius, hieght);
                    break;
                case 4: 
                    System.out.print("What is the length measurement: ");
                    sideLength = SASelection.nextDouble();
                    System.out.print("What is the width measurement: ");
                    width = SASelection.nextDouble();
                    System.out.print("What is the base measurement: ");
                    base = SASelection.nextDouble();
                    SAPyramid(base, width, sideLength);
                    break;
                case 5: 
                    System.out.print("What is the length measurement: ");
                    length = SASelection.nextDouble();
                    System.out.print("What is the radius measurement: ");
                    radius= SASelection.nextDouble();
                    SACone(radius, length);
                    break;
                case 6:  
                    System.out.print("What is the radius measurement: ");
                    radius = SASelection.nextDouble();
                    SASphere(radius);
                    break;
                case 7: 
                    System.out.println("Back to Main Menu\n");
                    break;
                case 8:  
                    System.out.println("Exiting");
                    SASelection.close();
                    exit(0);
                    break;
            }
        }
    }


     //SURFACE AREA =================================
    //p perimeter of base
    //B Area of base
    //Compute Surface Area Rectangular Prism
    public static void SARectanglarPrism(double length, double width, double hieght){
        System.out.println("\nSurface Area Rectangular Prism");
        System.out.println("SA = 2lw+2lh+2wh");
        System.out.println("SA = 2*"+length+"*"+width+"+2*"+length+"*"+hieght+"+2*"+width+"*"+hieght);
        System.out.println("SA = "+2.0*length*width+"+"+2.0*length*hieght+"+"+2.0*width*hieght);
        System.out.println("SA = "+(2.0*length*width+2.0*length*hieght+2.0*width*hieght));

    }
    //Compute Surface Area Right Prism
    public static void SARightPrism(double base, double width, double hieght){
        System.out.println("\nSurface Area Right Prism");
        System.out.println("SA = ph + 2B");
        System.out.println("SA = ph + 2B");
        System.out.println("B = Area of base = bw");
        System.out.println("p = perimeter of base = 2b + 2w");
        System.out.println("SA = "+(2.0*base+2.0*width)+"*"+hieght + " + 2*" +(base*width));
        System.out.println("SA = "+((2.0*base+2.0*width)*hieght) + " + " + (2.0*(base*width)));
        System.out.println("SA = "+(((2.0*base+2.0*width)*hieght) + (2.0*(base*width))));
        

    }
    //Compute Surface Area Cylinder
    public static void SACylinder(double radius, double hieght){
        System.out.println("\nSurface Area Cylinder");
        System.out.println("SA = 2\u03C0rh+2\u03C0r\u00B2");
        System.out.println("SA = 2\u03C0*"+radius+"*"+hieght+"+ 2\u03C0*"+radius+"\u00B2");
        System.out.println("SA = "+((2.0*PI*radius*hieght)+(2.0*PI*radius*radius)));
    }
    //Compute Surface Area Pyramid
    public static void SAPyramid(double base, double width, double side){
        System.out.println("\nSurface Area Pyramid");
        System.out.println("SA = (1/2)ps+B");
        System.out.println("B = Area of base = bw");
        System.out.println("p = perimeter of base = 2b + 2w");
        System.out.println("SA = (1/2)"+(2.0*base+2.0*width)+"*"+side+"+"+(base*width));
        System.out.println("SA = "+(((1.0/2.0)*(2.0*base+2.0*width)*side)+(base*width)));
    }
    //Compute Surface Area Cone
    public static void SACone(double radius, double side){
        System.out.println("\nSurface Area Cone");
        System.out.println("SA = \u03C0rs+\u03C0r\u00B2");
        System.out.println("SA = \u03C0"+radius+"*"+side+"\u03C0"+radius+"\u00B2");
        System.out.println("SA = "+((PI*radius*side)+(PI*radius*radius)));
    }
    //Compute Surface Area Sphere
    public static void SASphere(double radius){
        System.out.println("\nSurface Area Sphere");
        System.out.println("SA = 4\u03C0r\u00B2");
        System.out.println("SA = 4\u03C0*"+radius+"\u00B2");
        System.out.println("SA = "+4.0*PI*radius*radius);
    }

}
