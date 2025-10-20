package br.com.dio.persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class IOFilePersistence implements FilePersistence {

    private final String currrentDir = System.getProperty("user.dir");
    private final String storedDir = "/managedFiles/IO/";
    private final String fileName;

    public IOFilePersistence(String fileName) throws IOException {
        this.fileName = fileName;
        var file = new File(currrentDir + storedDir);
        if (!file.exists() && !file.mkdirs()) throw new IOException("erro ao criar arquivo");
    }

    @Override
    public String write(String data) {
        try(
                var fileWriter = new FileWriter(currrentDir + storedDir + fileName, true);
                var bufferedWrite = new BufferedWriter(fileWriter);
                var printWriter = new PrintWriter(bufferedWrite);
        ) {
            printWriter.println(data);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return data;
    }


    @Override
    public boolean remove(String sentence) {
        return false;
    }

    @Override
    public String replace(String oldContent, String newContent) {
        return "";
    }

    @Override
    public String findAll() {
        return "";
    }

    @Override
    public String findBy(String sentence) {
        return "";
    }

    private void clearFile() {
        try(OutputStream outputStream = new FileOutputStream(currrentDir + storedDir + fileName)){
           System.out.printf("inicializando recursos (%s)\n", currrentDir + storedDir + fileName);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private void createFile(){

    }
}