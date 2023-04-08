package java;

import java.util.*;

class SolutionForJavaLoop2{

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Required Times : ");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("Enter Value a : ");
            int a = in.nextInt();
            System.out.print("Enter Value b : ");
            int b = in.nextInt();
            System.out.print("Enter Value n : ");
            int n = in.nextInt();
            //int total=a;
            for (int j = 0; j < n; j++) {
                int ex=1;                       // ex means power
                for (int k = j; k > 0; k--) { // Generate the power
                    ex*=2;
                }
                a+=b*ex;
                System.out.print(a+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
/*Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/


