public class UsuarioBasico extends CuentaUsuario{
    public UsuarioBasico(String correoElectronico, int meses) {
        super(correoElectronico, meses, new PlanBasico());
    }
}
