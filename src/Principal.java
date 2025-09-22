import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ClasificaDirectorio clasifica = new ClasificaDirectorio();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta del directorio a clasificar");
        String ruta = sc.nextLine();
        clasifica.segunExtension(ruta);
    }
}
