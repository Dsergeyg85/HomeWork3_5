import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DirCreation {
    public static void creationDir (HashMap<File, String> map) throws IOException {
        HashMap<File, String> dirAndFileMap = map;
        for (Map.Entry<File, String> dirMap : dirAndFileMap.entrySet()) {
            if (dirMap.getValue().equals("d")) {
                if(dirMap.getKey().mkdirs()) {
                    CreationLog.creationLog("Directory " + dirMap.getKey().getName() + " was created");
                };
            }
        }
    }
}
