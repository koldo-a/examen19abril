package com.ipartek.formacion.examen19abril.presentacion.controladores;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.ipartek.formacion.examen19abril.configuraciones.Globales;
import com.ipartek.formacion.examen19abril.entidades.Libro;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

@WebServlet("/admin/libro")
public class AdminLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sId = request.getParameter("id");

		if (sId != null) {
			Long id = Long.valueOf(sId);
			request.setAttribute("libro", Globales.DAO_LIBRO.obtenerPorId(id));
		}

		request.getRequestDispatcher("/WEB-INF/vistas/libro.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sId = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String sPrecio = request.getParameter("precio");
		String sDescuento = request.getParameter("descuento");

		Long id = sId.isBlank() ? null : Long.valueOf(sId);
		BigDecimal precio = sPrecio.isBlank() ? null : new BigDecimal(sPrecio);
		Integer descuento = sDescuento.isBlank() ? null : Integer.valueOf(sDescuento);
		
		Libro libro = new Libro(id, nombre, precio, descuento);
		
        Map<String, String> errores = validarLibro(libro);
        
        if(errores.size() > 0) {
        	request.setAttribute("libro", libro);
        	request.setAttribute("errores", errores);
        	request.getRequestDispatcher("/WEB-INF/vistas/libro.jsp").forward(request, response);

        	return;
        }
        
		if(id != null) {
			Globales.DAO_LIBRO.modificar(libro);
		} else {
			Globales.DAO_LIBRO.insertar(libro);
		}

		response.sendRedirect(request.getContextPath() + "/admin/libros");
	}

	private Map<String, String> validarLibro(Libro libro) {
		Map<String, String> errores = new HashMap<>();
		
		Validator validator = Globales.VALIDATOR_FACTORY.getValidator();
        Set<ConstraintViolation<Libro>> constraintViolations = validator.validate(libro);
		
        for(ConstraintViolation<Libro> constraintViolation: constraintViolations) {
        	errores.put(constraintViolation.getPropertyPath().toString(), constraintViolation.getMessage());
        }
        
        return errores;
	}
}
