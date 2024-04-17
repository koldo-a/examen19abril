package com.ipartek.formacion.examen19abril.accesodatos;

import com.ipartek.formacion.examen19abril.dtos.ClienteDto;
import com.ipartek.formacion.examen19abril.dtos.ProductoDto;

public interface DaoCliente extends Dao<ClienteDto> {
	void apuntarseAProducto(Long idCliente, Long idProducto);
	Iterable<ProductoDto> cursos(Long idCliente);
	
	// ClienteLoginDto buscarPorEmail(String email);
}
