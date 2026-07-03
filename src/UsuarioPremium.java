public class UsuarioPremium extends CuentaUsuario{
    public UsuarioPremium(String correoElectronico, int meses) {
        super(correoElectronico, meses, new PlanPremium());
    }
}
