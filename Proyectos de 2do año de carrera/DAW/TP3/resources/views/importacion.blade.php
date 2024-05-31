<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Importación Masiva de Ventas</title>
        
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    </head>
    <body>

        @if ($errors->any())
        <div class="alert alert-warning" role="alert">
            <strong>Error(es):</strong>
            <ul>
                @foreach($errors->all() as $error)
                <li>{{ $error }}</li>
                @endforeach
            </ul>
        </div>
        @endif




        <div class="container mt-5">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <h2>Importación Masiva de Ventas</h2>
                    <form action="{{ route('procesar.importacion') }}" method="post" enctype="multipart/form-data">
                        @csrf
                        <div class="mb-3">
                            <label for="archivoCSV" class="form-label">Seleccionar archivo CSV:</label>
                            <input type="file" class="form-control" id="archivoCSV" name="archivoCSV" accept=".csv" required>
                        </div>
                        <button type="submit" class="btn btn-primary">Importar Ventas</button>
                    </form>

                    <!-- Agregar enlaces para crear nuevo cliente -->

                    <a href="{{ route('clientes.create') }}" class="btn btn-success mt-3">Crear Nuevo Cliente</a>

                    <!-- Agregar tabla para listar clientes -->
                    <h2 class="mt-5">Listado de Clientes</h2>
                    <table class="table">
                        @if(!empty($clientes))
                        <thead>
                            <tr>
                                <th>CUIT</th>
                                <th>Razón Social</th>
                                <th>Nro Cliente</th>
                                <th>Acciones</th> <!-- Nueva columna para enlaces de edición -->
                            </tr>
                        </thead>
                        <tbody>
                            @foreach($clientes as $cliente)
                            <tr>
                                <td>{{ $cliente->cuit }}</td>
                                <td>{{ $cliente->razon_social }}</td>
                                <td>{{ $cliente->nro_cliente }}</td>
                                <td>
                                    <!-- Enlace de edición -->
                                    <a href="{{ route('clientes.edit', ['cliente' => $cliente->cuit]) }}">Editar</a>
                                </td>
                            </tr>
                            @endforeach
                        </tbody>
                        @else
                        <thead>
                            <tr>
                                <th>CUIT</th>
                                <th>Razón Social</th>
                                <th>Nro Cliente</th>
                                <th>Acciones</th> <!-- Nueva columna para enlaces de edición -->
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td colspan="4">No hay clientes disponibles</td>
                            </tr>
                        </tbody>
                        @endif
                    </table>

                </div>
            </div>
        </div>





        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>



