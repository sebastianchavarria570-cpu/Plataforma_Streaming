public class PlanPremium implements PlanSuscripcion {
    @Override
    public double calcularCosto (int meses) {
        return 3 + (14*meses);
    }
}
