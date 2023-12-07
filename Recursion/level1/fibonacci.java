package Recursion.level1;

public class fibonacci {
    public static int fibo(int s){
        
        if(s==1){
            return 0;
        }
        if(s==2){
            return 1;
        }
        
        return fibo(s-1)+fibo(s-2);
        
        
    }
    public static void main(String[] args) {
        int n = 9;
        for(int i =1; i<=n; i++){
            System.out.println(fibo(i)+" ");
        }
        
    }
}
