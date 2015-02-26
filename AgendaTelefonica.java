import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    //mapa que almacena numeros de telefono en funcion de nombres como clave
    private HashMap<String,String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
    }

    /**
     * Metodo que permite añadir numeros de telefono a la agenda con un nombre como clave
     */
    public void enterNumber(String name, String number)
    {
        agenda.put(name,number);
    }

    /**
     * Metodo que devuelve un numero de la agenda en funcion del nombre que introduzcas
     * como parametro.Si no existe ese nombre devuelve null
     */
    public String lookupNumber(String name)
    {
        return agenda.get(name);
    }

    /**
     * Print all keys
     */
    public void printAllNames()
    {
        System.out.println(agenda.keySet());
    }
}
