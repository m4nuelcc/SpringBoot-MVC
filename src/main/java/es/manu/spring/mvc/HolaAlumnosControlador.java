package es.manu.spring.mvc;



import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { // proporciona el formulario
		
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		
		return"HolaAlumnosSpring";
	}

	@RequestMapping("/procesarFormulario2")
	public String procesarFormulario2(HttpServletRequest request, Model modelo) {
		
		String nombre = request.getParameter("nombreAlumno").toUpperCase();
		
		nombre+= "es el mejor alumno ";
		
		String mensajeFinal = "¿Quien es el mejor alumno? " + nombre;
		
		
		
		//agregando informacion al modelo
		
		modelo.addAttribute("miMensaje", mensajeFinal);
		
		
		
		
		return"HolaAlumnosSpring";
	}

	
}
