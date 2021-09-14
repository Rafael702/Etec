<?php
    //criando os indices do array de forma manual

    echo "<center> Criando os indices do array de forma Manual</center>";
    echo "<hr>";

    $departamentos=array(1 => "Informática",2=>"Recursos Humanos",3=>"Logisitica", 4=>"Vendas");

    print_r($departamentos);

    echo "<br>";
    echo "<hr>";
    echo "<center>Acrescentando posições ao Array</center>";
    echo "<hr>";

    //Inserir Item no Array

    $departamentos[]="Marketing";
    $departamentos[]="Novo Departamento";

    print_r($departamentos);

    //exibir os dados usando o indice especifico

    echo "<hr>";
    echo "<center> Exibindo dados de posição especifica do array </center>";
    echo "<hr>";
    echo "<li>$departamentos[1]</li>";
    echo "<li>$departamentos[2]</li>";
    echo "<li>$departamentos[3]</li>";
    echo "<li>$departamentos[4]</li>";
    echo "<li>$departamentos[5]</li>";
    echo "<li>$departamentos[6]</li>";


?>