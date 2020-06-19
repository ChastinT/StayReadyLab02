package com.codedifferently;

public class SciCalculator extends Calculator
{
    double memory;
    String unitMode = "Radians";
    String displayMode = "Binary";

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
    public void storeMemory()
    {
        memory = sum;

    }

    public void resetMemory()
    {
        memory = 0.0;

    }
    
    public void displayMemory()
    {
        sum = memory;
        displaySum();
    }

    //Trig Operations

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


}