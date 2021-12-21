package es.manu.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	
	// el metodo miBinder controla para que los campos String del formulario
	// no puedan contener espacios y asi envitar datos vacios
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		
//		StringTrimmerEditor recortaEspaciosBlanco = new StringTrimmerEditor(true);
//		binder.registerCustomEditor(String.class, recortaEspaciosBlanco);
		
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(false));
		
	}

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {

		// Guardamos el objeto alumno en el modelo para poder moverlo a un jsp

		Alumno elAlumno = new Alumno();

		modelo.addAttribute("elAlumno", elAlumno);

		return "alumnoRegistroFormulario";
	}

//	cogemos los datos del formulario que estan almacenado en elAlumno

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("elAlumno") Alumno ElAlumno,
			BindingResult resultadoValidacion) {

		if (resultadoValidacion.hasErrors()) {
			
			return "alumnoRegistroFormulario";

		} else {

			return "confirmacionRegistroAlumno";
		}
	}

}
