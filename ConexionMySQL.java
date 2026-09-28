package Ejercicio24_motoresBaseDatos;

public class ConexionMySQL implements ConexionBD {
    private boolean conectada = false;

    @Override
    public void conectar() {
        if (conectada) {
            System.out.println("[MySQL] Ya existe una conexión abierta.");
            return;
        }
        conectada = true;
        System.out.println("[MySQL] Conectado al puerto 3306.");
    }

    @Override
    public void ejecutarConsulta(String sql) {
        if (!conectada) {
            System.out.println("[MySQL] No se puede ejecutar la consulta: no hay conexión.");
            return;
        }
        System.out.println("[MySQL] Ejecutando en MySQL (relacional): " + sql);
    }

    @Override
    public void desconectar() {
        if (!conectada) {
            System.out.println("[MySQL] No hay conexión que cerrar.");
            return;
        }
        conectada = false;
        System.out.println("[MySQL] Conexión cerrada.");
    }
}
