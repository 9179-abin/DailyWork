import java.util.*;
import java.io.*;
public class Main
{
    public static int arr[][]= new int[10][];
    public static int ar[]=new int[25];
    public static int s=0,k=0,m=0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        
        boolean p=false;
        
        int j=0,i=1;
        Main ob=new Main();
        while(i<100)
        {
            p=ob.isPrime(i);
            if(p==true)
            {
                insert(i);
                j=j+1;
                i=i+1;
            }
            else{
                i=i+1;
            }
        }
        for(i=0;i<25;i++){
            System.out.println(ar[i]);
        }
    }
    boolean isPrime(int n) 
    {
        int c = 0;
        for(int i = 1; i<=n; i++)
        {
            if(n%i == 0)
                c++;
        }
        if(c == 2)
            return true;
        else
            return false;
    }
    public static void insert(int n)
    {
        if(n!=0 && s<25)
        {
            ar[s]=n;
            s=s+1;
            
        }
    }
    public static void assign(int i,int j,int z)
    {
        for(int p=z; ; )
        {
            for(int q=i; ; )
            {
                arr[p][q]=ar[i];
                System.out.println(arr[p][q]);
            }
        }
    }
}