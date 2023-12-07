package Recursion.level2;

public class towerofhanoi {
    public static void hanoi(int n, String source, String help, String dest ){
       if(n==1){
        System.out.println("transfer disk "+ n + " from "+ source +" to "+dest);
        return;
       }
       hanoi(n-1,source,dest,help);
       System.out.println("transfer disk "+ n + " from "+ source +" to "+dest);
       hanoi(n-1,help,source,dest);
    }
    public static void main(String args[]){
        int n = 4;
        hanoi(n,"S","H","D");

      
    }
    
}
