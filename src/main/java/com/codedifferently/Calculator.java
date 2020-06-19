package com.codedifferently;

public class Calculator 
{
    public double sum = 0.0;
    public boolean isError;


    public Calculator()
    {

    }
    //Display Methods
  public void displaySum()
    {
        if(Double.isNaN(sum) == true)
        {
          System.out.println("Err");
        }
        else
        {
        System.out.println(sum);
        }
    }
 
    public void clear()

    {
        sum = 0.0;
        displaySum(); 
    }

  
    // Base Operations, created int and double arguments for easier input
    public void add(double adder)
    {
            sum += adder;
            displaySum();
    }
  
    
    public void subtract(double subtracter)
    {
            sum -= subtracter;
            displaySum();
    }

    
    public void multiply(double multiplier)
    {
            sum = sum * multiplier;
            displaySum();
    }
    
    
    public void divide(double divider)
    {
        sum = sum /  divider;
            displaySum();
    }

    //Exponential Operations

    public void square()
    {
        sum = Math.pow(sum, 2);
        displaySum();
    }

    public void sqRoot()
    {
        sum = Math.sqrt(sum);
        displaySum();
    }

    public void exponential(double exponent)
    {
        sum = Math.pow(sum, exponent);
        displaySum();
    }
    
   //Sign Operations

   public void inverse()
   {
       sum = 1/sum;
   }

   public void switchSign()
   {
       sum = -1 * sum;
   }

 


}