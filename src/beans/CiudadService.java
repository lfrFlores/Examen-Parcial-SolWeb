package beans;

import java.util.ArrayList;
import java.util.List;

public class CiudadService {
List<Ciudad> listadoCiudades= new ArrayList<Ciudad>();
public List<Ciudad> ciudades(){
	
	//1° Forma
	listadoCiudades.add(new Ciudad(1,"Lima",200));
	listadoCiudades.add(new Ciudad(2,"Cajamarca",3));
	listadoCiudades.add(new Ciudad(3,"Trujillo",4));
	listadoCiudades.add(new Ciudad(4,"Piura",1));
	
	//2° Forma
	Ciudad c5= new Ciudad();
	c5.setId(5);
	c5.setNombre("Moquegua");
	c5.setPoblacion(20);
	
	listadoCiudades.add(c5);
	
	return listadoCiudades; 
}
}
