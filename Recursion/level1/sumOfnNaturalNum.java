package Recursion.level1;

public class sumOfnNaturalNum {

    public static void printSum(int a, int b, int sum){
          
        if(a==b){
           sum += a;
            System.out.println(sum);
            return;
        }
        sum +=a;     
        printSum(a+1, b, sum);  
    }

    public static void main(String args[]){
        int a = 1;
        int b = 10;
        int s = 0;

       printSum(a, b, s);

       System.out.println(s);
    }
    
}
