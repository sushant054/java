import java.util.*;

public class even {
    public static void oddOrEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even");
        
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String args []){
        oddOrEven(5);
        oddOrEven(2);
    }
    
}
