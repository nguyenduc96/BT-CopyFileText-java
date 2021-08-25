import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyTextFile copyTextFile = new CopyTextFile();

        List<String> strings = copyTextFile.readFile("folder.txt");
        copyTextFile.writeFile("foldercoppy.txt", strings);
    }
}
