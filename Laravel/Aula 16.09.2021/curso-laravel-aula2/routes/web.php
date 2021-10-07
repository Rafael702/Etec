<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

//Route::get('/', function () {
//    return view('welcome');
//});

//Chamando a view diretamente
//Route::view('/jogos','jogos');

//enviando parametros estaticos
//Route::view('/jogos','jogos', ['nomeJogo' => 'Fifa 2020']);

Route::view('/jogos', 'jogos' , ['idJogo'=>1, 'nomeJogo'=>'FiFa 2020', 'precoJogo' => 250]);

//Criando a rota  para apontar para a camada view/admin
Route::view('/jogos/admin', 'admin.usuario');

//Criando rota para chamar o cadastro de Funcionario

Route::view('/jogos/funcionario','funcionario.cadastro',['nomeFuncionario' => 'Juca da Silva']);

Route::view('/', 'welcome');

//Route::get('/jogos/dinamico', function(){
//    return view('dinamico.jogos');
//});

//Passando parametro dinamico
//Route::get('/jogos/dinamico/{nome}', function($nome){
//        return view('dinamico.jogos', ['nomeJogo'=>$nome]);
//});

//Passando dois ou mais parametros dinamicos
//Route::get('/jogos/dinamico/{id}/{nome}/{preco}', function($id, $nome, $preco){
//    return view('dinamico.jogos', ['idJogo'=>$id, 'nomeJogo'=>$nome, 'precoProduto'=>$preco]);
//});

//Route::get('/jogos/dinamico/{id?}/{nome?}', function($id=null,$nome=null){
//    return view ('dinamico.jogos2', ['idJogo'=>$id, 'nomeJogo'=>$nome]);
//});

//Fazendo com que o parametro aceite apenas números
//Route::get('jogos/dinamico/{id}', function($id){
//    return view('dinamico.jogos2', ['idJogos'=>$id]);
//})->where('id','[0-9]+');

//Fazendo com que o parametro aceite apenas letras
//Route::get('/jogos/dinamico/{nome}', function($nome){
 //   return view('dinamico.jogos2',['nomeJogo'=>$nome]);
//})->where('nome','[A-Za-z]+');

Route::get('/jogos/dinamico/{id}/{nome}', function($id,$nome){
        return view('dinamico.jogos2', ['idJogo'=>$id, 'nomeJogo'=>$nome]);
})->where(['id','[0-9]+', 'nome'=>'[a-z]+']);


Route::fallback(function(){
    return 'Erro! Rota inválida';
});

