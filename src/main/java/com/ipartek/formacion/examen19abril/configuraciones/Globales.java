package com.ipartek.formacion.examen19abril.configuraciones;

import com.ipartek.formacion.examen19abril.accesodatos.DaoCliente;
import com.ipartek.formacion.examen19abril.accesodatos.DaoProducto;
import com.ipartek.formacion.examen19abril.fabricas.Fabrica;
import com.ipartek.formacion.examen19abril.fabricas.FabricaEstatica;

public class Globales {
	private static final Fabrica fabrica = new FabricaEstatica();
	public static final DaoProducto daoCurso = fabrica.getDaoCurso();
	public static final DaoCliente daoAlumno = fabrica.getDaoAlumno();
}
