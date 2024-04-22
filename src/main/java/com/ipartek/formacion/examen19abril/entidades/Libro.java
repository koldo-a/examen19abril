package com.ipartek.formacion.examen19abril.entidades;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Libro {
	@Min(0)
	private Long id;
	
	@NotNull
	@Size(min = 2, max = 150)
	private String nombre;
	
    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer=5, fraction=2, message = "máximo 2 decimales")
    private BigDecimal precio;
	
    @Min(value = 0, message = "El descuento debe ser mayor o igual a 0")
    @Max(value = 100, message = "El descuento debe ser menor o igual a 100")
    private Integer descuento;

	public Libro() {
	}

	public Libro(String nombre, BigDecimal precio) {
		this(null, nombre, precio, null);
	}
	
	public Libro(String nombre, BigDecimal precio, Integer descuento) {
		this(null, nombre, precio, descuento);
	}
	
	public Libro(Long id, String nombre, BigDecimal precio, Integer descuento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descuento = descuento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setUrlFoto(Integer descuento) {
		this.descuento = descuento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		result = prime * result + ((descuento == null) ? 0 : descuento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		if (descuento == null) {
			if (other.descuento != null)
				return false;
		} else if (!descuento.equals(other.descuento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descuento=" + descuento + "]";
	}
}
