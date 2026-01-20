package FileOperations;

import java.io.*;

public class FileOperations {
    public static void main(String[] args) throws IOException {

        // File Creation

//        File file = new File("testing.txt");
//        try {
//            file.createNewFile();
//            System.out.println("File created at: " + file.getAbsolutePath());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        File Deletion

//        try {
//            boolean b = file.delete();
//            System.out.println("File deleted " + b);
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }

//        File Writting

//        try{
//            FileWriter fw = new FileWriter("test.txt");
//            fw.append("Code never lie...");
//            fw.close();
//            System.out.println("file written ");
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        //File reading

        FileInputStream fis = new FileInputStream("test.txt");
        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }
        fis.close();





//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//
//            while (br.ready()) {
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e) {
//            System.out.println("Error: " + e);
//        }
    }
}
