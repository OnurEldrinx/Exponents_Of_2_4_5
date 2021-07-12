import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int input;

        System.out.print("Please enter a number:");
        input = keyboard.nextInt();

        System.out.println("Exponents of 2\n--------------");
        for (int i=0;Math.pow(2,i)<=input;i++){

            System.out.println("2^"+i+" = "+Math.pow(2,i));

        }
        System.out.println("--------------\n");

        System.out.println("Exponents of 4\n--------------");
        for (int i=0;Math.pow(4,i)<=input;i++){

            System.out.println("4^"+i+" = "+Math.pow(4,i));

        }
        System.out.println("--------------\n");

        System.out.println("Exponents of 5\n--------------");
        for (int i=0;Math.pow(5,i)<=input;i++){

            System.out.println("5^"+i+" = "+Math.pow(5,i));

        }
        System.out.println("--------------");


    }
}
