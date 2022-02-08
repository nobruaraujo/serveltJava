<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	//scriplet n�o mais necess�rio ap�s implementa��o do ${} que � uma EL (Expression Language)
	//String nomeEmpresa = (String) request.getAttribute("empresa");
	//System.out.println(nomeEmpresa);
%>

<html>
	<body>

	<%--
		Interessante notar que foi utilizado JSTL (Java Standart Tag Library) com EL (Expression Language)
		Utilizamos o JSTL com a taglib l� em cima, importanto a biblioteca CORE.
		Essa taglib core nos permite criar URLs e v�rias outras funcionalidades.
		Nessa p�gina usamos o c:if (um if mesmo) para verificar se a ${empresa} (<- isso � uma EL) est� vazia ou n�o
		Check it out!
	--%>

	<c:if test="${not empty empresa}">
		Empresa ${empresa} cadastrada com sucesso!
	</c:if>
	
	<c:if test="${empty empresa}">
		Nenhuma empresa foi cadastrada
	</c:if>
	
	<c:forEach var="i" begin="1" end="10" step="2">
		<br><br>${i}
	</c:forEach>
		
	</body>
</html>