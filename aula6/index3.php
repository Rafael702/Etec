<?php
    //Arquivos de Log, monitorar o que o usuário acessa no sistema.

    require_once 'ManipulaArquivo3.php';

    $a1=new ManipulaArq("dados.txt");

    $a1->escrever("Escola: Etec de Itaquera.");
    $a1->escrever("Curso: Desenvolvimento de Sistemas");
    $a1->escrever("Periodo: Noturno");
    $a1->escrever("Disciplina: PWIII");

    echo $a1->ler();

?>  