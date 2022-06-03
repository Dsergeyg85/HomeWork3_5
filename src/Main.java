import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    final static String basePath = "/Users/sergey/Desktop/Работа/Учеба/GitHW/HomeWork/HomeWork3_5/Result/Games";
    public static void main(String[] args) throws IOException {
        HashMap<Integer, HashMap<File, String>> creationMap = new HashMap<>();
        HashMap<File, String> dirAndFileMap = new HashMap<>();
        dirAndFileMap.put(new File(basePath + "/src"), "d");
        dirAndFileMap.put(new File(basePath + "/src/main"), "d");
        dirAndFileMap.put(new File(basePath + "/src/main/Main.java"), "f");
        dirAndFileMap.put(new File(basePath + "/src/main/Utils.java"), "f");
        dirAndFileMap.put(new File(basePath + "/src/test"), "d");
        dirAndFileMap.put(new File(basePath + "/res"), "d");
        dirAndFileMap.put(new File(basePath + "/res/drawables"), "d");
        dirAndFileMap.put(new File(basePath + "/res/vectors"), "d");
        dirAndFileMap.put(new File(basePath + "/res/icons"), "d");
        dirAndFileMap.put(new File(basePath + "/savegames"), "d");
        HashMap<File, String> logMap = new HashMap<>();
        logMap.put(new File(basePath + "/temp"), "d");
        logMap.put(new File(basePath + "/temp/temp.txt"), "f");
        creationMap.put(1, logMap);
        creationMap.put(2, dirAndFileMap);
        DirCreation.creationDir(creationMap.get(1));
        FileCreation.creationFile(creationMap.get(1));
        DirCreation.creationDir(creationMap.get(2));
        FileCreation.creationFile(creationMap.get(2));
    }
}
