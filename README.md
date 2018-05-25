RETO 2 : B�SQUEDA DE VUELOS EN DESPEGAR
=========================================

El resumen de codificaci�n
=

- Inicialmente se crea el proyecto como GradleSTS y se importan todas las dependencias. All� se importan las librer�as de selenium
- Despu�s se crea la carpeta ProjectFeatures donde contendr� el archivo con las historias de Usuario en Gherkin y se hace referencia a los paquetes que contendr� el c�digo java para cada historia de usuario
- Se crean las carpetas de Herramientas, pages, runners y stepDefinitions.
- En el paquete de steps se hace la asociaci�n de cada l�nea de la historia de usuario con el correspondiente c�digo en java
- Se usa el modelo de page object con el objetivo de tener por cada p�gina de la automatizaci�n su correspondiente clase de java y los diferentes m�todos asociados a ellos. EL beneficio principal es simplificar el c�digo.
- Se crea un paquete de herramientas en la cual se almacena la clase que va a realizar las funciones de escritura sobre el archivo en excel solicitado en el reto. 

El framework
=

- Cucumber
	
Compilador
=

- IDE Eclipse

Patrones desarrollo
=

- POM

Pr�cticas de automatizaci�n
=

- BDD

Herramienta de automatizaci�n utilizado 
=

- Selenium

Estrategia de automatizaci�n
=

- Realic� un paso a paso a trav�s de la p�gina de despegar con los valores apropiados para el escenario exitoso. 
- Para el escenario negativo ingres� en el origen y en el destino la misma Ciudad y valid� que me saliera el mensaje de error.

El navegador y la versi�n utilizada
=

- Navegador: Google Chrome
	
- Versi�n: 2.38

Las conclusiones de la automatizaci�n.
=

- Es muy importante contar con una estrategia de automatizaci�n al momento de realizar la creaci�n del proyecto en el IDE. Una vez se tenga la estrategia, la forma de codificar va muy ligado a lo que se puede utilizar desde las librer�as de JAVA y selenium. Lo importante es poder poner en orden cada uno de los pasos a realizar para llevar a cabo lo que se requiere.