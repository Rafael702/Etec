<?php
$associativo=array("Nome"=>"Marcos da Silva", "Idade"=>20, "Sexo"=>"Masculino");
var_dump($associativo);

echo "<hr>";
echo "<br><center> Exibição dos dados do Array </center>";
echo "<hr>";
echo "<br>";
echo $associativo["Nome"];
echo "<br>";
echo $associativo["Idade"];
echo "<br>";
echo $associativo["Sexo"];

echo "<br>";
echo "<hr>";

$diferente=array("Etec de Itaquera", "Tec. Des. Sistemas",15,true, 8.5);

var_dump($diferente);

?>