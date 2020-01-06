import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("Enter the operator:");
        char c = sc.next().charAt(0);
        calculate calc = new calculate();
        float v = calc.cal(a,b,c);
        System.out.println("Ans:"+v);
    }
}
class calculate{
    public static float cal(int a, int b, char c){
        float e=0;
        switch(c){
            case '+':
                e=a+b;
                break;
            case '-':
                e=a-b;
                break;
            case '*':
                e=a*b;
                break;
            case '/':
                e=a/b;
                break;
            default:
                break;
        }
        return e;
    }
}