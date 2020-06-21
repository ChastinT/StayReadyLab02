package com.codedifferently;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.IllegalFormatException;

import org.junit.Test;

import junit.framework.Assert;

public class SciCalculatorTest 
{
    /**
     * Rigorous Test :-)
     */

     //Memory Tests
    @Test
    public void memoryStoreTest()
    {
        //Given
        SciCalculator sciCalc = new SciCalculator();
       
        //When
        sciCalc.add(10);
        double expected = sciCalc.sum;
        
        sciCalc.storeMemory();
        double actual = sciCalc.memory;
        //Then

        Assert.assertEquals(expected, actual);

        
    }

    @Test
    public void memoryResetTest()
    {
        //Given
        SciCalculator sciCalc = new SciCalculator();
       
        //When
        sciCalc.add(10);
        double expected = 0;
        
        sciCalc.memory = 10;
        sciCalc.resetMemory();
        double actual = sciCalc.memory;
        //Then

        Assert.assertEquals(expected, actual);

        
    }

    @Test
    public void displayMemoryTest()
    {
        //Given
     
        SciCalculator sciCalc = new SciCalculator();
       
        //When
        sciCalc.add(5);
        sciCalc.storeMemory();
        double actual = sciCalc.memory;
        
        sciCalc.multiply(2.5);
        double expected = sciCalc.sum;
        //Then

        sciCalc.displaySum();
        sciCalc.displayMemory();

        
    }

    //Trig Functions Test
    @Test
    public void sineTest()
    { 
        //Given
        SciCalculator sciCalc  = new SciCalculator();
        double expected = Math.sin(5);

        //When
        sciCalc.add(5);
        sciCalc.sine();
        double actual = sciCalc.sum;

        //Then
        //Assert.assertEquals(expected, actual);
    }

    @Test
    public void cosineTest()
    { 
        //Given
        SciCalculator sciCalc  = new SciCalculator();
        double expected = Math.cos(5);

        //When
        sciCalc.add(5);
        sciCalc.cosine();
        double actual = sciCalc.sum;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tangentTest()
    { 
        //Given
        SciCalculator sciCalc  = new SciCalculator();
        double expected = Math.tan(4);

        //When
        sciCalc.add(4);
        sciCalc.tangent();
        double actual = sciCalc.sum;

        //Then
        Assert.assertEquals(expected, actual);
    }

    //Inverse Operations Test

    @Test
    public void inverseSinTest()
    { 
        //Given
        SciCalculator sciCalc  = new SciCalculator();
        double expected = Math.asin(.2);

        //When
        sciCalc.add(.2);
        sciCalc.inverseSin();
        double actual = sciCalc.sum;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inverseCosTest()
    { 
        //Given
        SciCalculator sciCalc  = new SciCalculator();
        double expected = Math.acos(.5);

        //When
        sciCalc.add(.5);
        sciCalc.inverseCos();
        double actual = sciCalc.sum;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inverseTanTest()
    { 
        //Given
        SciCalculator sciCalc  = new SciCalculator();
        double expected = Math.atan(.2);

        //When
        sciCalc.add(.2);
        sciCalc.inverseTan();
        double actual = sciCalc.sum;

        //Then
        Assert.assertEquals(expected, actual);
    }

    //Switch Test

    @Test
    public void switchModeTest()
    {
        //Given
        SciCalculator sciCalc  = new SciCalculator();
        String expected = "Degrees"; // In Degress
        //When
       
       
        //sciCalc.switchUnitsMode("Beetle Juice, Beetle Juice, Beetle Juice"); //Testing if its wrong
        sciCalc.switchUnitsMode("degrees"); //Testing taking lowercase String
        //sciCalc.switchUnitsMode();
        
       
        String actual = sciCalc.unitMode;
        //Then
        if (actual.equalsIgnoreCase(expected))
        {
            System.out.println("Eureka!!!, it works");
        }
        else
        {
            System.out.println("Press F to pay respect");
        }




    }

    @Test
    public void displayModeTest()
    {
         //Given
         SciCalculator sciCalc  = new SciCalculator();
         String expected = "Octal"; 
         //When
        
        sciCalc.switchDisplayMode("octal");
        sciCalc.add(744);

         
        
         String actual = sciCalc.displayMode;
         //Then
         if (actual.equalsIgnoreCase(expected))
         {
             System.out.println("Thank god, it works");
         }
         else
         {
             System.out.println("More work needs to be done");
         }
 
    }

    //Testing Custom Methods
    

    @Test

    public void displayImageTest() throws FileNotFoundException
    {
        try 
        {
            SciCalculator sciCalc = new SciCalculator();
            sciCalc.displayTextImage();
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("File not found try again");
        }
        catch (IllegalFormatException i)
        {
            System.out.println("Wrong file type use .txt");
        }
        catch(NullPointerException n)
        {
            System.out.println("No file was selected");
        }

        
  
    }

    @Test
    public void diceTest()
    {
        SciCalculator sciCalc = new SciCalculator();

       if (sciCalc.rollDice() > -1)
       {
           System.out.println("Cool it works");
       }
       else
       {
           System.out.println("Even i'm amazed it failed");
       }
      

        
    }




}
