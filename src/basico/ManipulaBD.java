package basico;

import java.sql.Connection;
import java.util.ArrayList;
import poo.bd.Conexion;

/**
 *
 * @author Kevin
 */
public class ManipulaBD
{

    private static Conexion con = new Conexion();

    public static Connection conecta()
    {
        try
        {
            return con.Conecta("Localhost:3306", "Ejemplo", "root","",2);
        } catch (Exception e)
        {
            System.out.println("No se pudo conectar a la bd");
            return null;
        }
    }
    
    public static void desconecta(Connection conn)
    {
        con.desconectar(conn);
    }
    
    public static ArrayList<Objeto> cargarO(ArrayList<Objeto> reg)
    {
        try
        {
            ArrayList<Objeto> v = new ArrayList<>();
            for (int i = 0; i < reg.size(); i+=3)
            {
                //
            }
            Objeto obj = new Objeto(0, "Hola", 0);
            v.add(obj);
            return v;
        } catch (Exception e)
        {
            System.out.println("Error al crear objetos");
            return null;
        }
    }

}
