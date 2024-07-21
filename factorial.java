import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("given number fectorial:");

        System.out.print("Enter factorial number = ");

        int Factorial=sc.nextInt();

        int n=1;
        int sum=1;
        while (sum<=Factorial){

            n *=sum;

            System.out.print(sum+" x ");

            sum++;
        }
        System.out.println(" = "+n);

    }
}