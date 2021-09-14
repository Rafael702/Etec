<?php

    $departamentos=array("Informática","Recursos Humanos","Logistica","Marketing");

    $veiculos=array("BMW","Ferrari","Opala","Fusca");

    echo "<hr>";
    echo "<center>Exibindo os dados dos dois Arrays</center>";
    echo "<hr>";
    print_r($departamentos);
    echo "<br>";
    echo "<br>";
    print_r($veiculos);

    //contar o total de itens existentes no array

    $totalDepartamentos=count ($departamentos);

    echo "<br>";
    echo "<hr>";
    echo "Total de itens do array departamentos = $totalDepartamentos";

    $totalVeiculos=count ($veiculos);

    echo "<br>";
    echo "Total de itens do array veiculos = $totalVeiculos";  

    echo "<hr>";
    echo "<center> Exibindo os dados do Array Departamentos, usando Foreach </center>";

    

?>