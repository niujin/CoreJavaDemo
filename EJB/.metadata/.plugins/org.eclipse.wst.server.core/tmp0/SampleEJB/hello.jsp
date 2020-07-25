<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello Page</title>
<script language="javascript" src="validate.js">
</script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js">
</script>
<script>
	$(document).ready(function() {
		$("#submit").click(function() {
			var value = $("#name").val();
			value = value.replace("<", "");
			$("#name").val(value);
		});
	});
</script>
</head>
<body>
<h2><font color="blue">SampleEJB: JSP + Servlet + EJB</font></h2>
<form action="HelloServlet" method="post" onsubmit="return validate_Form(this);">
	<table>
		<tr>
			<td>Name: </td>
			<td><input type="text" name="name" id="name"/></td>
		</tr>
		<tr>
			<td>Age: </td>
			<td><input type="text" name="age"/></td>
		</tr>
		<tr>
			<td></td>
			<td>
				<input type="reset" value="Clear"/>
				<input type="submit" value="Submit" id="submit"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>