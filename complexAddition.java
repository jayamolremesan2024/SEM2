import java.util.Scanner;

public class complexAddition 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        
System.out.println("\n NAME : JAYAMOL REMESAN \n REG NO :SJC22MCA-2031 \n DATE : 28-3-2023");
System.out.println("-----------OUTPUT---------");
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = input.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = input.nextDouble();

       
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = input.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = input.nextDouble();

     
        double realSum = real1 + real2;
        double imaginarySum = imaginary1 + imaginary2;

        
        System.out.println("The sum of the complex numbers is: " + realSum + " + " + imaginarySum + "i");

        input.close();
    }
}

