package Recursion.level1;


public class factorial {

    public static int fact (int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return n*fact(n-1);
    }
    public static void main(String[] args) {

        int n = 3;
        int c = fact(n);
        System.out.println(c);
        
    }
    
}
