
package loopingbersarang;


public class soalNo4 {
    public static void main(String[] args) {
        for (int j =1; j<= 10; j=j+2){
        for(int k=8; k >= j; k=k-2) System.out.print(" "); 
        for(int i=1; i<=j; i++)System.out.print("*");
        System.out.println();
    }
    
}
}
