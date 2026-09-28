package Ejercicio24_motoresBaseDatos;

public interface ConexionBD {
    void conectar();

    void ejecutarConsulta(String sql);

    void desconectar();
}
