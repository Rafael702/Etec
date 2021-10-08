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

Route::get('/', function () {
    return view('welcome');
});

//Rota para o adm do projeto


Route::get('/login', function(){
    return 'Bem vindo a Página - LOGIN';
})->name('login');

Route::middleware('auth')->group(function(){
    
    Route::prefix('admin')->group(function(){

    Route::get('dashboard', function(){
         return 'Bem vindo a Tela - DashBoard';
    });

    Route::get('/teste',function(){
        return 'Bem Vindo a Pagina - Teste';
    });

    Route::get('/financeiro', function(){
        return 'Bem vindo a Tela - Financeiro';
    });
    
    Route::get('/usuarios', function(){
        return 'Bem vindo a Tela - Usuário';
    });
    
    Route::get('/produtos', function(){
        return 'Bem vindo a Tela - Produtos';
    });
    
    Route:: get('/fornecedores', function(){
        return 'Bem Vindo a Tela - Fornecedores';
        });

    });

});

//Usuário
Route::prefix('jogos')->group(function(){
    Route::get('/', function(){
        return 'Bem vindo ao Site de Jogos';
    });
    
    Route::get('/futebol', function(){
        return 'Listagem de Jogos - Futebol';
    });
});

