<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class JogoController extends Controller
{
    public function index(){
        $nome = 'FIFA 2022';

        return view('jogos',['nome'=>$nome]);
    }
}