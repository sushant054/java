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
    //finding ith bit..
    public static int getIthBit(int n, int i)
    {
        int bitmask =1 << i;
        if((n & bitmask)==0)
        {
            return 0;
        }else
        {
            return 1;
        }
    }
    //set ith bit..
    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    //clear ith bit..
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    //update ith bit
    public static int updateIthBit(int n, int i,int newBit){
        if(newBit == 0){
            return clearIthBit(n, newBit);
        }
        else{
            return setIthBit(n, newBit);
        }
    
    //
    //  n=clearIthBit(n,i);
    // int bitMask=newBit<<i;
    // return n | bitMask;
    }
    public static void main(String args []){
       // oddOrEven(5);
       //10 in binary [1010]
        System.out.println(getIthBit(10,2));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));

    }
}



