package pages;

public class Principal2 {
    public static void main(String[] args) {

        /*for(int i = 0; i < 5; i++){
            System.out.println("Valor de i= " + i);*/

        /*int contador = 0;
        while(contador < 5){
            System.out.println("Numero: " + contador);
            contador++;*/

        /*int contador = 0;
        do {
            System.out.println("Numero: " + contador);
            contador++;
        } while (contador < 5);*/

        /*for(int i = 0; i < 10; i++){
            if (i  == 5) {
                break;
            }
            System.out.println("Numero: " + i);
        }*/


        for(int i = 0; i < 10; i++){
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Este numero es impar: " + i);
        }
    }
}