package pages;

public class Principal3 {
    public static void main(String[] args){

        /*int[] numeros1;
        numeros1 = new int[5];

        int[] numeros2 = new int[5];

        System.out.println("Elementos de numeros1");
        for (int i=0; i<numeros1.length; i++){
            System.out.println(numeros1[1]);
        }*/

        int[] numeros3 = {0,1,2,3,4,5,6,7,8,9};

        int primerValor = numeros3[0];
        System.out.println(primerValor);
        System.out.println(numeros3[numeros3.length - 1]);

        /*int contador = 0; //Contador es cada item individual dentro del array de numeros3//
        while(contador < numeros3.length){
            System.out.println(numeros3[contador]);
            contador++;
        }*/

        int [][] tabla = new int[3][3]; //Las matrices empiezan en Y y luego en X//

        int[][] tablaValores = {
                {1,2,3},
                {14,23,43},
                {21,3,8}
        };
        int elementoTabla = tablaValores[1][2];
        System.out.println(elementoTabla);
    }
}