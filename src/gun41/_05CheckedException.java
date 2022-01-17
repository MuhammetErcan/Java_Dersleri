package gun41;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _05CheckedException {
    public static void main(String[] args) {
        File f = new File("d:/a.txt");

        try {
            FileInputStream inputStream= new FileInputStream("d:a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
