<?php

class Conexion {
    private $host = 'localhost:3307'; // Cambiar al nombre de tu servidor de base de datos
    private $usuario = 'root'; // Cambiar al nombre de usuario de tu base de datos
    private $clave = ''; // Cambiar a la contraseña de tu base de datos
    private $baseDeDatos = 'pruebadaw'; // Cambiar al nombre de tu base de datos
    private $conexion;

    public function __construct() {
        $dsn = "mysql:host={$this->host};dbname={$this->baseDeDatos}";
        try {
            $this->conexion = new PDO($dsn, $this->usuario, $this->clave);
            $this->conexion->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        } catch (PDOException $e) {
            die("Error de conexión: " . $e->getMessage());
        }
    }

    public function obtenerConexion() {
        return $this->conexion;
    }

    public function cerrarConexion() {
        $this->conexion = null;
    }
}




