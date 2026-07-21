package array;

import java.util.Scanner;

public class arrSmalNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[]= {2,3,1,8,4};
        int n = arr.length;
        int cmp=arr[0];
        for(int i=0; i<n; i++){
                if (cmp>=arr[i]){
                    cmp=arr[i];
                }
        }
        System.out.println(cmp);
        sc.close();
    }
}   