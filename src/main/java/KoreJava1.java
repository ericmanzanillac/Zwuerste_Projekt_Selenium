public class KoreJava1 {

    public static void main(String[] args) {

        int myNum = 5;
        String name = "Eric Manzanilla";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum +" est is die Zahle in die myNum variable");

        //Arrays is a variable that can store multiple values
        int[] arry = new int [5];
        arry [0] = 1;
        arry [1] = 2;
        arry [2] = 3;
        arry [3] = 4;
        arry [4] = 5;

        int[] arry2 = {1,2,3,4,5};
        //System.out.println(arry2[2]);

        //For loop
        for(int i = 0; i<arry.length; i++)
        {
            System.out.println(arry[i]);
        }
        for(int i =0; i<arry2.length; i++)
        {
            System.out.println(arry2[i]);
        }
        String[] names = {"Eric", "Josue", "Manzanilla", "Carega"};
        for(int i=0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }

        for(String s: names)
        {
            System.out.println(s);
        }

        int[] arry3 = {1,2,3,4,5,6,7,8,98,12};

        for(int i=0; i<arry3.length; i++)
        {
            if (arry3[i] % 2 == 0)
            {
                System.out.println(arry3[i]);
                break;
            }
            else
            {
                System.out.println(arry3[i] + " estos no son multiplos de 2");
            }

        }
        }
    }
