package gcd;

import java.util.Scanner;

/**
 * Title: Gcd
 * Class: 3CHIF
 * @author Stephan Do
 * Description: The program calculate the gcd of two numbers.
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    

        int b;
        
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();
        
        gcdEucleian(num1, num2);
        gcdPrimeFactors(num1, num2);
    }
    public static void gcdPrimeFactors(int a, int b){

        int gcd = 1;
        
        for(int i = 1; i <= a && i <= b; ++i){
            if(a % i==0 && b % i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);  
    }
    public static void gcdEucleian(int a, int b){
        
        if(b == 0){
            System.out.println("The gcd is " + a);
        }
        else{
            gcdEucleian(b, a%b);
        } 
    }
}
