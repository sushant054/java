public class stars {
    public static void main(String[] args) {
        int n=4;
        int m=5;
//1.solid rectangle
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
/*
Output:--->
*****
*****
*****
*****
 */
//2.
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=m; j++){
    //         if(i == 1 || j == 1 || i == n || j == m){
    //             System.out.print("*");
    //         }else{
    //         System.out.print(" ");
    //      }
    //     }
    //     System.out.println();
    // }
/*
 output:
*****
*   *
*   *
*****
 */
//3. half pyramid
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print("*");
    //      }
    //     System.out.println();
    // }
/* output:

*
**
***
****

 */
 

//4.
// for(int i=n; i>=1;i--){
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
/*output:  
****
***
**
*
*/

//5.

// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
/* Output:
   *
  **
 ***
****
 */
//6. inverted half pyramid
// for(int i=n; i>=1; i--){
//     for(int j=1; j<i; j++){
//         System.out.print(" ");
//      }
//      //inner loop
//      for(int j=0;j<=n-i;j++){
//         System.out.print("*");
//      }
//     System.out.println();
// }
/* output:
   *
  **
 ***
****
here, 5th and 6th both have same output..
*/

}
}