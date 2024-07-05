import java.util.*;
public class noGuessing{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber=0;
        int myNumber=(int)(Math.random()*100);
        do{
            System.out.println("Guess my number:");
            userNumber=sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("Yess...CORRECT NUMBER");
                break;
            }else if(userNumber> myNumber){
                System.out.println("your no. is too large");
            }else{
                System.out.println("your no is small");
            }
        }while(userNumber >=0);
        System.out.println("my no. was:");
        System.out.println(myNumber);
    }
    
}
