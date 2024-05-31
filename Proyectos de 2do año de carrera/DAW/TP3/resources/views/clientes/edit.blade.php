
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Cliente</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-5">

    @if ($errors->any())
    <div class="alert alert-warning">
        <strong>¡Ups! Hubo algunos problemas con los campos ingresados:</strong>
        <ul>
            @foreach ($errors->all() as $error)
            <li>{{ $error }}</li>
            @endforeach
        </ul>
    </div>
    @endif

    <h2 class="mb-4">Editar Cliente</h2>
    <form action="{{ route('clientes.update', $cliente->id) }}" method="post" class="mb-4">
        @csrf
        @method('PUT')

        <div class="mb-3">
            <label for="cuit" class="form-label">CUIT:</label>
            <input type="text" name="cuit" value="{{ $cliente->cuit }}" class="form-control" required>
        </div>

        <div class="mb-3">
            <label for="razon_social" class="form-label">Razón Social:</label>
            <input type="text" name="razon_social" value="{{ $cliente->razon_social }}" class="form-control" required>
        </div>

        <div class="mb-3">
            <label for="nro_cliente" class="form-label">Nro Cliente:</label>
            <input type="text" name="nro_cliente" value="{{ $cliente->nro_cliente }}" class="form-control" required>
        </div>

        <!-- Agrega más campos según sea necesario -->

        <button type="submit" class="btn btn-primary">Guardar cambios</button>
        <a href="{{ route('importacion.index') }}" class="btn btn-secondary">Volver</a>
    </form>

    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
