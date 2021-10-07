<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Pagina Inicial do site - jogos</h1>
    <hr>

    <a href="{{ route ('cadastro-cliente') }}">Cadastro de Clientes</a>
    <br>
    <a href="{{ route ('cadastro-produtos') }}">Cadastro de Produtos</a>
    <br>
    <a href="{{ route ('cadastro-fornecedores') }}">Cadastro de Fornecedor</a>
    <br>
    <a href="{{ route ('cadastro-categorias') }}">Cadastro de Categorias</a>
</body>
</html>