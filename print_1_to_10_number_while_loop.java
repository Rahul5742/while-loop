import java.util.Scanner;
public class print_1_to_10_number_while_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("while loop:");
        System.out.println("Enter your number=");
        int a=sc.nextInt();
        while(a<=10){
            System.out.println(a);
            a++;
        }
    }
}
