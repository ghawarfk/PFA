<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>www.epi.com :)</h1>
	
	<h3>Recherche : </h3>
	<form action="searchById.jsp" method="post" >
		ID : <input type="text" name="idProduit" value="${idProduit}"/>
		<input type="submit" value="Afficher"/>
	</form>
	<hr />
	
	<h3>Ajouter : </h3>
	<form action="addProduit.jsp" method="post" >
		<table	 width="30%">
			<tr>
				<td>NOM : </td>
				<td><input type="text" name="nom"/></td>
			</tr>
			<tr>
				<td>DESCRIPTION : </td>
				<td><input type="text" name="description""/></td>
			</tr>
			<tr>
				<td>PRIX : </td>
				<td><input type="text" name="prix""/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Ajouter"/></td>
			</tr>
		</table>
		
	</form>
	<hr />
	<br />
	
	<table border="1" width="50%">
		<tr>
			<th>ID</th>
			<th>NOM</th>
			<th>DESCRIPTION</th>
			<th>PRIX</th>
			<th>OPTION</th>
		</tr>
		<!-- listeProduit -->
		<s:forEach items="${listeProduit}" var="o">
			<tr>
				<td>${o.idProduit}</td>
				<td>${o.nom}</td>
				<td>${o.description}</td>
				<td>${o.prix}</td>
				<td><a href="deleteProduit.jsp?id=${o.idProduit}">supprimer</a></td>
			</tr>
		</s:forEach>
		
	</table>
</body>
</html>