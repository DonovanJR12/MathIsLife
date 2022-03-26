//Imports
import static java.lang.System.exit;
import java.util.Scanner;
import static java.lang.Math.*;

//Class Begin 
class Math{
    public static void main(String args []){
        menu();    
    }
    //MENUS===============================
    public static void menu(){
        Scanner menuSelection = new Scanner(System.in);
        int select = 0;
        while(true){
            System.out.println("== Main Menu ==");
            System.out.println("1: Compute Area");
            System.out.println("2: Compute Perimeter");
            System.out.println("3: Compute Surface Area");
            System.out.println("4: Compute Volume");
            System.out.println("5: Exit");
            System.out.print("Selection: ");
            select = menuSelection.nextInt();

            switch(select){
                case 1: 
                    areaMenu(menuSelection);
                    break;
                case 2: 
                    perimeterMenu(menuSelection);
                    break;
                case 3: 
                    SAMenu(menuSelection);
                    break;
                case 4: 
                    volumeMenu(menuSelection);
                    break;
                case 5: 
                    System.out.println("Exiting");
                    menuSelection.close();
                    exit(0);
                    break;
            }
        }
    }
    //Area Menu =======================================
    public static void areaMenu(Scanner areaSelection){
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
                    areaSquare(sideLength);
                    break;
                case 2: 
                    System.out.print("What is the base measurement: ");
                    base = areaSelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = areaSelection.nextDouble();
                    areaRectangle(base, hieght);
                    break;
                case 3:                     
                    System.out.print("What is the base measurement: ");
                    base = areaSelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = areaSelection.nextDouble();
                    areaTriangle(base, hieght);
                    break;
                case 4: 
                    System.out.print("What is the radius measurement: ");
                    radius = areaSelection.nextDouble();
                    areaCircle(radius);
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
    //Perimeter Menu =======================================
    public static void perimeterMenu(Scanner perimeterSelection){
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
    //Surface Area Menu =======================================
    public static void SAMenu(Scanner SASelection){
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
    //Volume Menu =======================================
    public static void volumeMenu(Scanner volumeSelection){
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
                    VolumeRectangularPrism(length, width, hieght);
                    break;
                case 2: 
                    System.out.print("What is the base measurement: ");
                    base = volumeSelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = volumeSelection.nextDouble();
                    System.out.print("What is the width measurement: ");
                    width = volumeSelection.nextDouble();
                    VolumeRightPrism(base, width, hieght);
                    break;
                case 3:                     
                    System.out.print("What is the radius measurement: ");
                    radius = volumeSelection.nextDouble();
                    System.out.print("What is the hieght measurement: ");
                    hieght = volumeSelection.nextDouble();
                    VolumeCylinder(radius, hieght);
                    break;
                case 4: 
                    System.out.print("What is the length measurement: ");
                    sideLength = volumeSelection.nextDouble();
                    System.out.print("What is the width measurement: ");
                    width = volumeSelection.nextDouble();
                    System.out.print("What is the base measurement: ");
                    base = volumeSelection.nextDouble();
                    VolumePyramid(base, width, sideLength);
                    break;
                case 5:                      
                    System.out.print("What is the length measurement: ");
                    length = volumeSelection.nextDouble();
                    System.out.print("What is the radius measurement: ");
                    radius = volumeSelection.nextDouble();
                    VolumeCone(radius);
                    break;
                case 6:  
                    System.out.print("What is the radius measurement: ");
                    radius = volumeSelection.nextDouble();
                    VolumeSphere(radius);
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
    //AREA============================================
    //Compute Area for Square
    public static void areaSquare(double sideLength){
        System.out.println("\nArea for Square");
        System.out.println("A = s\u00B2");
        System.out.println("A = " + sideLength +"\u00B2");
        System.out.println("A = " + sideLength*sideLength);
    }
    //Coupute Area for Rectangle
    public static void areaRectangle(double base, double hieght){
        System.out.println("\nArea for Rectangle");
        System.out.println("A = b*h");
        System.out.println("A = " + base+" * "+hieght);
        System.out.println("A = " + base*hieght);
    }
    //Compute Area for Triangle
    public static void areaTriangle(double base, double hieght){
        System.out.println("\nArea for Triangle");
        System.out.println("A = (1/2)*b*h");
        System.out.println("A = (1/2)" + base +"*"+hieght);
        System.out.println("A = (1/2)" + base*hieght);
        System.out.println("A = " + ((1.0/2.0)*base*hieght));
    }
    //Coupute Area for Circle
    public static void areaCircle(double radius){
        System.out.println("\nArea for Circle");
        System.out.println("A = \u03C0*r\u00B2");
        System.out.println("A = " +PI*radius*radius);
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
    //VOLUME =============================
    //Compute Volume Rectangular Prism
    public static void VolumeRectangularPrism(double length, double width, double hieght){
        System.out.println("\nVolume Rectangular Prism");
        System.out.println("Volume = lwh");
        System.out.println("Volume = "+length+"*"+width+"*"+hieght);
        System.out.println("Volume = "+length*width*hieght);
    }
    //Compute Volume Right Prism
    public static void VolumeRightPrism(double base, double width, double hieght){
        System.out.println("\nVolume Right Prism");
        System.out.println("Volume = Bh");
        System.out.println("B = Area of base = bw");
        System.out.println("Volume = " + base*width +"*"+width);
        System.out.println("Volume = " + base*width*width);
    }
    //Compute Volume Cylinder
    public static void VolumeCylinder(double radius, double hieght){
        System.out.println("\nVolume Cylinder");
        System.out.println("Volume = \u03C0r\u00B2h");
        System.out.println("Volume = \u03C0"+radius+"\u00B2*"+ hieght);
        System.out.println("Volume = "+PI*radius*radius*hieght);
    }
    //Compute Volume Pyramid
    public static void VolumePyramid(double base, double width, double hieght){
        System.out.println("\nVolume Pyramid");
        System.out.println("Volume = (1/3)Bh");
        System.out.println("B = Area of base = bw");
        System.out.println("Volume = (1/3)*"+base*width+"*"+hieght);
        System.out.println("Volume = "+(1.0/3.0)*base*width*hieght);
    }
    //Compute Volume Cone
    public static void VolumeCone(double radius){
        System.out.println("\nVolume Cone");
        System.out.println("Volume = (1/3)\u03C0r\u00B2");
        System.out.println("Volume = (1/3)\u03C0*"+radius+"\u00B2");
        System.out.println("Volume = "+(1.0/3.0)*PI*radius*radius);
    }
    //Compute Volume Sphere
    public static void VolumeSphere(double radius){
        System.out.println("\nVolume Sphere");
        System.out.println("Volume = (4/3)\u03C0r\u00B3");
        System.out.println("Volume = (4/3)\u03C0*"+radius+"\u00B3");
        System.out.println("Volume = "+(4.0/3.0)*PI*radius*radius*radius);
    }
    //ALGEBRA7
    
}