package Recursion.level1;

public class numbrev {
    public static void printNum(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        printNum(num-1);
        
    }
    public static void main(String args[]){

        int n = 9;

        printNum(n);
    }
    
}
