package Recursion.level3;

public class totalPathInMaze {

    public static int countPath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 || j == m){
            return 1;
        }
        //moveDownwards 
        int downPaths = countPath(i+1, j, n, m);

        //moveRightwards
        int rightPaths = countPath(i, j+1, n, m);

        return downPaths+rightPaths;
        
    }
    public static void main(String[] args) {
        int n = 4, m = 4;
        int totalPaths = countPath(0, 0, n, m);
        System.out.println(totalPaths);
        
    }
}
