package com.ipartek.formacion.examen19abril.dtos;

import java.time.LocalDate;

public record ClienteDto(Long id, String nombre, String apellidos, LocalDate fechaNacimiento) {

}
