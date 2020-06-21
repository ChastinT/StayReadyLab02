package com.codedifferently;

import java.util.Random;
import java.util.Scanner;
import java.io.File;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
public class SciCalculator extends Calculator
{
    double memory; //To store the sum
    String unitMode = "Radians"; //String to change modes between Radian and Degrees
    String displayMode = "Binary"; //Strig to change display output

    /*SciCalclators display sum method that Displays the output differently depending on displayMode*/
    public void displaySum()
    {
        String result;
        System.out.println("Display Mode: "+displayMode+" \n"+"Unit Mode: "+unitMode);
        if (displayMode.equalsIgnoreCase("Binary"))
        {
           result = Long.toBinaryString((long)sum);
           System.out.println(result);
         
        }
        else
        if (displayMode.equalsIgnoreCase("Octal"))
        {
            result = Long.toOctalString((long)sum);
            System.out.println(result);
        }
        else
        if (displayMode.equalsIgnoreCase("Decimal"))
        {
            super.displaySum();
        }
        else
        if (displayMode.equalsIgnoreCase("Hexidecimal"))
        {
            result = Long.toHexString((long)sum);
            System.out.println(result);
        }
        System.out.println("");
    }

    //Memory Operations

    /*Method to store output to a memory*/
    public void storeMemory()
    {
        memory = sum;

    }

    /*Reset memory value*/
    public void resetMemory()
    {
        memory = 0.0;

    }
    
    /*Display memory and overwrite the sum*/
    public void displayMemory()
    {
        sum = memory;
        displaySum();
    }

    //Trig Operations

    /*Performs sine function with the sum on display*/
    public void sine()
    {
        if(unitMode.equals("Radians"))
        {
        sum = Math.sin(sum);
        displaySum();
        }

        else
        if(unitMode.equals("Degrees"))
        { 
        sum = Math.sin((sum * Math.PI) / 180);
        displaySum();
        }
    }
   
    /*Performs cosine function with the sum on display*/
    public void cosine()
    {
        if(unitMode.equals("Radians"))
        {
        sum = Math.cos(sum);
        }
        else
        if(unitMode.equals("Degrees"))
        { 
        sum = Math.cos((sum * Math.PI) / 180);
        }

        displaySum();
    }
    
    /*Performs tangent function with the sum on display*/
    public void tangent()
    {
        if(unitMode.equals("Radians"))
        {
        sum = Math.tan(sum);
        }
        else
        if(unitMode.equals("Degrees"))
        { 
        sum = Math.tan((sum * Math.PI) / 180);
        }

        displaySum();
    }


    /*Performs inverse sin function with the sum on display*/
    public void inverseSin()
    {
        if(unitMode.equals("Radians"))
        {
        sum = Math.asin(sum);
        }
        else
        if(unitMode.equals("Degrees"))
        { 
        sum = Math.asin((sum * Math.PI) / 180);
        }

        displaySum();
    }
   
    /*Performs inverse cosine function with the sum on display*/
    public void inverseCos()
    {
        if(unitMode.equals("Radians"))
        {
        sum = Math.acos(sum);
        }
        else
        if(unitMode.equals("Degrees"))
        { 
        sum = Math.acos((sum * Math.PI) / 180);
        }

        displaySum();
    }
    
    /*Performs inverse tangent function with the sum on display*/
    public void inverseTan()
    {
        if(unitMode.equals("Radians"))
        {
        sum = Math.atan(sum);
        }
        else

        if(unitMode.equals("Degrees"))
        { 
        sum = Math.atan((sum * Math.PI) / 180);
        }

        displaySum();
    }

    //Switch Modes

    //Switch Units

    /*Method to switch Unit mode between Radians and Degrees*/
    public void switchUnitsMode()
    {
        if (unitMode.equalsIgnoreCase("Radians"))
        {
            unitMode = "Degrees";
          
        }
        else
        if (unitMode.equalsIgnoreCase("Degrees"))
        {
            unitMode = "Radians";
            
        }
        System.out.println("Unit Mode changed to: "+unitMode);
    }

    /*Input method to switch Unit mode between Radians and Degrees*/
    public void switchUnitsMode(String mode)
    {
    
        if (!(mode.equalsIgnoreCase("Degrees")  || mode.equalsIgnoreCase("Radians")))
        {
                System.out.println("That's not a mode");
        }
        else
        {
           
           unitMode = mode;  
           System.out.println("Unit Mode changed to: "+unitMode);
        }
    }

    // Switch Display Mode Operations

    /*Method to Switch Display Mode*/
    public void switchDisplayMode()
    {
     if (displayMode.equalsIgnoreCase("Binary"))
     {
        displayMode = "Octal";
     }
     else
     if (displayMode.equalsIgnoreCase("Octal"))
     {
        displayMode = "Decimal";
     }
     else
     if (displayMode.equalsIgnoreCase("Decimal"))
     {
        displayMode = "Hexadecimal";
     }
     else
     if (displayMode.equalsIgnoreCase("Hexadecimal"))
     {
        displayMode = "Binary";
     }

     System.out.println("Display Mode changed to: "+unitMode);
     
    }

    /*Input Method to Switch Display Mode*/
    public void switchDisplayMode(String mode)
    {
    
        if (!(mode.equalsIgnoreCase("Binary")  || mode.equalsIgnoreCase("Octal") || !(mode.equalsIgnoreCase("Decimal")  || mode.equalsIgnoreCase("Hexidecimal"))))
        {
                System.out.println("That's not a mode");
        }
        else
        {
           
           displayMode = mode;  
           System.out.println("Mode changed to: "+displayMode);
        }
    }

    //Custom Methods

    /*This method outputs a text picture from a .txt file, if you want a picture to be converted go to this site
    https://manytools.org/hacker-tools/convert-images-to-ascii-art/ */
    public void displayTextImage() throws FileNotFoundException
    {
        //Select a .txt file from a folder, for easier use put the file in your pictures folder
        //Change the input argument inside the JFileChooser to where you put the images
        JFileChooser chooser = new JFileChooser("C:\\Pictures");
        chooser.showSaveDialog(null); 
        File file = chooser.getSelectedFile();
        
        //String to check if file selected is the correct type, will check last of string)
        String checkFileIsText = file.getName().substring(file.getName().indexOf("."));
        if (checkFileIsText.equals(".txt"));
        {
            Scanner scan = new Scanner(file);
            try 
            {
                while (scan.hasNextLine())
                    {
                        System.out.println(scan.nextLine());
                    }
                    scan.close();
            } 

            catch(NullPointerException n)
            {
                System.out.println("No file was selected");
            }

        }

        if (!(checkFileIsText.equals(".txt"))) //To check if file is correct type
        {
            System.out.println("Wrong file type use .txt");
        }
}
       


    /*Method to simulate rolling a single dice, does nothing other than that*/
    public int rollDice()
    {
        Random rand = new Random();
        int result = rand.nextInt(6)+1;

        System.out.println("You rolled: "+result+"\n"+"Sadly thats it");

        return result;
    }

  




}