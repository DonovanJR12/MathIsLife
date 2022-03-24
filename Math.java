//Imports
import static java.lang.Math.*;

//Class Begin 
class Math{
    public static void main(String args []){
        SARightPrism();
        SACylinder();
        SAPyramid();
        SACone();
        SASphere();
        VolumeRectangularPrism();
        VolumeRightPrism();
        VolumeCylinder();
        VolumePyramid();
        VolumeCone();
        VolumeSphere();
    }
    //AREA============================================
    //Compute Area for Square
    public static void areaSquare(double sideLength){
        System.out.println("Area for Square");
        System.out.println("A = s\u00B2");
        System.out.println("A = " + sideLength +"\u00B2");
        System.out.println("A = " + sideLength*sideLength);
    }
    //Coupute Area for Rectangle
    public static void areaRectangle(double base, double hieght){
        System.out.println("Area for Rectangle");
        System.out.println("A = b*h");
        System.out.println("A = " + base+" * "+hieght);
        System.out.println("A = " + base*hieght);
    }
    //Compute Area for Triangle
    public static void areaTriangle(double base, double hieght){
        System.out.println("Area for Triangle");
        System.out.println("A = (1/2)*b*h");
        System.out.println("A = (1/2)" + base +"*"+hieght);
        System.out.println("A = (1/2)" + base*hieght);
        System.out.println("A = " + (1/2)*base*hieght);
    }
    //Coupute Area for Circle
    public static void areaCircle(double radius){
        System.out.println("Area for Circle");
        System.out.println("A = \u03C0*r\u00B2");
        System.out.println("A = " +PI*radius*radius);
    }
    //PERIMETER =========================================
    //Compute Perimeter for Square
    public static void perimeterSquare(double sideLength){
        System.out.println("Perimeter for Square");
        System.out.println("P = 4s");
        System.out.println("P = " + "4"+sideLength);
        System.out.println("P = " + 4*sideLength);
    }
    //Coupute Perimeter for Rectangle
    public static void perimeterRectangle(double base, double hieght){
        System.out.println("Perimeter for Rectangle");
        System.out.println("P = 2b+2h");
        System.out.println("P = 2" + base+" + 2"+hieght);
        System.out.println("P = " + (2*base+2*hieght));
    }
    //Compute Perimeter for Triangle
    public static void perimeterTriangle(double side1, double side2, double side3){
        System.out.println("Perimeter for Triangle");
        System.out.println("P = s1+s2+s3");
        System.out.println("P = " + side1 +" + "+ side2 +" + "+side3);
        System.out.println("P = " + (side1+side2+side3));
    }
    //Coupute Perimeter for Circle
    public static void perimeterCircle(double radius){
        System.out.println("Perimeter for Circle");
        System.out.println("C = 2\u03C0*r");
        System.out.println("C = 2\u03C0"+radius);
        System.out.println("C = " + 2*PI*radius);
    }
    //SURFACE AREA
    //p perimeter of base
    //B Area of base
    //Compute Surface Area Rectangular Prism
    public static void SARectanglarPrism(double length, double width, double hieght){
        System.out.println("Surface Area Rectangular Prism");
        System.out.println("SA = 2lw+2lh+2wh");
    }
    //Compute Surface Area Right Prism
    public static void SARightPrism(){
        System.out.println("Surface Area Right Prism");
        System.out.println("SA = ph + 2B");
    }
    //Compute Surface Area Cylinder
    public static void SACylinder(){
        System.out.println("Surface Area Cylinder");
        System.out.println("SA = 2\u03C0rh+2\u03C0r\u00B2");
    }
    //Compute Surface Area Pyramid
    public static void SAPyramid(){
        System.out.println("Surface Area Pyramid");
        System.out.println("SA = (1/2)ps+B");
    }
    //Compute Surface Area Cone
    public static void SACone(){
        System.out.println("Surface Area Cone");
        System.out.println("SA = \u03C0rs+\u03C0r\u00B2");
    }
    //Compute Surface Area Sphere
    public static void SASphere(){
        System.out.println("Surface Area Sphere");
        System.out.println("SA = 4\u03C0r\u00B2");
    }
    //VOLUME
    //Compute Volume Rectangular Prism
    public static void VolumeRectangularPrism(){
        System.out.println("Volume Rectangular Prism");
        System.out.println("Volume = lwh");
    }
    //Compute Volume Right Prism
    public static void VolumeRightPrism(){
        System.out.println("Volume Right Prism");
        System.out.println("Volume = Bh");
    }
    //Compute Volume Cylinder
    public static void VolumeCylinder(){
        System.out.println("Volume Cylinder");
        System.out.println("Volume = \u03C0r\u00B2");
    }
    //Compute Volume Pyramid
    public static void VolumePyramid(){
        System.out.println("Volume Pyramid");
        System.out.println("Volume = (4/3)\u03C0r\u00B3");
    }
    //Compute Volume Cone
    public static void VolumeCone(){
        System.out.println("Volume Cone");
        System.out.println("Volume = (4/3)\u03C0r\u00B3");
    }
    //Compute Volume Sphere
    public static void VolumeSphere(){
        System.out.println("Volume Sphere");
        System.out.println("Volume = (4/3)\u03C0r\u00B3");
    }
    //ALGEBRA
}