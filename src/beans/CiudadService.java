package beans;

import java.util.ArrayList;
import java.util.List;

public class CiudadService {
List<Ciudad> listadoCiudades= new ArrayList<Ciudad>();
public List<Ciudad> ciudades(){
	
	//1° Forma
	listadoCiudades.add(new Ciudad(1,"Lima",20000));
	listadoCiudades.add(new Ciudad(2,"Cajamarca",30000));
	listadoCiudades.add(new Ciudad(3,"Trujillo",40000));
	listadoCiudades.add(new Ciudad(4,"Piura",100000));
	
	//2° Forma
	Ciudad c5= new Ciudad();
	c5.setId(5);
	c5.setNombre("Moquegua");
	c5.setPoblacion(20000);
	
	listadoCiudades.add(c5);
	
	return listadoCiudades; 
}

public Ciudad buscarCiudad(String ciudad){
	Ciudad objetoCiudad=null;
	for (Ciudad c: listadoCiudades) {
		if(c.getNombre().equals(ciudad)) {
			objetoCiudad=c;
			break;
		}
	}
	return objetoCiudad;
}
}
