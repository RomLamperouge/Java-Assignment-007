import java.util.Scanner;

public class MyMath {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter second number: ");
        int n2 = s.nextInt();

        while(n1!=n2)
        {
            if(n1>n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        }
        System.out.printf("GCF is: " +n2);
    }
}