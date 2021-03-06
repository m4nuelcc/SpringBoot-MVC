package es.manu.spring.mvc;



import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/primario")
public class HolaAlumnosControlador {
	//para que funcione las rutas
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { // proporciona el formulario
		
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		
		return"HolaAlumnosSpring";
	}

	@RequestMapping("/procesarFormulario2")
//	public String procesarFormulario2(HttpServletRequest request, Model modelo) {
	public String procesarFormulario2(@RequestParam("nombreAlumno") String nombre, Model modelo) {	
		
		//String nombre = request.getParameter("nombreAlumno").toUpperCase();
		
		nombre+= "es el mejor alumno ";
		
		String mensajeFinal = "?Quien es el mejor alumno? " + nombre.toUpperCase();
		
		
		
		//agregando informacion al modelo
		
		modelo.addAttribute("miMensaje", mensajeFinal);
		
		
		
		
		return"HolaAlumnosSpring";
	}

	
}
