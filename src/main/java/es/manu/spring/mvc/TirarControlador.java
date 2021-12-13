package es.manu.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class TirarControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { // proporciona el formulario
		
		return "HolaAlumnosFormulario";
	}
	
	
	@RequestMapping("/procesarFormulario2")
	public String procesarFormulario2(@RequestParam("nombreAlumno") String nombre, Model modelo) {	
			
		nombre+= "es el peor alumno ";
		
		String mensajeFinal = "¿Quien es el peor alumno? " + nombre.toUpperCase();
				
		//agregando informacion al modelo
		
		modelo.addAttribute("miMensaje", mensajeFinal);
			
		return"HolaAlumnosSpring";
	}

}
