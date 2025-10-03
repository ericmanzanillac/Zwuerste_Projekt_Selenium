package pages;

public class Principal {

    public static void main(String[] args) {
        int temperatura = 21;

        if(temperatura < 0){
            System.out.println("Me congelo");
        } else if (temperatura >= 0 && temperatura < 20) {
            System.out.println("Esta fresco");}
        else if (temperatura >= 20 && temperatura <= 24){
            System.out.println("Esta agradable");}
        else {
            System.out.println("Hace calor");
        }

        //operador ternario
        String mensaje = (temperatura < 0)? "Me congelo" : (temperatura >= 0 && temperatura < 20)? "Esta freso" : "Esta lindo";
        System.out.println(mensaje);
    }

}
