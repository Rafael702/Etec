<?php

    $departamentos=array("Informática ","Recursos Humanos ","Logistica ","Marketing");
    $veiculos=array("BMW","Ferrari","Opala","Fusca");


    
    $totalVeiculos=count ($veiculos);

    //echo "<center>Exibindo os dados do Array Depertamentos com o Foreach</center>";
    echo "<hr>";

    //foreach para percorrer os itens de um array
   // echo "Exindo o array de Departamentos: <br>";
    //foreach ($departamentos as $valorDepartamentos) {
      //  echo "<br><li>$valorDepartamentos</li>";
    //}

   // echo "<hr>";
    echo "Exindo o array de Veiculos: <br>";
    //foreach ($veiculos as $valorVeiculos) {

    //    echo "<br><li>$valorVeiculos</li>";
    //}

    //Exibindo os dados do array com o for(){};

    echo "<center>Exibindo os dados do Array Depertamentos com o For(){}</center>";

    $totalDepartamentos=count ($departamentos);

        for($i=0;$i < $totalDepartamentos; $i++){
            echo "<br><li> $departamentos[$i]</li>";
        }

        echo "<hr>";
        echo "<center>Exibindo os dados do Array Veiculos com o For(){}</center>";
        $totalVeiculos=count ($veiculos);

        for($i=0;$i < $totalVeiculos; $i++){
            echo "<br><li> $veiculos[$i]</li>";
        }
?>