
package personas;

import java.util.ArrayList; 
public class ArrayListPersonas {

    
    public static void main(String[] args) {
    ArrayList <persona> listapersonas = new ArrayList<>();     
    listapersonas.add(new persona(1,"Benito",15));
    listapersonas.add(new persona(2,"Ana",17));
    listapersonas.add(new persona(3,"Javier",25));
    
        System.out.println(listapersonas);
        
        for (int i = 0; i < listapersonas.size(); i++) {
            System.out.println("Contenido:  "+listapersonas.get(i).getNombre());
        }
        System.out.println("------------------for each-------------");
        
        for (persona perso: listapersonas ) {
            System.err.println("Contenido:  "+perso.getNombre());
        }
        
    }
    
}
