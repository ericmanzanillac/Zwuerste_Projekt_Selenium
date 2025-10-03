import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KoreJava2 {

    public static void main(String[] args) {

        //int[] arry = {1,2,3,4,5};

        ArrayList<String> a = new ArrayList<String>();
        a.add("Eric");
        a.add("Josue");
        a.add("Manzanilla");
        a.add("Careaga");
        System.out.println(a.get(1));

        for(int i = 0; i<a.size(); i++)
        {
            //System.out.println(a.get(i));
        }
        //System.out.println("**********");
        for (String val:a)
        {
            //System.out.println(val);
        }
        a.contains("Careaga");
        String[] name = {"Eric", "Josue", "Manzanilla", "Careaga"};
        List<String> nameArrayList = Arrays.asList(name);
        nameArrayList.contains("Josue");
    }
    }