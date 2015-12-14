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

public class Main {
	   public static void main(String[] args) {
		   OR nOR = new OR();
		   // Testeamos la neurona
		   int i= 0;
		   while (i!=5) {
			   nOR.test();
			   i++;
		   }
		   // Enseñamos a la neurona
		   nOR.aprendizaje();
		   // Testeamos la neurona
		   i= 0;
		   while (i!=5) {
			   nOR.test();
			   i++;
		   }
	   }
}
