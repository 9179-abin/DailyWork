import java.util.*;
public class Daphne{
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in );
        boolean isEven=false, isOdd=false;
        System.out.println("Enter the array size:");
        int c=sc.nextInt();
        int a[]=new int[c];
		System.out.println("Enter the array elements:");
        for(int i=0;i<c;i++){
            a[i]=sc.nextInt();
        }
        for(int p=0;p<c;p++){
            if(a[p]%2==0){
                isEven=true;
            }
            else{
                isOdd=true;
            }
        }
		if(isEven && isOdd){
		    System.out.println("Daphne Array");
		    for(int i=0;i<c;i++){
                System.out.print(a[i]+" ");
            }  
		}
		else{
		    System.out.println("Not Daphne Array");
		    for(int i=0;i<c;i++){
                System.out.print(a[i]+" ");
            }  
		}
	}
}