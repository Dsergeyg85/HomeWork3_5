import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileCreation {
    public static void creationFile (HashMap<File, String> map) throws IOException {
        HashMap<File, String> dirAndFileMap = map;
        for (Map.Entry<File, String> fileMap : dirAndFileMap.entrySet()) {
            if (fileMap.getValue().equals("f")) {
                if(fileMap.getKey().createNewFile()) {
                    CreationLog.creationLog("File " + fileMap.getKey().getName() + " was created");
                }
            }
        }
    }
}
