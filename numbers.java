public class numbers {
    public static void main(String[] args) {
        int n=5;
        int number=1;
    //     for(int i=1;i<n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }

/* Output:
1 
1 2 
1 2 3 
1 2 3 4 
 */
//Floyd's triangle
//    for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(number +" ");
//         number ++;
//     }
//     System.out.println();
//    }

//0-1 Triangle
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        int sum=i+j;
        if(sum % 2 == 0){
            System.out.print("1 ");
        }else{
            System.out.print("0 ");
        }
    }
    System.out.println();
}
/* Output:
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */



    }

}
