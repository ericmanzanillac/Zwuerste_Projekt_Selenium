package pages;
public class programitaEric {
    public static void main(String[] args) {

        //Eres un Iluminador y necesitas encontrar los numeros de la suerte de tu hermano perdido//

        int[] numeroIluminador = {2, 5, 7, 17, 25, 52, 27};
        int i = 0;
        int [] num = {7,5};
        int numeroSuerte = numeroIluminador[i];

        for (int numSuerte : num) {
            if (numSuerte == 2 || numSuerte == 5 || numSuerte == 7) {
                System.out.println("Estas cerca de encontrar los numeros");

            } else {
                System.out.println("Todavia no");
            }


        }
    }
}
