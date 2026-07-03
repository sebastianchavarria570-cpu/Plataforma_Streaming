abstract class CuentaUsuario {
    private String correoElectronico;
    private int meses;
    private PlanSuscripcion planSuscripcion;

    public CuentaUsuario(String correoElectronico, int meses, PlanSuscripcion planSuscripcion) {
        this.correoElectronico = correoElectronico;
        this.meses = meses;
        this.planSuscripcion = planSuscripcion;
    }

    public double obtenerTotalPagar(){
    return planSuscripcion.calcularCosto(meses);
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public PlanSuscripcion getPlanSuscripcion() {
        return planSuscripcion;
    }

    public void setPlanSuscripcion(PlanSuscripcion planSuscripcion) {
        this.planSuscripcion = planSuscripcion;
    }
}
