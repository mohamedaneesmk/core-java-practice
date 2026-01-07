import java.io.*;
public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello File!");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}

