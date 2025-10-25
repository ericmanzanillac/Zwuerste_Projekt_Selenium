import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {
//    @Test
//
//    public void regular(){
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Eric");
//        names.add("Helena");
//        names.add("Dario");
//        names.add("Sogbi");
//        names.add("Camacho");
//        int count = 0;
//
//        for (String actual : names) {
//            if (actual.startsWith("A")) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
/*    @Test
    public void streamFilter(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Eric");
        names.add("Helena");
        names.add("Dario");
        names.add("Sogbi");
        names.add("Camacho");

        Long c = names.stream().filter(s -> s.startsWith("E")).count();
        System.out.println(c);

        long d = Stream.of("Eric","Helena","Dario","Sogbi","Camacho").filter(s ->
        {
            return s.startsWith("H");
    }).count();
        System.out.println(d);

        //print all names of ArrayList
        names.stream().filter(s -> s.length()>5).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length()>5).limit(1).forEach(s -> System.out.println(s));
    }
}*/

/*    @Test
    public void streamMap() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Eric");
        names.add("Helena");
        names.add("Dario");
        names.add("Sogbi");
        names.add("Camacho");

        //Print names which have a as a first letter, with uppercase and sorted
        List<String> names1 = Arrays.asList("Eric", "Elena", "Dario", "Sogbi", "Camacho");
        names1.stream().filter(s -> s.startsWith("E")).sorted().map(String::toUpperCase).forEach(System.out::println);

        //Merging 2 different list
        Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
        //newStream.sorted().forEach(s -> System.out.println(s));
        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Eric77"));
        System.out.println(flag);
        Assert.assertTrue(flag);
    }*/

    @Test
    public void streamCollect() {
        /*List<String> ls = Stream.of("Eric", "Elena", "Dario", "Sogbi", "Camacho").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(ls.get(0));*/

        List<Integer> values = Arrays.asList(3,2,12,15,17,12,17,2,15);
        //Print unique numbre from this array, sort the array
        //values.stream().distinct().forEach(s -> System.out.println(s));
        //3rd index
        List<Integer> list =  values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(list.get(2));
    }
}

