package com.ipartek.formacion.examen19abril.presentacion.controladores;

import java.io.IOException;

import com.ipartek.formacion.examen19abril.configuraciones.Globales;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/admin/productos")
public class AdminProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("productos", Globales.DAO_PRODUCTO.obtenerTodos());
		
		request.getRequestDispatcher("/WEB-INF/vistas/admin.jsp").forward(request, response);
	}
}
