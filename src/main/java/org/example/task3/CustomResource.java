package org.example.task3;

import java.io.*;

//Try-with-resources
//Создай свой класс CustomResource, реализующий интерфейс AutoCloseable. В методе main используй его в блоке try-with-resources. Убедись, что методы close() вызываются даже при возникновении исключения.

public class CustomResource implements AutoCloseable {

    private FileReader resource;

    public FileReader openFile(String absolutePath) throws FileNotFoundException {

        resource = new FileReader(absolutePath);
        return resource;
    }

    public String outFileInformation() throws IOException {
        return resource != null ? "File information: " + resource.read() : null;
    }

    //дописать реализацию
    @Override
    public void close() throws IOException {
        if (resource == null) {
            System.out.println("closed already");
        } else {
            System.out.println("closed");
            resource.close();
        }
    }


    public static void main(String[] args) {
        try (CustomResource resource1 = new CustomResource()) {
            resource1.openFile("");
            System.out.println(resource1.outFileInformation());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
