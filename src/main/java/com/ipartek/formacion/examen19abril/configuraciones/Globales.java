package com.ipartek.formacion.examen19abril.configuraciones;

import java.math.BigDecimal;

import com.ipartek.formacion.examen19abril.accesodatos.DaoProducto;
import com.ipartek.formacion.examen19abril.accesodatos.DaoProductoMemoria;
import com.ipartek.formacion.examen19abril.entidades.Producto;

import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;

public class Globales {
	public static final DaoProducto DAO_PRODUCTO = DaoProductoMemoria.getInstancia();
	public static final ValidatorFactory VALIDATOR_FACTORY = Validation.buildDefaultValidatorFactory();
	
	static {
		for(int i = 1; i <= 30; i++) {
			DAO_PRODUCTO.insertar(new Producto("Producto" + i, new BigDecimal(i * 10), "https://picsum.photos/300/200?" + i));
		}
	}
}
