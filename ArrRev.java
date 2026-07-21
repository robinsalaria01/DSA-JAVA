package array;
/*Array ko reverse print */
import java.util.Scanner;
public class ArrRev {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int k=0; k<arr.length; k++){
            System.out.print(k + " Element : ");
            arr[k]=sc.nextInt(); 
        }

        for(int i=n-1; 0<=i ;i--){
            System.out.print(arr[i]+",");
        }
        sc.close();
    }
}
