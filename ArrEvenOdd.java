package array;
import java.util.Scanner;
public class ArrEvenOdd {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Size Of Array");
        int i = sc.nextInt();

        int arr[]=new int[i];

        int l = arr.length;

        for(int k=0; k<l; k++){
            System.out.print(k + " Element : ");
            arr[k]=sc.nextInt(); 
        }
        System.out.println("Even Nums");

        for(int k=0; k<l; k++){
            if(arr[k]%2==0){
                System.out.print(arr[k]+",");
            }
        }
        System.out.println("Odd Nums");
        
        for(int k=0; k<l; k++){
            if(arr[k]%2==1){
                System.out.print(arr[k]+",");
            }
        }
        sc.close();
    }
    
}
