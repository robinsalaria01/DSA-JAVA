package array;
import java.util.Scanner;
public class ArAvg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size Of An Array");
        int i = sc.nextInt();
        int arr[] = new int[i];
        int n = arr.length;
        int sum=0;
        for(int k = 0; k<=n-1; k++){
            System.out.print(k+" Element : ");
            arr[k]=sc.nextInt();
            
        }
        for (int val: arr){
            sum=sum+val;
        }
        int avg = sum/n;
        System.out.println(avg);
        sc.close();
    }
}
