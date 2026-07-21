public class SwapWithout3rdVari {
    public static void main(String[] args){
        int a=10;
        int b=27;
        a = b-a;
        b = b - a;
        a = b + a;
        System.out.println("a : "+a);
        System.out.print("b : "+b);
    }
    
}
