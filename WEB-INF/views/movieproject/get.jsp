<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="../includes/header.jsp"%>

<div class="row">
	<div class="col-lg-12">
		<h1 Class="page-header">Board Read</h1>
	</div>
	<!-- /col-lg-12 -->
</div>
<!-- /row -->

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">

			<div class="panel-heading">Board Read Page</div>
			<!-- /panel-heading -->
			<div class="panel-body">

				<div class="form-group">
					<label>movie_id</label> <input class="form-control" name='movie_id'
						value='<c:out value="${movie.movie_id}"/>'readonly="readonly">
				</div>

				<div class="form-group">
					<label>Title</label> <input class="form-control" name='title'
						value='<c:out value="${movie.movie_title}"/>'readonly="readonly">
				</div>

				<div class="form-group">
					<label>Text area</label>
					<textarea class="form-control" rows="3" name='content'
						readonly="readonly"><c:out value="${movie.movie_content}" /></textarea>
				</div>


				<%-- <button data-oper='modify' class="btn btn-default" onclick="location.href='/board/modify?bno=<c:out value="${movie.movie_id}"/>'">Modify</button>
				<button data-oper='list' class="btn btn-info" onclick="location.href='/board/list'">List</button> --%>
				</form>

			</div>
			<!-- /panel body -->
		</div>
		<!-- /panel body -->
	</div>
	<!-- /panel -->
</div>
<!-- /row -->
