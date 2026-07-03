import java.util.ArrayList;

public class PlataformaStreaming {
    private ArrayList<CuentaUsuario> cuentas;

    public PlataformaStreaming() {
        this.cuentas = new ArrayList<>();
    }

    public void AgregarCuentaUsuario(CuentaUsuario cuenta){
        this.cuentas.add(cuenta);
    }

    public void Reporte (){
    double total =0;
        System.out.println("----------------Reporte----------------");
        for  (CuentaUsuario cuenta : this.cuentas) {
            double costo = cuenta.obtenerTotalPagar();
            total += costo;

            String usuario = cuenta.getCorreoElectronico();

            System.out.println("Cuenta: "+usuario + " meses " +  cuenta.getMeses() + "Costo "+ costo);
        }

        System.out.println("Total de Recuadado: "+total);
    }








}
