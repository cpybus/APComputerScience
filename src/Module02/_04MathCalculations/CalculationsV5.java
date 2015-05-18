package Module02._04MathCalculations;

/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * ©FLVS 2007
 * @author Bill Jordan
 * @version 01/19/07
 */


public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        // Addition
        int inum1 = 4;
        int inum2 = 8;
        double dnum1 = 23.51;
        double dnum2 = 8.9325;
        System.out.println("Addition");
        System.out.print(inum1 +" Plus " + inum2 + " Equals: ");
        System.out.println(inum1 + inum2);
        System.out.print(dnum1 +" Plus " + dnum2 + " Equals: ");
        System.out.println(dnum1 + dnum2);
        System.out.println();
        
        // Subtraction
        inum1 = 9;
        inum2 = 33;
        dnum1 = 98.6;
        dnum2 = 47.0038;
        System.out.print(inum1 +" Minus " + inum2 + " Equals: ");
        System.out.println(inum1 - inum2);
        System.out.print(dnum1 +" Minus " + dnum2 + " Equals: ");
        System.out.println(dnum1 - dnum2);
        System.out.println();
        
        // Multiplication
        inum1 = 15;
        inum2 = 3;
        int inum3 = 201;
        dnum1 = 3.14;
        dnum2 = 5.0;
        double dnum3 = 5.0;
        System.out.println("Multiplication");
        System.out.print(inum1 + " Times " + inum2 + " Times " + inum3 + " Equals: ");
        System.out.println(inum1 * inum2 * inum3);
        System.out.print(dnum1 + " Times " + dnum2 + " Times " + dnum3 + " Equals: ");
        System.out.println(dnum1 * dnum2 * dnum3);
        System.out.println();
        
        // Division
        inum1 = 48;
        inum2 = 8;
        dnum1 = 212.0;
        dnum2 = 32.0;
        System.out.println("Division");
        System.out.print(inum1 +" / " + inum2 + " Equals: ");
        System.out.println(inum1 / inum2);
        System.out.print(dnum1 +" / " + dnum2 + " Equals: ");
        System.out.println(dnum1 / dnum2);
        System.out.println();
         
        // Modulus operator
        inum1 = 23;
        inum2 = 15;
        dnum1 = 3298.7;
        dnum2 = 243.1;
        System.out.println("Modulus");
        System.out.print(inum1 +" % " + inum2 + " Equals: ");
        System.out.println(inum1 % inum2);
        System.out.print(dnum1 +" % " + dnum2 + " Equals: ");
        System.out.println(dnum1 % dnum2);
        System.out.println();
        
        //Mixed
        inum1 = 65;
        inum2 = 54;
        inum3 = 3;
        int inum4 = 54;
        dnum1 = 7.5;
        dnum2 = 5.3;
        dnum3 = 84.4;
        double dnum4 = 56.4783920;
        System.out.println("Mixed");
        System.out.print(inum1 + " * " + inum2 + " / " + inum3 + " - " + inum4 + " Equals: ");
        System.out.println(inum1 * inum2 / inum3 - inum4);
        System.out.print(dnum1 + " % " + dnum2 + " + " + dnum3 + " * " + dnum4 + " Equals: ");
        System.out.println(dnum1 % dnum2 + dnum3 * dnum4);
        System.out.println();
               
    } // end of main method
} // end of class