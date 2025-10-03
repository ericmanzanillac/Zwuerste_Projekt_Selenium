public class KoreJava3 {
    public static void main(String[]args) {

        //String is an object - String literal
        String s = "Eric Josue Manzanilla Careaga";
        String s1 = "Eric Josue Manzanilla Careaga";
        String s5 = "Hello";

        //new - not literal version
        String s2 = new String("Wilkommen");

        String[] SplittedString = s.split(" ");
        System.out.println(SplittedString[0]);
        System.out.println(SplittedString[1]);
        System.out.println(SplittedString[2]);
        System.out.println(SplittedString[3]);
        System.out.println(SplittedString[1].trim());
        for(int i = s.length()-1; i>=0;i--)
        {
            System.out.println(s.charAt(i));
        }

    }
}