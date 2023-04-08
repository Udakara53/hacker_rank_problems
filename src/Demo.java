import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>() {{
                add(11);
                add(2);
                add(4);
            }});
            add(new ArrayList<Integer>() {{
                add(4);
                add(5);
                add(6);
            }});
            add(new ArrayList<Integer>() {{
                add(10);
                add(8);
                add(-12);
            }});
        }};

        int dia=0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < i+1; j++) {
                dia += arr.get(i).get(j) - arr.get(i).get(arr.size()-1 - j);
            }
        }
        System.out.println(dia>0?dia:(-1*dia));

    }

}
