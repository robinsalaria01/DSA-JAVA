package array;

public class SecLarElem {
    public static void main(String[] args){
        
        int arr[]={3,7,6,2,9};
        
        int cmp=arr[0];

        int sn=arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>cmp){
                sn=cmp;
                cmp=arr[i];
            }
        }
            System.out.println("Fst Largest Num : "+cmp);
            System.out.println("Scnd Largest Numn: "+sn);
    }
}
