public class PlanBasico implements PlanSuscripcion{
    @Override
    public double calcularCosto (int meses) {
        return 5*meses;
    }
}
