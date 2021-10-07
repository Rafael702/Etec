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

Route::get('/jogos', function(){
    return view('jogos');
});

Route::get('/jogos/clientes',function(){
    return view('cadastros.clientes.clientes');
})->name('cadastro-cliente');

Route::get('/jogos/produtos',function(){
    return view('cadastros.produtos.produtos');
})->name('cadastro-produtos');

Route::get('/jogos/fornecedores',function(){
    return view('cadastros.fornecedores.fornecedores');
})->name('cadastro-fornecedores');

Route::get('/jogos/categorias', function(){
    return view('cadastros.categorias.categorias');
})->name('cadastro-categorias');

Route::get('/jogos', function(){
    return view('jogos');
})->name('pagina-inicial');