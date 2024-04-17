package com.ipartek.formacion.examen19abril.fabricas;

import com.ipartek.formacion.examen19abril.accesodatos.DaoCliente;
import com.ipartek.formacion.examen19abril.accesodatos.DaoProducto;

public interface Fabrica {
	DaoCliente getDaoAlumno();
	DaoProducto getDaoCurso();
}
