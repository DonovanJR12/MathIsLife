package MyClasses;

//Imports
import static java.lang.System.exit;
import java.util.Scanner;
import static java.lang.Math.*;

public class Volume {
     //Volume Menu =======================================
    public void volumeMenu(Scanner volumeSelection){
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
            
        
            System.out.println("\n== Volume Menu ==");
            System.out.println("1: Compute Volume of Rectanglar Prism");
            System.out.println("2: Compute Volume of Right Prism");
            System.out.println("3: Compute Volume of Cylinder");
            System.out.println("4: Compute Volume of Pyramid");
            System.out.println("5: Compute Volume of Cone");
            System.out.println("6: Compute Volume of Sphere");
            System.out.println("7: Back to Main Menu");
            System.out.println("8: Exit");
            System.out.print("Selection: ");
            select = volumeSelection.nextInt();

            switch(select){
                case 1: 
                    System.out.print("What is the length measurement: ");
                    length = volumeSelection.nextDouble();
                    System.out.print("What is the width measurement: ");
                    width = volumeSelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = volumeSelection.nextDouble();
                    System.out.print(VolumeRectangularPrism(length, width, hieght));
                    break;
                case 2: 
                    System.out.print("What is the base measurement: ");
                    base = volumeSelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = volumeSelection.nextDouble();
                    System.out.print("What is the width measurement: ");
                    width = volumeSelection.nextDouble();
                    System.out.print(VolumeRightPrism(base, width, hieght));
                    break;
                case 3:                     
                    System.out.print("What is the radius measurement: ");
                    radius = volumeSelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = volumeSelection.nextDouble();
                    System.out.print(VolumeCylinder(radius, hieght));
                    break;
                case 4: 
                    System.out.print("What is the length measurement: ");
                    sideLength = volumeSelection.nextDouble();
                    System.out.print("What is the width measurement: ");
                    width = volumeSelection.nextDouble();
                    System.out.print("What is the base measurement: ");
                    base = volumeSelection.nextDouble();
                    System.out.print(VolumePyramid(base, width, sideLength));
                    break;
                case 5:                      
                    System.out.print("What is the length measurement: ");
                    length = volumeSelection.nextDouble();
                    System.out.print("What is the radius measurement: ");
                    radius = volumeSelection.nextDouble();
                    System.out.print(VolumeCone(radius));
                    break;
                case 6:  
                    System.out.print("What is the radius measurement: ");
                    radius = volumeSelection.nextDouble();
                    System.out.print(VolumeSphere(radius));
                    break;
                case 7: 
                    System.out.println("Back to Main Menu\n");
                    break;
                case 8:  
                    System.out.println("Exiting");
                    volumeSelection.close();
                    exit(0);
                    break;
            }
        }
    }
 
    
    
    //VOLUME =============================
    //Compute Volume Rectangular Prism
    /*public static void VolumeRectangularPrism(double length, double width, double hieght){
        System.out.println("\nVolume Rectangular Prism");
        System.out.println("Volume = lwh");
        System.out.println("Volume = "+length+"*"+width+"*"+hieght);
        System.out.println("Volume = "+length*width*hieght);
    }*/
    public static double VolumeRectangularPrism(double length, double width, double hieght){
        return (length*width*hieght);
    }
    //Compute Volume Right Prism
    /*public static void VolumeRightPrism(double base, double width, double hieght){
        System.out.println("\nVolume Right Prism");
        System.out.println("Volume = Bh");
        System.out.println("B = Area of base = bw");
        System.out.println("Volume = " + base*width +"*"+width);
        System.out.println("Volume = " + base*width*width);
    }*/
    public static double VolumeRightPrism(double base, double width, double hieght){
        return (base*width*width);
    }
    //Compute Volume Cylinder
    /*public static void VolumeCylinder(double radius, double hieght){
        System.out.println("\nVolume Cylinder");
        System.out.println("Volume = \u03C0r\u00B2h");
        System.out.println("Volume = \u03C0"+radius+"\u00B2*"+ hieght);
        System.out.println("Volume = "+PI*radius*radius*hieght);
    }*/
    public static double VolumeCylinder(double radius, double hieght){
        return (PI*radius*radius*hieght);
    }
    //Compute Volume Pyramid
    /*public static void VolumePyramid(double base, double width, double hieght){
        System.out.println("\nVolume Pyramid");
        System.out.println("Volume = (1/3)Bh");
        System.out.println("B = Area of base = bw");
        System.out.println("Volume = (1/3)*"+base*width+"*"+hieght);
        System.out.println("Volume = "+(1.0/3.0)*base*width*hieght);
    }*/
    public static double VolumePyramid(double base, double width, double hieght){
        return ((1.0/3.0)*base*width*hieght);
    }
    //Compute Volume Cone
    /*public static void VolumeCone(double radius){
        System.out.println("\nVolume Cone");
        System.out.println("Volume = (1/3)\u03C0r\u00B2");
        System.out.println("Volume = (1/3)\u03C0*"+radius+"\u00B2");
        System.out.println("Volume = "+(1.0/3.0)*PI*radius*radius);
    }*/
    public static double VolumeCone(double radius){
        return ((1.0/3.0)*PI*radius*radius);
    }
    //Compute Volume Sphere
    /*public static void VolumeSphere(double radius){
        System.out.println("\nVolume Sphere");
        System.out.println("Volume = (4/3)\u03C0r\u00B3");
        System.out.println("Volume = (4/3)\u03C0*"+radius+"\u00B3");
        System.out.println("Volume = "+(4.0/3.0)*PI*radius*radius*radius);
    }*/
    public static double VolumeSphere(double radius){
        return ((4.0/3.0)*PI*radius*radius*radius);
    }

}
