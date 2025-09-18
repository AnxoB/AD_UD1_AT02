import java.io.File;

public class Filtrar {

    public void filtrar(String ruta, String extension) {
        File directorio = new File(ruta);
        String[] lista = directorio.list();
        for (String nombre : lista) {
            if (nombre.endsWith(extension)) {
                System.out.println(nombre);
            }
        }
    }

}
