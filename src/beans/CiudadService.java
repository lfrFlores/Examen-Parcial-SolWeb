package beans;

import java.util.ArrayList;
import java.util.List;

public class CiudadService {
List<Ciudad> listadoCiudades= new ArrayList<Ciudad>();
public List<Ciudad> ciudades(){

	listadoCiudades.add(new Ciudad(1,"Cajamarca",1000));
	listadoCiudades.add(new Ciudad(2,"Lima",2000));
	listadoCiudades.add(new Ciudad(3,"Trujillo",5000));
	listadoCiudades.add(new Ciudad(4,"Amazonas",600));
	listadoCiudades.add(new Ciudad(5,"Piura",12562));
	
	return listadoCiudades;
}

}
