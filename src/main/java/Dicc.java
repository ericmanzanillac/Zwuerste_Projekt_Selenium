import java.util.Hashtable;

class Mi_Diccionario
{
    public static void main(String[] args)
    {
        //Crear una instancia de un hashtable. Vamos a pasar dos tipos,
        //para el par Key:Value
        Hashtable<String,String> diccionario = new Hashtable<String,String>();

        //Método put()
        diccionario.put("Argentina", "Argentinos");
        diccionario.put("Mexico", "Mexicanos");

        //Método get()
        System.out.println("Valor para la key: "+ diccionario.get("Mexico"));

    }
}