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
            return con.Conecta("Localhost:3306", "Ejemplo", "root", "", 2);
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

    public static ArrayList<Objeto> cargarO(ArrayList<Object> reg)
    {
        ArrayList<Objeto> v = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 3)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS.trim());
                    String item2 = ((String) reg.get(i + 1)).trim();
                    String item3S = ((String) reg.get(i + 2)).trim();
                    float item3 = Float.valueOf(item3S);
                    Objeto obj = new Objeto(id, item2, item3);
                    v.add(obj);
                }
            }
            return v;
        } catch (Exception e)
        {
            System.out.println("Error al crear objetos");
            if (v != null)
            {
                return v;
            } else
            {
                return null;
            }
        }
    }

}
