import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        PlataformaStreaming plataforma = new PlataformaStreaming();


        System.out.println("MI MEUUUUUUUUUUUUU");


        do {
            try {
                System.out.println("---------------Plataforma de streaming----------");
                System.out.println("1.Agregar usuario");
                System.out.println("2.Ver reporte");
                System.out.println("0.Salir");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1: {
                        System.out.println("Ingrese su correo: ");
                        String correo = teclado.next();
                        System.out.println("Cuantos meses va a contratar? : ");
                        int meses = teclado.nextInt();
                        System.out.println("Seleccione un plan");
                        System.out.println("1.Basico");
                        System.out.println("2.Estandar");
                        System.out.println("3.Premium");
                        int opcionPlan = teclado.nextInt();

                        switch (opcionPlan) {
                            case 1: {
                                UsuarioBasico usuarioBasico = new UsuarioBasico(correo, meses);
                                plataforma.AgregarCuentaUsuario(usuarioBasico);
                                double total = usuarioBasico.obtenerTotalPagar();
                                System.out.println(total);
                            }
                            break;

                            case 2: {
                                UsuarioEstandar usuarioEstandar = new UsuarioEstandar(correo, meses);
                                plataforma.AgregarCuentaUsuario(usuarioEstandar);
                                double total = usuarioEstandar.obtenerTotalPagar();
                                System.out.println(total);
                            }
                            break;

                            case 3: {
                                UsuarioPremium usuarioPremium = new UsuarioPremium(correo, meses);
                                plataforma.AgregarCuentaUsuario(usuarioPremium);
                                double total = usuarioPremium.obtenerTotalPagar();
                                System.out.println(total);
                            }
                            break;
                        }
                    }
                    break;

                    case 2: {
                        plataforma.Reporte();
                    }
                    break;

                    case 0: {
                        System.out.println("Saliendo... adios.");
                    }
                    break;

                    default: {
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