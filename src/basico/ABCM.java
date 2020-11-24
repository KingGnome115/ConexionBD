package basico;

import com.mysql.cj.Query;
import java.sql.Connection;
import java.util.ArrayList;
import poo.bd.Querys;

/**
 *
 * @author Kevin
 */
public class ABCM
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        int id = 0;
        String item2 = "Prueba";
        float item3 = (float) 1.2;
        
        int id2 = 0;
        String item22 = "Prueba2";
        float item32 = (float) 2.2;
        
        int id3 = 0;
        String item23 = "Prueba3";
        float item33 = (float) 3.2;

        //Altas
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "EjemploTabla", "" + id + ",'" + item2 + "'," + item3 + "");
            sql.Insertar(con, "EjemploTabla", "" + id2 + ",'" + item22 + "'," + item32 + "");
            sql.Insertar(con, "EjemploTabla", "" + id3 + ",'" + item23 + "'," + item33 + "");
            ManipulaBD.desconecta(con);
            System.out.println("Dato insertado");
        }

        //Bajas
        Connection con2 = ManipulaBD.conecta();
        if (con2 != null)
        {
            Querys sql = new Querys();
            sql.Delete(con2, "EjemploTabla", "item2", "'" + item22 + "'");
        }
        ManipulaBD.desconecta(con2);

        //Consultas
        Connection con3 = ManipulaBD.conecta();
        if (con3 != null)
        {
            Querys sql = new Querys();
            ArrayList<Objeto> ap = ManipulaBD.cargarO(sql.Seleccion(con3, "*", "EjemploTabla", "id=" + 1 + ""));
            ManipulaBD.desconecta(con3);
            if (ap != null)
            {
                System.out.println(ap.get(0).desp());
            } else
            {
                System.out.println("No se encontro el dato");
            }
        }

        //Modificaciones
        Connection con4 = ManipulaBD.conecta();
        if (con4 != null)
        {
            Querys sql = new Querys();
            ArrayList<Objeto> ap = ManipulaBD.cargarO(sql.Seleccion(con4, "*", "EjemploTabla", "id=" + 3 + ""));
            if (ap != null)
            {
                sql.Modificar(con4, "EjemploTabla", "id", "2", "id=3");
            }
        }
    }
    
}
