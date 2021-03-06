
# Presentación SI
[Presentación online](https://prezi.com/5iihxksnm5h6/untitled-prezi/?utm_campaign=share&utm_medium=copy)


Esta presentación ha sido desarrollada para la asignatura de **Sistemas Inteligentes** del itinerario de computación del **_Grado en Ingeniería Informática_** de la **ULL**.

Presentación realizada con **Víctor Hernández Pérez** (alu0100697032).

## Introducción a las Redes Neuronales – El perceptrón-


 Podemos considerar que una red neuronal esta formada por un número de elementos simples que son las **neuronas** y que cada una de estas neuronas, realiza un **operación muy sencilla** (resuelve una sencilla función matemática en función del valor de sus entradas) cuyo resultado será trasmitida a la siguiente neurona como entrada de la misma (de ahí las conexiones).  

 En una **neurona artifical** es descrita como sigue:
 ![Pantalla inicial](https://github.com/gcpmendez/SI_Perceptron/blob/master/images/perceptron.png?raw=true)


Podemos distinguir las siguientes partes:
- **Xi** - Valores de entradas
- **Wj** - pesos del perceptrón
- **E** - Factor de aprendizaje (controla el proceso de aprendizaje). 0 < E < 1
- **θ** - Umbral
- **y** - salida esperada
- **T** - Valor esperado para una entrada

> **NOTA:** La función de activación, y es la función que utiliza la suma de estímulos para determinar la actividad de salida de la neurona.

Formula para el ajuste de pesos:

```java
W = W + (E * (T - y)) * X
```


#### Ejemplo: puerta OR con redes neuronales

 ![Pantalla inicial](https://github.com/gcpmendez/SI_Perceptron/blob/master/images/OR.jpg?raw=true)  

En nuestro ejemplo utilizamos un perceptrón simple que **resuelve problemas linealmente separables**

## Ayúdame a mejorar esta presentación

Cada **bugs** que encuentres házmelo saber a [gcpmendez@gmail.com](mailto:gcpmendez@gmail.com)

## Enlaces Externos

  [1]: [ETSII ULL](http://www.ull.es/view/centros/etsii/Tercero_7/es), Escuela Técnica Superior de Ingeniería Informática - Graduado en Ingeniería Informática.   
  [2]: [WIKIPEDIA ](https://es.wikipedia.org/wiki/Perceptr%C3%B3n), perceptrón - Wikipedia.


## Licencia

Este trabajo tiene una licencia [ Creative Commons Attribution-ShareAlike 4.0 International License](http://creativecommons.org/licenses/by-sa/4.0/),
![](https://i.creativecommons.org/l/by-sa/4.0/88x31.png)
