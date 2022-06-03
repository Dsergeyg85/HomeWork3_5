import java.io.*;

class CreationLog {

    public static void creationLog(String message) throws IOException {
        /*StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream(Main.basePath + "/temp/temp.txt")) {
            int i;
            while((i = fileInputStream.read()) != -1) {
                stringBuilder.append((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(Main.basePath + "/temp/temp.txt")) {
            stringBuilder.append(message + '\n');
            byte[] bytes = stringBuilder.toString().getBytes();
            fileOutputStream.write(bytes, 0, bytes.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/
        try (FileWriter writer = new FileWriter(Main.basePath + "/temp/temp.txt", true)) {
            writer.append("\n");
            writer.write(message);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
