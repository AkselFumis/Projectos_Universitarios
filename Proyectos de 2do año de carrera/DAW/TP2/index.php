<?php
require_once 'procesar_importacion.php';
?>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Importación Masiva de Ventas</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    </head>
    <body>

        <?php
        if (isset($_GET['errores'])) {
            $errores = $_GET['errores'];
            echo '<div class="alert alert-warning" role="alert">' . $errores . '</div>';
        }
        ?>


        <div class="container mt-5">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <h2>Importación Masiva de Ventas</h2>
                    <form action="procesar_importacion.php" method="post" enctype="multipart/form-data">
                        <div class="mb-3">
                            <label for="archivoCSV" class="form-label">Seleccionar archivo CSV:</label>
                            <input type="file" class="form-control" id="archivoCSV" name="archivoCSV" accept=".csv" required>
                        </div>
                        <button type="submit" class="btn btn-primary">Importar Ventas</button>
                    </form>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
    </body>
</html>
