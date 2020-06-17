package com.codedifferently;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import junit.framework.Assert;


public class CalculatorTest 
{
    
     @Test
    public void DisplayTest()
    {
        //Given
        Calculator calc = new Calculator();
        double expectedDouble = 0;

        //When 
       double actualDouble =  calc.sum;
        

        //Then
        if (expectedDouble == actualDouble)
        {
            calc.displaySum();
        }
        else
        {
            System.out.println("This is false");
        }
        
    }


    @Test
    public void ClearTest()
    {
    //Given
    Calculator calc = new Calculator();

    //When 
    calc.sum = 50;
    calc.displaySum();

    //Then
        calc.clear();
      if (calc.sum == 0)
      {
            System.out.println("Clear works");
            calc.displaySum();
      }
      else
      {
        System.out.println("Clear doesn't work");
      }

       
        
    }

    @Test
    public void errorTest()
    {
          //Given
          Calculator calc = new Calculator();
 
  
          //When 
         calc.divide(0);
          
  
          //Then
          if (Double.isNaN(calc.sum) == true)
          {
              System.out.println("Error occurred");
          }
          else 
          {
              System.out.println("Error did not occur");
          }
         
    }

    //Basic Operations Test

    @Test
    public void AddTest()
    {
        //Given
        Calculator calc = new Calculator();
        //When
        double expectedDouble = 6;
        calc.add(6);
        double actualDouble = calc.sum;
        //Then
    
        Assert.assertEquals(expectedDouble, actualDouble);

    }
   
    @Test
    public void SubTest()
    {
      //Given
      Calculator calc = new Calculator();
      //When
      double expectedDouble = -2;
      calc.subtract(2);
      double actualDouble = calc.sum;
      //Then
  
      Assert.assertEquals(expectedDouble, actualDouble);
    }
    
    @Test
    public void MultiTest()
    {
      //Given
      Calculator calc = new Calculator();
      //When
      double expectedDouble = 10;
      calc.add(2.5);
      calc.multiply(4);
      double actualDouble = calc.sum;
      //Then
  
      Assert.assertEquals(expectedDouble, actualDouble);
    }
    
    @Test
    public void DivideTest()
    {
         //Given
      Calculator calc = new Calculator();
      //When
      double expectedDouble = 5;
      calc.add(10);
      calc.divide(2);
      double actualDouble = calc.sum;
      //Then
  
      Assert.assertEquals(expectedDouble, actualDouble);
    }

    //Exponential Test

    @Test
    public void squareTest()
    {
                 //Given
      Calculator calc = new Calculator();
      //When
      double expectedDouble =  25;
      calc.add(5);
      calc.square();
      double actualDouble = calc.sum;
      //Then
  
      Assert.assertEquals(expectedDouble, actualDouble);
    }

    @Test
    public void squareRootTest()
    {
                 //Given
      Calculator calc = new Calculator();
      //When
      double expectedDouble =  5;
      calc.add(25);
      calc.sqRoot();
      double actualDouble = calc.sum;
      //Then
  
      Assert.assertEquals(expectedDouble, actualDouble);
    }

    //Sign Tests

    @Test
    public void InverseTest()
    {
    //Given
      Calculator calc = new Calculator();
      
      //When
      double expectedDouble =  .2;
      calc.add(5);
      calc.inverse();
      double actualDouble = calc.sum;
      
      //Then
  
      Assert.assertEquals(expectedDouble, actualDouble);
    }

    @Test
    public void switchSignTest()
    {
    //Given
      Calculator calc = new Calculator();
      
      //When
      double expectedDouble =  5;
      calc.subtract(5);
      calc.switchSign();
      double actualDouble = calc.sum;
      
      //Then
  
      Assert.assertEquals(expectedDouble, actualDouble);
    }
   
   
}