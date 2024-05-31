<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Nuevo Cliente</title>
    
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    
</head>
<body>
    <div class="container mt-5">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <h2>Crear Nuevo Cliente</h2>
                
                {{-- Mostrar mensajes de error --}}
                @if ($errors->any())
                    <div class="alert alert-warning">
                        <ul>
                            @foreach ($errors->all() as $error)
                                <li>{{ $error }}</li>
                            @endforeach
                        </ul>
                    </div>
                @endif
                
                <form action="{{ route('clientes.store') }}" method="post">
                    @csrf
                    <div class="mb-3">
                        <label for="cuit" class="form-label">CUIT:</label>
                        <input type="text" class="form-control" id="cuit" name="cuit" required>
                    </div>
                    <div class="mb-3">
                        <label for="razon_social" class="form-label">Razón Social:</label>
                        <input type="text" class="form-control" id="razon_social" name="razon_social" required>
                    </div>
                    <div class="mb-3">
                        <label for="nro_cliente" class="form-label">Nro de Cliente:</label>
                        <input type="text" class="form-control" id="nro_cliente" name="nro_cliente" required>
                    </div>
                    <div class="d-flex justify-content-around">
                        <button type="submit" class="btn btn-primary">Crear Cliente</button>
                        
                        <!-- Botón para volver a /importacion -->
                        <a href="{{ url('/importacion') }}" class="btn btn-secondary">Volver</a>
                    </div>
                </form>
            </div>
        </div>
    </div>

    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
    
</body>
</html>



