import java.util.Scanner;

public class average {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first no:");
    double num1= sc.nextDouble();
    System.out.println("Enter the second no:");
    double num2= sc.nextDouble();
    System.out.println("Enter the third no:");
    double num3=sc.nextDouble();

    double avg= calAvg(num1, num2, num3);
    System.out.println("The avg of the three numbers is :"+avg);
 }   
 public static double calAvg(double a, double b, double c){
    return(a+b+c)/3;
 }
}



 