
import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=1; scanner.hasNext(); i++){
            System.out.println(i+" "+scanner.nextLine());
        }
    }
}
/*Hello world
I am a file
Read me until end-of-file.*/