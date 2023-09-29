
package arrais;
import java.util.Scanner; 
public class Arrais {

    public static void main(String[] args) {
// Guardar las ventas de 10 días en un arreglo y determinar cuales son mayores a 2000(inlcusive)
    double ventas[]= new double[10];
    Scanner entrada = new Scanner(System.in);
        System.out.println("***********ventas mayores a  2000********");
        System.out.println("");
        System.out.println("Ingrese las 10 ventas del mes");
        //Lenar el arreglo 
        for (int i = 0; i <= ventas.length -1; i++) {
            System.out.println("Ingrese la venta: " + (i+1) + " ");
            ventas[i] = entrada.nextDouble(); 
            
        }
   // Determinar cuales ventas en el arreglo son mayores o iguales a 2000
    ventasMayores2000(ventas); 
        

    }
    public static void ventasMayores2000(double x[]){
        int j=0; 
        int total=0;
        double acumuladorVentas=0; 
        System.out.println("Estas son las ventas mayores o iguales a 2000");
        //recorrer el arreglo 
        while(j<10){
            if(x[j] <=2000){
                System.out.println("$ "+x[j]);
                total++;
                acumuladorVentas=acumuladorVentas+x[j];
            }
           j++;
        }
        System.out.println("El total de las ventas mayores o igual a 2000 es: "+total);
        System.out.println("El acumulador total es "+ acumuladorVentas);
   }
           
           
}
