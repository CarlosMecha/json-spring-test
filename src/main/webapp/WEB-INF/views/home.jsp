<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Home</title>
		<script type="text/javascript" src="<c:url value="/resources/jquery-1.4.min.js" /> "></script>
		<script type="text/javascript" src="<c:url value="/resources/json.min.js" /> "></script>
		
		<script type="text/javascript">	
			$(document).ready(function() {
				$("#newTest").submit(function() {
					var newTest = $(this).serializeObject();
					$.postJSON("json/new", newTest, function(data) {
						$("#res").text(data);
					});
					return false;				
				});
			});
			
			function resetForm() {
				$('#newTest')[0].reset();
			}
		
		</script>
		
	</head>
	<body>
		<h1>Hello world!</h1>

		<P>The time on the server is ${serverTime}.</P>
		<form:form modelAttribute="newTest" action="json/new" method="post">
		
			<fieldset>		
				<legend>JSON Fields</legend>
				<p>
					<form:label	id="nameLabel" for="name" path="name">Name</form:label><br/>
					<form:input path="name" />
				</p>
				<p>	
					<form:label id="commentLabel" for="comment" path="comment">Comments</form:label><br/>
					<form:input path="comment" />
				</p>
				<p>	
					<input id="test" type="submit" value="Test" />
				</p>
			</fieldset>
		
		</form:form>
		<div id="res"></div>
		
	</body>
</html>
