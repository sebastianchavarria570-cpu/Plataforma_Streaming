import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        PlataformaStreaming plataforma = new PlataformaStreaming();

        do {
            try {
                System.out.println("---------------Plataforma de streaming----------");
                System.out.println("Ingrese su correo: ");
                String correo = teclado.next();
                System.out.println("Cuantos meses va a contratar? : ");
                int meses = teclado.nextInt();
                System.out.println("Seleccione un plan");
                System.out.println("1.Basico");
                System.out.println("2.Estandar");
                System.out.println("3.Premium");
                System.out.println("0.Salir");
                opcion = teclado.nextInt();

                switch (opcion){
                    case 1:{
                        PlanBasico planBasico = new PlanBasico();
                    }break;

                    case 2:{
                        PlanEstandar planEstandar = new PlanEstandar();
                    }break;

                    case 3:{
                        PlanPremium planPremium = new PlanPremium();
                    }break;

                    case 0:{
                        System.out.println("Saliendo... adios.");
                    }break;

                    default:{
                        System.out.println("Opcion invalida");
                    }
                }


            }catch (Exception e){
                System.out.println("Error, intenta de nuevo");
                teclado.nextLine();
            }
        }while (opcion != 0);
    }
}