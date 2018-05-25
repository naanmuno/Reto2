@Busqueda
Feature: Busqueda tiquetes en despegar
		Yo como usuario de despegar
		quiero poder buscar tiquetes baratos
		para viajar a cartagena
		

Scenario Outline: Busqueda de diez tiquetes baratos
		Given usuario esta en la pagina de despegar
		When usuario selecciona la opcion de vuelos
		And el usuario ingresa origen <origen>
		And ingresa destino <destino>
		And usuario ingresa fecha partida
		And el usuario selecciona fecha regreso
		And el usuario ingresa numero de adultos <nro_pers_adultas>
		And usuario da click en buscar
		And usuario ordena vuelos
		Then se exporta resultado a excel y marca el valor mas economico
	
		
		Examples: 
      | origen   | destino   | nro_pers_adultas |
      |Medellin, Colombia | Cartagena de Indias, Bolivar, Colombia | 2 |
  

Scenario Outline: Busqueda de diez tiquetes baratos
		Given usuario esta en la pagina de despegar
		When selecciona la opcion de vuelos
		And el usuario ingresa origen <origen>
		And ingresa destino <destino>
		And usuario ingresa fecha partida
		And el usuario selecciona fecha regreso
		And el usuario ingresa numero de adultos <nro_pers_adultas>
		And usuario da click en buscar
		Then sale mensaje de error
  
  
  		Examples: 
      | origen   | destino   | nro_pers_adultas |
      |Medellin, Colombia | Medellin, Colombia|2|