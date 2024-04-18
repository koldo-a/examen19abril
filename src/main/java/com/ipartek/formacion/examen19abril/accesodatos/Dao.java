package com.ipartek.formacion.examen19abril.accesodatos;

public interface Dao<T> {
	default Iterable<T> obtenerTodos() {
		throw new UnsupportedOperationException("NO LO HE IMPLEMENTADO");
	}

	default T obtenerPorId(Long id) {
		throw new UnsupportedOperationException("NO LO HE IMPLEMENTADO");
	}

	default T insertar(T objeto) {
		throw new UnsupportedOperationException("NO LO HE IMPLEMENTADO");
	}

	default T modificar(T objeto) {
		throw new UnsupportedOperationException("NO LO HE IMPLEMENTADO");
	}

	default void borrar(Long id) {
		throw new UnsupportedOperationException("NO LO HE IMPLEMENTADO");
	}
}
