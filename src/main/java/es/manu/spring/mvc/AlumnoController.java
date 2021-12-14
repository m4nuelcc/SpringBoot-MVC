package es.manu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {

		// Guardamos el objeto alumno en el modelo para poder moverlo a un jsp

		Alumno elAlumno = new Alumno();

		modelo.addAttribute("elAlumno", elAlumno);

		return "alumnoRegistroFormulario";
	}

//	cogemos los datos del formulario que estan almacenado en elAlumno
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@ModelAttribute("elAlumno") Alumno ElAlumno) {

		return "confirmacionRegistroAlumno";

	}

}