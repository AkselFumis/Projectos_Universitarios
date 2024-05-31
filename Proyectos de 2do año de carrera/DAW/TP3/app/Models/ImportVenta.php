<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class ImportVenta extends Model
{
    use HasFactory;

    protected $table = 'import_ventas';

    protected $fillable = [
        'fecha',
        'tipo_comprobante',
        'punto_venta',
        'numero_comprobante',
        'importe_venta',
        'cuit_cliente',
        'razon_social',
        'nro_cliente',
    ];
}


