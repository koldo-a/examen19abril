package com.ipartek.formacion.examen19abril.accesodatos;

import com.ipartek.formacion.examen19abril.dtos.ClienteDto;
import com.ipartek.formacion.examen19abril.dtos.ProductoDto;

public interface DaoProducto extends Dao<ProductoDto> {

	Iterable<ClienteDto> alumnos(Long id);

}
