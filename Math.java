//Imports
import static java.lang.System.exit;
import java.util.Scanner;

import MyClasses.Area;
import MyClasses.SurfaceArea;
import MyClasses.Perimeter;
import MyClasses.Volume;

import static java.lang.Math.*;
//Class Begin 
class Math{
    public static void main(String args []){
        menu();    
    }
    //MENUS===============================
    public static void menu(){
        Area myArea = new Area();
        SurfaceArea mySurfaceArea = new SurfaceArea();
        Perimeter myPerimeter = new Perimeter();
        Volume myVolume = new Volume();
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
                    myArea.areaMenu(menuSelection);
                    break;
                case 2: 
                    myPerimeter.perimeterMenu(menuSelection);
                    break;
                case 3: 
                    mySurfaceArea.SAMenu(menuSelection);
                    break;
                case 4: 
                    myVolume.volumeMenu(menuSelection);
                    break;
                case 5: 
                    System.out.println("Exiting");
                    menuSelection.close();
                    exit(0);
                    break;
            }
        }
    }
}