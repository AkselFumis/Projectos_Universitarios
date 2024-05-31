<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateClientesTable extends Migration
{
    public function up()
    {
        Schema::create('clientes', function (Blueprint $table) {
            $table->id();
            $table->bigInteger('cuit')->unsigned()->unique();
            $table->string('razon_social', 30);
            $table->integer('nro_cliente')->unsigned();
            $table->float('ytd', 10, 2)->default(0.0);
            $table->integer('tier')->default(1);
            $table->timestamps();
        });
    }

    public function down()
    {
        Schema::dropIfExists('clientes');
    }
}
