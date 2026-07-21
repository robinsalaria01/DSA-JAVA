package array;

import java.util.Scanner;

public class ArElemFounf {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        int i=0;

        System.out.println("Enter Number to find : ");
        int n = sc.nextInt();
        
        boolean found = false;

        int arr[] = new int[5];

        for(int k=0; k<arr.length; k++){
            System.out.print(k + " Element : ");
            arr[k]=sc.nextInt(); 
        }

        for(i=0; i<arr.length; i++) {
            if(arr[i]==n){
                System.out.println("Found at index : "+i);
                found = true;
                break;
            }
        }
        if(!found){
           System.out.println("Not Found");;
        }
    }
    
}
