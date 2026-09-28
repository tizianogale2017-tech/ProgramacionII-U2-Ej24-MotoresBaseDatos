package Ejercicio24_motoresBaseDatos;

public class ConexionMongoDB implements ConexionBD {
    private boolean conectada = false;

    @Override
    public void conectar() {
        if (conectada) {
            System.out.println("[MongoDB] Ya existe una conexión abierta.");
            return;
        }
        conectada = true;
        System.out.println("[MongoDB] Conectado al puerto 27017.");
    }

    @Override
    public void ejecutarConsulta(String sql) {
        if (!conectada) {
            System.out.println("[MongoDB] No se puede ejecutar la consulta: no hay conexión.");
            return;
        }
        System.out.println("[MongoDB] Ejecutando en MongoDB (NoSQL): " + sql);
    }

    @Override
    public void desconectar() {
        if (!conectada) {
            System.out.println("[MongoDB] No hay conexión que cerrar.");
            return;
        }
        conectada = false;
        System.out.println("[MongoDB] Conexión cerrada.");
    }
}
