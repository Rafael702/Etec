<?php
echo "<h1><center><b> Exibindo dados do Array [CELULARES] </b></center></h1>";
$celulares=array("MotoXT389 ","MotoG ","iPhone 12 Pro Max ","Galaxy S2 ","Samsung AO1 ", "Moto E ", "Xiaomi Redmi 8 ", "ZenFone");

	print_r ($celulares);

    echo "<hr>";
	echo "<center><b> Exibindo dados do  Array usando um indice especifico </b></center>";

	echo "<hr>";
	echo "<br>";
	echo "<br> <li>$celulares[0]</li>";
	echo "<br> <li>$celulares[1]</li>";
    echo "<br> <li>$celulares[2]</li>";
    echo "<br> <li>$celulares[3]</li>";
    echo "<br> <li>$celulares[4]</li>";
    echo "<br> <li>$celulares[5]</li>";
    echo "<br> <li>$celulares[6]</li>";
    echo "<br> <li>$celulares[7]</li>";

    echo "<hr>";
    echo "<center>Exibindo os dados do Array Celulares com o For(){}</center>";

    $totalCelulares=count ($celulares);
    for ($i=0; $i < $totalCelulares; $i++) { 
        echo "<br><li>$celulares[$i]</li>";
    }

    echo "<hr>";
    echo "<center>Exibindo os dados do Array Celulares com o Foreach</center>";
    foreach ($celulares as $valorCelulares) {
        echo "<br><li>$valorCelulares</li>"; 
    }

    echo "<hr>";
    echo "<h1><center><b> Exibindo dados do Array [FACULDADE]</b></center></h1>";
    $faculdade=array("Sistemas da Informação ","Ciências da Computação ","Psicologia ","Letras ","Filosofia ", "Teologia ", "Matemática ", "Direito");    

    echo "<hr>";
	echo "<center><b> Exibindo dados do  Array usando um indice especifico </b></center>";

	echo "<hr>";
	echo "<br>";
	echo "<br> <li>$faculdade[0]</li>";
	echo "<br> <li>$faculdade[1]</li>";
    echo "<br> <li>$faculdade[2]</li>";
    echo "<br> <li>$faculdade[3]</li>";
    echo "<br> <li>$faculdade[4]</li>";
    echo "<br> <li>$faculdade[5]</li>";
    echo "<br> <li>$faculdade[6]</li>";
    echo "<br> <li>$faculdade[7]</li>";

    echo "<hr>";
    echo "<center>Exibindo os dados do Array Faculdade com o For(){}</center>";

    $totalFaculdade=count ($faculdade);
    for ($i=0; $i < $totalFaculdade; $i++) { 
        echo "<br><li>$faculdade[$i]</li>";
    }

    echo "<hr>";
    echo "<center>Exibindo os dados do Array Faculdade com o Foreach</center>";
    foreach ($faculdade as $valorFaculdade) {
        echo "<br><li>$valorFaculdade</li>"; 
    }
?>