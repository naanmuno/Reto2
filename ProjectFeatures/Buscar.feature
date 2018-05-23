Feature: Busqueda tiquetes en despegar
		Yo como usuario de despegar
		quiero poder buscar tiquetes baratos
		para viajar a cartagena
		
	
Scenario: Busqueda de diez tiquetes baratos
		Given usuario esta en la pagina de despegar
		When usuario selecciona la opcion de vuelos
		And el usuario ingresa origen
		And ingresa destino
		And usuario ingresa fecha partida
		And el usuario selecciona fecha regreso
		And el usuario ingresa numero de adultos
		And usuario da click en buscar
		And se exporta resultado a excel
		Then se marca en verde el mas economico