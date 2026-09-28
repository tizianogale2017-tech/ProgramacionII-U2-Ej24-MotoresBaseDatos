package Ejercicio24_motoresBaseDatos;

public class Main {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionMySQL();
        conexion.ejecutarConsulta("SELECT * FROM clientes");
        conexion.conectar();
        conexion.conectar();
        conexion.ejecutarConsulta("SELECT * FROM clientes");
        conexion.desconectar();

        System.out.println("--- Cambio de motor ---");
        conexion = new ConexionPostgreSQL();
        conexion.conectar();
        conexion.ejecutarConsulta("SELECT nombre FROM productos WHERE stock > 0");
        conexion.desconectar();

        System.out.println("--- Cambio de motor ---");
        conexion = new ConexionMongoDB();
        conexion.conectar();
        conexion.ejecutarConsulta("db.pedidos.find({estado: 'pendiente'})");
        conexion.desconectar();
    }
}
