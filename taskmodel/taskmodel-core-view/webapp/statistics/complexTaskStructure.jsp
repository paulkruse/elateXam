<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:html>
<head>
	<title>Strukturelle Übersicht von "${Root.title}"</title>
	<link rel="stylesheet" href="<%= request.getContextPath() %>/format.css" type="text/css">
</head>

<body bgcolor="#FFFFFF" text="#000000">

<jsp:include page="../header.jsp" />

<html:messages message="true" id="msg" header="messages.header" footer="messages.footer">
	<%=pageContext.getAttribute("msg")%>
</html:messages>

<html:errors />

<p class="header">Strukturelle Übersicht von "${Root.title}"</p>

<table border="0" cellspacing="2" cellpadding="2" width="790">
  <tr bgcolor="#F2F9FF"> 
    <td valign="middle"><img src="<%= request.getContextPath() %>/pics/exit.gif" width="20" height="16"> 
		<html:link action="/tutorCorrectionOverview" paramId="taskId" paramName="Root" paramProperty="taskId">Korrektur-Übersicht</html:link>
	</td>
  </tr>
  <tr bgcolor="#F2F9FF"> 
	<td><br>
	<fieldset>

		${Root.title}
		<br/><br/>
		<ul>
			<c:forEach items="${Root.categories}" var="category">
				
				<li>${category.title}
					<ul>
						<c:forEach items="${category.blocks}" var="block">
							
							<li>Block vom Typ "${block.type}"</li>
					
						</c:forEach>
					</ul>
				</li>
				<br/>
			</c:forEach>
        </ul>    
	</fieldset><br>
	</td>
  </tr>
  
</table>


<jsp:include page="../footer.jsp" />

</body>

</html:html>
