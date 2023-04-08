import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static int b;
    static int h;
    static {
        Scanner scn = new Scanner(System.in);
        b = scn.nextInt();
        h = scn.nextInt();

    }

    public static void main(String[] args) {
        if(b<0 || h<0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(b*h);
        }
    }

}
