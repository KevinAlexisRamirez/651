
package pkg651partidosfutbol;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
private static final String nombreArchivo = "partidos.txt";
    public static void main(String[] args) {
        ArrayList<partidosFutbol> partidos = new ArrayList<partidosFutbol>(); 
        File archivo = new File (nombreArchivo);
        Scanner s = null; 
        try{
            s = new Scanner(archivo);
            while(s.hasNextLine())
            {
            String linea = s.nextLine(); 
            String []cortarString= linea.split("::"); 
            
            //mapeo de array con objetos de la clase partidosFutbol
            partidosFutbol partido = new partidosFutbol(); 
            partido.setEquipoLocal(cortarString[0]);
            partido.setEquipoVisitante(cortarString[1]);
            partido.setGolesLocal(Integer.parseInt(cortarString[2]));
            partido.setGolesVisitante(Integer.parseInt(cortarString[3]));
            
            
            
            partidos.add(partido);
            }
            
        }catch(Exception e) {
            
            e.printStackTrace(); 
            
        }
       //partidos.forEach(System.out::println);
        System.out.println("<---------------Impresión de objeto antes de procesar---------->");
       Iterator<partidosFutbol> itPartidos = partidos.iterator(); 
       while(itPartidos.hasNext()){
           partidosFutbol partido = itPartidos.next();
           System.out.println(partido.getEquipoLocal()+" "+
                              partido.getEquipoVisitante()+" "+
                              partido.getGolesLocal()+" "+
                              partido.getGolesVisitante());
       }
        System.out.println("");
        
        
        //Examinar partidos empatados
        itPartidos = partidos.iterator(); 
        while(itPartidos.hasNext()){
            partidosFutbol partido = itPartidos.next();
            if(partido.getGolesLocal()!= partido.getGolesVisitante()){
                itPartidos.remove(); 
            }
        }
        
        System.out.println("<--------------------Imprimir partidos que sean empate------------------->");
        itPartidos = partidos.iterator(); 
       while(itPartidos.hasNext()){
           partidosFutbol partido = itPartidos.next();
           System.out.println(partido.getEquipoLocal()+" "+
                              partido.getEquipoVisitante()+" "+
                              partido.getGolesLocal()+" "+
                              partido.getGolesVisitante());
       }
    }
    
}
