import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("C:\\Users\\Elena\\Documents\\Test\\CopyFile\\target\\input.txt");
            out = new FileWriter("C:\\Users\\Elena\\Documents\\Test\\CopyFile\\target\\output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
