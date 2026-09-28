package Ejercicio24_motoresBaseDatos;

public class ConexionPostgreSQL implements ConexionBD {
    private boolean conectada = false;

    @Override
    public void conectar() {
        if (conectada) {
            System.out.println("[PostgreSQL] Ya existe una conexión abierta.");
            return;
        }
        conectada = true;
        System.out.println("[PostgreSQL] Conectado al puerto 5432.");
    }

    @Override
    public void ejecutarConsulta(String sql) {
        if (!conectada) {
            System.out.println("[PostgreSQL] No se puede ejecutar la consulta: no hay conexión.");
            return;
        }
        System.out.println("[PostgreSQL] Ejecutando en PostgreSQL (relacional): " + sql);
    }

    @Override
    public void desconectar() {
        if (!conectada) {
            System.out.println("[PostgreSQL] No hay conexión que cerrar.");
            return;
        }
        conectada = false;
        System.out.println("[PostgreSQL] Conexión cerrada.");
    }
}
