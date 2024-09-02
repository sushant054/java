import java.util.*;
public class operations {
    public static void main(String[] args) {
        int n=5;
        //5 in binary 0101
        int pos=1;
        int bitmask= 1<<pos;
        //to get bit
        if((bitmask & n)==0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bot was one");
        }
        //set bit 
        // int newNumber= n | bitmask;
        // System.out.println("NO after setting bit: "+newNumber);
        //here 5---->7 we changed 1st position..
        //clear ith bit
        // int bitMask=~(1<<pos);
        // int newNo= bitMask & n;
        // System.out.println("new no after clear pos.. bit: "+newNo);

        //update
        Scanner sc = new Scanner(System.in);
        System.out.println("operation: enter 0 for set and enter 1 for clear");
        int operation =sc.nextInt();
        if(operation==1){
            //clear..
            int bitMask=~(1<<pos);
        int newNo= bitMask & n;
        System.out.println("new no after clear pos.. bit: "+newNo);
        }else
        {//set
            int newNumber= n | bitmask;
            System.out.println("NO after setting bit: "+newNumber);
        }


    }
}
