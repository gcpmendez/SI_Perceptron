 /** 
  *  Asignatura: Sistemas Inteligentes
  *  Universidad de La Laguna.
  *  Curso: 2015-2016
  *  
  *  
  *  Autores: 
  * 	Germ�n Paz M�ndez
  * 		Contacto: alu0100503647@edu.ull.es
  * 	V�ctor Hern�ndez Perez
  * 		Contacto: alu0100697032@edu.ull.es
  * 
  */
 package perceptron;

public class Main {
	   public static void main(String[] args) {
		   OR nOR = new OR();
		   // Testeamos la neurona
		   int i= 0;
		   while (i!=5) {
			   nOR.test();
			   i++;
		   }
		   // Ense�amos a la neurona
		   nOR.aprendizaje();
		   // Testeamos la neurona
		   i= 0;
		   while (i!=5) {
			   nOR.test();
			   i++;
		   }
	   }
}
