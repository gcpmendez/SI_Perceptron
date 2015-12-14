 /** 
  *  Asignatura: Sistemas Inteligentes
  *  Universidad de La Laguna.
  *  Curso: 2015-2016
  *  
  *  
  *  Autores: 
  * 	Germán Paz Méndez
  * 		Contacto: alu0100503647@edu.ull.es
  * 	Víctor Hernández Perez
  * 		Contacto: alu0100697032@edu.ull.es
  * 
  */
package perceptron;

import java.util.Random;
import java.util.Scanner;

public class OR {
	final double E = 0.6;	//Factor de aprendizaje   
	
    //Tabla de la verdad (X1,X2,Y)
    int[][] tablaDeVerdad = {{1, 1, 1}, {1, -1, 1}, {-1, 1, 1}, {-1, -1, -1}};
    
    // Pesos y umbral
    double w1; 	
    double w2;
    double umbral;
    
    // Salida
    double y;	
    
    int iteraciones;
    
    /** CONSTRUCTOR */
	public OR() {
		this.w1 = new Random().nextDouble() / 2.5;//valores proximos a 0
		this.w2 = new Random().nextDouble() / 2.5;
		this.umbral = -0.4;
		this.iteraciones = 0;
		
		System.out.println("----- Iniciamos pesos -----");
        System.out.println("w1: " + w1);
        System.out.println("w2: " + w2);
        System.out.println("umbral: " + umbral +"\n");
	}
	
	/** METHODS */
    public void aprendizaje() {

        System.out.println("----- Iniciando fase de aprendizaje (puerta logica OR) -----");
        int i = 0;
        this.iteraciones  = 1;
        while (i < tablaDeVerdad.length && iteraciones < 30) {
        	// Asignación de pesos
            y = Math.tanh((tablaDeVerdad[i][0] * w1) + (tablaDeVerdad[i][1] * w2) + (-1 * umbral));
            
            // Comparamos con el umbral para la asignación
            y = (y >= umbral) ? 1 : -1;
            System.out.println("Entrada[" + tablaDeVerdad[i][0] + "," + tablaDeVerdad[i][1]
                    + "]) Valor esperado[" + tablaDeVerdad[i][2]
                    + "] Salida[" + (int) y + "]");
            
            // Si es el valor esperado aumentamos i
            if (y == tablaDeVerdad[i][2]) {
                i++;
                
            // Si no, reajuste de pesos.
            } else {
                System.out.println("Valor esperado difiere de la salida. Reajustamos pesos... \n");
                w1 = w1 +  (E * (tablaDeVerdad[i][2] - y ))* tablaDeVerdad[i][0];
                w2 = w2 +  (E * (tablaDeVerdad[i][2] - y ))* tablaDeVerdad[i][0];
                umbral = umbral + 2 * E * tablaDeVerdad[i][2] * (-1);

                System.out.println("----- Reajuste de pesos (" + iteraciones + ") -----");
                System.out.println("w1: " + w1);
                System.out.println("w2: " + w2);
                System.out.println("umbral: " + umbral + "\n");
                iteraciones++;
                i = 0;
            }
        }
        System.out.println("\nFase de aprendizaje terminada con exito ");
        System.out.println("\n----- Resultados -----");
        System.out.println("w1: " + w1);
        System.out.println("w2: " + w2);
        System.out.println("umbral: " + umbral);
    }
    
    public void test() {
    	 if (iteraciones <= 100) {
             System.out.println("\n----- Iniciando Test -----");
             System.out.print("Entrada x1: ");
             @SuppressWarnings("resource")
			Scanner leerX1 = new Scanner(System.in);
             double x1 = Double.parseDouble(leerX1.next());

             System.out.print("Entrada x2: ");
             @SuppressWarnings("resource")
			Scanner leerX2 = new Scanner(System.in);
             double x2 = Double.parseDouble(leerX2.next());

             y = Math.tanh((x1 * w1) + (x2 * w2) + (-1 * umbral));
             y = (y >= umbral) ? 1 : -1;

             System.out.println("\nSalida: " + (int)y);
         } else {
             System.out.println("\nFase de aprendizaje ha fallado\n");
         }
    }
}