import java.io.File;
import java.io.FilenameFilter;

public class FiltrarNombre implements FilenameFilter{
    
    @Override
    public boolean accept(File dir, String extension) {
        return extension.endsWith(extension);
    }

}