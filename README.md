RETO 2 : BÚSQUEDA DE VUELOS EN DESPEGAR
=========================================

El resumen de codificación
=

- Inicialmente se crea el proyecto como GradleSTS y se importan todas las dependencias. Allí se importan las librerías de selenium
- Después se crea la carpeta ProjectFeatures donde contendrá el archivo con las historias de Usuario en Gherkin y se hace referencia a los paquetes que contendrá el código java para cada historia de usuario
- Se crean las carpetas de Herramientas, pages, runners y stepDefinitions.
- En el paquete de steps se hace la asociación de cada línea de la historia de usuario con el correspondiente código en java
- Se usa el modelo de page object con el objetivo de tener por cada página de la automatización su correspondiente clase de java y los diferentes métodos asociados a ellos. EL beneficio principal es simplificar el código.
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

Prácticas de automatización
=

- BDD

Herramienta de automatización utilizado 
=

- Selenium

Estrategia de automatización
=

- Realicé un paso a paso a través de la página de despegar con los valores apropiados para el escenario exitoso. 
- Para el escenario negativo ingresé en el origen y en el destino la misma Ciudad y validé que me saliera el mensaje de error.

El navegador y la versión utilizada
=

- Navegador: Google Chrome
	
- Versión: 2.38

Las conclusiones de la automatización.
=

- Es muy importante contar con una estrategia de automatización al momento de realizar la creación del proyecto en el IDE. Una vez se tenga la estrategia, la forma de codificar va muy ligado a lo que se puede utilizar desde las librerías de JAVA y selenium. Lo importante es poder poner en orden cada uno de los pasos a realizar para llevar a cabo lo que se requiere.