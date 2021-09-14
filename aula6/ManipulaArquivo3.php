<?php
    class ManipulaArq{
        public function __construct($caminho_arquivo){

            $this->caminho_arquivo=$caminho_arquivo;
            $this->arquivo=fopen($caminho_arquivo,'w+');
        }

        //Escrever no arquivo texto.
        public function escrever ($string){
            fwrite($this->arquivo,$string .PHP_EOL);

        }

        //Ler o arquivo
        public function ler(){
            fseek($this->arquivo, 0); //Posicionando o ponteiro na primeira linha do doc.txt
            return fread($this->arquivo, filesize($this->caminho_arquivo));
        }

        //destrói um objeto.
        public function __destruct(){
            fclose($this->arquivo);
            echo "Arquivo Fechado com sucesso!!!";
        }

    }

?>