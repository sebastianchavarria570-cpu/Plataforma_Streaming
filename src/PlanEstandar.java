public class PlanEstandar implements PlanSuscripcion{
    @Override
    public double calcularCosto (int meses) {
        return 9 * meses;
    }
}
