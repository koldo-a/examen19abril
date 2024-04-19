package com.ipartek.formacion.examen19abril.configuraciones;

import java.math.BigDecimal;

import com.ipartek.formacion.examen19abril.accesodatos.DaoLibro;
import com.ipartek.formacion.examen19abril.accesodatos.DaoLibroMemoria;
import com.ipartek.formacion.examen19abril.entidades.Libro;

import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;

@SuppressWarnings("removal")
public class Globales {
	public static final DaoLibro DAO_LIBRO = DaoLibroMemoria.getInstancia();
	public static final ValidatorFactory VALIDATOR_FACTORY = Validation.buildDefaultValidatorFactory();
	
	static {
		for(int i = 1; i <= 30; i++) {
			DAO_LIBRO.insertar(new Libro("Libro" + i, new BigDecimal(i * 10), new Integer(i*5)));
		}
	}
}
