package com.ipartek.formacion.examen19abril.fabricas;

import com.ipartek.formacion.examen19abril.accesodatos.DaoCliente;
import com.ipartek.formacion.examen19abril.accesodatos.DaoCliente;
import com.ipartek.formacion.examen19abril.accesodatos.DaoProducto;
import com.ipartek.formacion.examen19abril.accesodatos.DaoCursoJpa;

public class FabricaEstatica implements Fabrica {

	@Override
	public DaoCliente getDaoAlumno() {
		return new DaoAlumnoJpa();
	}

	@Override
	public DaoProducto getDaoCurso() {
		return new DaoCursoJpa();
	}

}
