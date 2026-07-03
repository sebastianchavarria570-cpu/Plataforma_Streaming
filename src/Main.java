import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

//        plataformaStreaming = new plataformaStreaming();

        do {
            try {
                System.out.println("---------------Plataforma de streaming----------");
                System.out.println("1.Agregar usuario");
                System.out.println("Elige una opcion: ");
                opcion = teclado.nextInt();


            }catch (Exception e){
                System.out.println("Error, intenta de nuevo");
                teclado.nextLine();
            }
        }while (opcion != 8);
    }
}