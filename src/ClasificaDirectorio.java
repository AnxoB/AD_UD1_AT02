import java.io.File;

public class ClasificaDirectorio {
    public void segunExtension(String dir) {
        // Creamos un objeto File que guarda el directorio padre
        File padre = new File(dir);
        if (padre.exists()) {

            // Comprobamos si es un directorio
            if (padre.isDirectory()) {
                // Comprobamos si el directorio está vacio
                if (padre.list().length == 0) {
                    System.out.println("El directorio está vacio");
                }
                // Si no esta vacio
                else {
                    // Creamo una lista de archivos que hay dentro del directorio padre
                    File[] lista = padre.listFiles();
                    for (File fichero : lista) {
                        // Comprobamso si el archivo es fichero o directorio para ahorrar iteraciones
                        if (fichero.isFile()) {
                            // Obtenemos la extension del fichero buscando en el su nombre a partir del
                            // punto
                            String extension = "";
                            int i = fichero.getName().lastIndexOf('.');
                            // Si el archivo no empieza por punto se coge todo lo que sigue al punto y se
                            // almacena en la variable extension
                            if (i > 0) {
                                extension = fichero.getName().substring(i + 1).toUpperCase();
                            }
                            // Se crea el directorio en la ruta del padre con el nombre de la extensión, si
                            // ya existe el directorio no lo vuelve a crear
                            File hijo = new File(padre.getPath(), extension);
                            hijo.mkdir();
                            // Movemos el fichero que estaba en el directorio padre a su respectivo
                            // directorio
                            File nuevaRuta = new File(padre.getPath() + "/" + hijo.getName() + "/" + fichero.getName());
                            fichero.renameTo(nuevaRuta);

                        }

                    }
                }

            } else {
                System.out.println("El parametro debe de ser un directorio");
            }
        } else {
            System.out.println("Introduce un directorio que exista");
        }
    }
}
