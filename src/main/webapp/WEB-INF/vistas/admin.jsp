<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>
<main class="container-fluid">

	<div class="table-responsive">
		<table class="table table-hover table-bordered table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>Precio</th>
					<th>Descuento</th>
					<th>OPCIONES</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${libros}" var="p">
					<tr>
						<th>${p.id}</th>
						<td>${p.nombre}</td>
						<td><fmt:formatNumber type="currency" value="${p.precio}" /></td>
						<td><fmt:formatNumber type="currency" value="${p.descuento}" /></td>
						<td><a href="admin/libro?id=${p.id}" class="btn btn-sm btn-primary">Editar</a> <a
							href="admin/borrar?id=${p.id}" class="btn btn-sm btn-danger">Borrar</a></td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><a href="admin/libro" class="btn btn-sm btn-primary">Añadir</a></td>
				</tr>
			</tfoot>
		</table>
	</div>
	
</main>
<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>