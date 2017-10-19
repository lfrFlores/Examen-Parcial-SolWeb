package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Ciudad;
import beans.CiudadService;

@WebServlet("/sf")
public class sf extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public sf() {
        super();
   }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ciudad = request.getParameter("param_ciudad");
		response.getWriter().append("Usted ha buscado la siguiente Ciudad: "+ciudad);
		response.getWriter().append("<hr>");
		Ciudad objetoCiudad = null;
		CiudadService cs= new CiudadService();
		cs.ciudades();			
		objetoCiudad = cs.buscarCiudad(ciudad);
		response.getWriter().append(""
		+ "<table style='width:100%' border=1>"
				+ " <tr>"
					+ " <th>"
					+ "	Id"
					+ "	</th>"
					+ "<th>"
					+ "					Nombre"
					+ "	</th>"
					+ "	<th>"
					+ "	Poblacion"
					+ "	</th>"
				+ "</tr>");
		
		if (objetoCiudad!=null) {
			response.getWriter().append(""
					+ "<tr>"
						+ "<td>"+objetoCiudad.getId()+"</td> ");
			response.getWriter().append(""
						+ "<td>"+objetoCiudad.getNombre()+"</td> ");
			response.getWriter().append(""
						+ "<td> "+objetoCiudad.getPoblacion()+"</td>"
		+ "</table> ");
		}else {
			response.getWriter().append("La ciudad No Exite");
		}		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
