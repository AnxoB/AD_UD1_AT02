import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FicheroBinario {
    File fichero;

    FicheroBinario(File fichero) {
        this.fichero = fichero;
    }

    public File getFichero() {
        return fichero;
    }

    public void escribir(String texto) {
        try {
            FileOutputStream file = new FileOutputStream(fichero);
            BufferedOutputStream buffer = new BufferedOutputStream(file);
            buffer.write(texto.getBytes());
            file.close();
        } catch (Exception e) {
            System.out.println("No se encuentra el archivo");
        }
    }

    public void leer() {
        try {
            FileInputStream file = new FileInputStream(fichero);
            BufferedInputStream buffer = new BufferedInputStream(file);
            buffer.read();

            file.close();
        } catch (Exception e) {
            System.out.println("No se encuentra el archivo");
        }
    }

    public void copiar(FicheroBinario ficheroDestino) {
        try {
            ficheroDestino.escribir("a");
        } catch (Exception e) {
            System.out.println("No se encuentra el archivo");
        }

    }

}
