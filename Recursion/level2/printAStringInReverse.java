package Recursion.level2;

public class printAStringInReverse {
    public static void reverse(String h, int idx){
        if(idx==0){
            System.out.print(h.charAt(idx));
            return;
        }
        System.out.print(h.charAt(idx));
        reverse(h,idx-1);


    }

    public static void main(String[] args) {
        String name = "manish";
        reverse(name,name.length()-1);
        
    }
    
}
