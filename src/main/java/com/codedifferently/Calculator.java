package com.codedifferently;

public class Calculator 
{
    public double sum = 0.0;
    public boolean isError;


    public Calculator()
    {

    }
    //Display Methods

    /*Method to display the sum*/
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
 
    /*Method to clear the sum*/
    public void clear()

    {
        sum = 0.0;
        displaySum(); 
    }

  
    // Base Operations, created int and double arguments for easier input

    /*Input Method to add to the sum*/
    public void add(double adder)
    {
            sum += adder;
            displaySum();
    }
  
     /*Input Method to subtract sum*/
    public void subtract(double subtracter)
    {
            sum -= subtracter;
            displaySum();
    }

     /*Input Method to multiply the sum*/
    public void multiply(double multiplier)
    {
            sum = sum * multiplier;
            displaySum();
    }
    
     /*Input Method to divide the sum*/
    public void divide(double divider)
    {
        sum = sum /  divider;
            displaySum();
    }

    //Exponential Operations

     /* Method to square the sum on display*/
    public void square()
    {
        sum = Math.pow(sum, 2);
        displaySum();
    }

    /* Method to square root the sum on display*/
    public void sqRoot()
    {
        sum = Math.sqrt(sum);
        displaySum();
    }

    /*Input Method to square  the sum on display by the input*/
    public void exponential(double exponent)
    {
        sum = Math.pow(sum, exponent);
        displaySum();
    }
    
   //Sign Operations

   /*Inverses the sum on display*/
   public void inverse()
   {
       sum = 1/sum;
       displaySum();
   }

   /*Switches the sums sign*/
   public void switchSign()
   {
       sum = -1 * sum;
       displaySum();
   }

 


}