
package pkg651arreglos;

public class Main {

 
    public static void main(String[] args) {
      //problema: Escribir un programa para insertar el numero de episodios de una serie "Dr House" 
      // y que nos devuelva la duración. 
      
        System.out.println("*********************");
        System.out.println("**serie de Dr House**");
        System.out.println("*********************");
        
        int[] episodiosSerie = new int[5];  
        
        episodiosSerie[0] = 30; 
        episodiosSerie[1] = 50;
        episodiosSerie[2] = 25; 
        episodiosSerie[3] = 60; 
        episodiosSerie[4] = 45; 
        
        // numero de epidsodios 
        int duracion = episodiosSerie.length;
        int acumulador =0; 
        for (int i = 0; i < episodiosSerie.length; i++) {
             
            acumulador = acumulador + episodiosSerie[i];
        }
        System.out.println("Total de episodios de la serie Dr House: "+acumulador );
        for (int i = 0; i < episodiosSerie.length-1; i++) {
            if(episodiosSerie[i] > 40){
                System.out.println("Capitulo  "+(i+1)+episodiosSerie[i]);
            }
            
        }
    }
    
}
