<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateImportVentasTable extends Migration
{
    public function up()
    {
        Schema::create('import_ventas', function (Blueprint $table) {
            $table->id();
            $table->string('fecha');
            $table->char('tipo_comprobante', 1)->comment('A: Comprobante A, B: Comprobante B');
            $table->string('punto_venta', 5);
            $table->string('numero_comprobante', 10);
            $table->double('importe_venta', 15, 2);
            $table->bigInteger('cuit_cliente')->unsigned();
            $table->string('razon_social', 30); 
            $table->bigInteger('nro_cliente')->unsigned();
            $table->timestamps();
        });
    }

    public function down()
    {
        Schema::dropIfExists('import_ventas');
    }
}

