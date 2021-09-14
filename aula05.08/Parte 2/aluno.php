<?php

class Aluno{
    public $matricula;
    public $nome;
    public $curso;
    public $idade;
    public $idade;
    public $sexo;
    public $status;
}

$aluno1=new Aluno();
var_dump($aluno1);

$aluno2=new Aluno();
var_dump($aluno2);

$aluno3=new Aluno();
var_dump($aluno3);

echo "<hr>";

$aluno1->matricula=1;
$aluno1->nome="Juca da Silva";
$aluno1->curso="Desenvolviento de Sistemas";
$aluno1->idade=20;
$aluno1->sexo="masculino";
$aluno1->status=1;

$aluno2->matricula=2;
$aluno2->nome="Afonso Germano";
$aluno2->curso="ADM";
$aluno2->idade=13;
$aluno2->sexo="masculino";
$aluno2->status=1;

$aluno3->matricula=3;
$aluno3->nome="Rebeca Serafim";
$aluno3->curso="Enfermagem";
$aluno3->idade=25;
$aluno3->sexo="feminino";
$aluno3->status=3;


var_dump($aluno1);
var_dump($aluno2);
var_dump($aluno3);

?>