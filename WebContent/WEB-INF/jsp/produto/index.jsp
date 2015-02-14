<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index vraptor</title>
</head>
<body>
	<form action="produto/cadastrar" method="post">
		Nome: <input type="text" name="produto.nome" value=""><br>
		Descrição: <input type="text" name="produto.descricao" value=""><br>
		Valor: <input type="text" name="produto.valor" value=""><br>
		
		<input type="submit" value="Salvar">
	</form>
</body>
</html>