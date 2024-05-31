<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\ClienteController;
use App\Http\Controllers\ImportacionController;
//Rutas para ImportacionController
Route::get('/importacion', [ImportacionController::class, 'index'])->name('importacion.index');
Route::post('/procesar-importacion', [ImportacionController::class, 'procesarImportacion'])->name('procesar.importacion');
//Rutas para ClienteController
Route::get('/clientes', [ClienteController::class, 'index'])->name('clientes.index');
Route::get('/clientes/create', [ClienteController::class, 'create'])->name('clientes.create');
Route::post('/clientes', [ClienteController::class, 'store'])->name('clientes.store');
Route::get('/clientes/{cliente}/edit', [ClienteController::class, 'edit'])->name('clientes.edit');
Route::put('/clientes/{cliente}', [ClienteController::class, 'update'])->name('clientes.update');


