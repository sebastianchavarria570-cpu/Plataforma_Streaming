public class UsuarioEstandar extends CuentaUsuario{
    public UsuarioEstandar(String correoElectronico, int meses) {
        super(correoElectronico, meses, new PlanBasico());
    }
}
