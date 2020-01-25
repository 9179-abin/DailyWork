package basics;
import java.util.*;
public class Factorial {
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int num=0;
        System.out.println("Enter range: ");
        num=sc.nextInt();
        long d = fact(num);
        System.out.println("Factorial of " + num + " = " + d);
    }
    public static long fact(int num)
    {
        if (num >= 1)
            return num * fact(num - 1);
        else
            return 1;
    }
}
