import java.io.*;

public class FileIODemo {
    public static void main(String args[]) {
      /*  try {
            FileOutputStream fout = new FileOutputStream("desktop:bharathi.txt");
            String s = "Hi I am bharathi";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success........");
        } catch (Exception e) {
            System.out.println(e);
        }*/
        try {
            FileInputStream fin = new FileInputStream("/home/cts1/Downloads/bharathi.txt");
            int i;
            while ((i = fin.read())!= -1) {
                System.out.println((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
