package boletin.pkg22;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author galle
 */
public class Metodos {
    
    
    public void engadir (String nombreFich){
        FileWriter archivo = null;
        PrintWriter escribir = null;
        try {
            archivo = new FileWriter (nombreFich,true);
            escribir = new PrintWriter(archivo);
            Atributos objA = new Atributos ();
            
            escribir.append(objA.toString());
            escribir.append("\n");
        } catch (IOException ex) {
            System.out.println("error al añadir" + ex.getMessage());
        } finally {
            escribir.close();
        }
    }
}
