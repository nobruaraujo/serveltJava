<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	//scriplet não mais necessário após implementação do ${} que é uma EL (Expression Language)
	//String nomeEmpresa = (String) request.getAttribute("empresa");
	//System.out.println(nomeEmpresa);
%>

<html>
	<body>

	<%--
		Interessante notar que foi utilizado JSTL (Java Standart Tag Library) com EL (Expression Language)
		Utilizamos o JSTL com a taglib lá em cima, importanto a biblioteca CORE.
		Essa taglib core nos permite criar URLs e várias outras funcionalidades.
		Nessa página usamos o c:if (um if mesmo) para verificar se a ${empresa} (<- isso é uma EL) está vazia ou não
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