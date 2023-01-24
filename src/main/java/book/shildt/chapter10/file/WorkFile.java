package book.shildt.chapter10.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;


public class WorkFile {
    public static void main(String[] args) throws IOException {
        File archive = new File("archive.zip");

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(archive));// TODO: test
        FileInputStream fis = new FileInputStream("FileForBytesRead.txt");


        // ZipEntry zipEntry = ;

        // zos.putNextEntry(zipEntry);


        zos.close();

        try (FileInputStream fis1 = new FileInputStream("File.txt")) {

        }

    }
}
