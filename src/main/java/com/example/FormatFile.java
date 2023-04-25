package com.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FormatFile {
    public static void execute (String fileName) {
        Path filePath = Paths.get(fileName);

        StringBuilder updatedFile = new StringBuilder();
        String space;

        for(int count = 0; count < 4; count++){
            updatedFile.append(" ");
        }

        space = updatedFile.toString();

        String file;

        try{
            file = new String(Files.readAllBytes(filePath), StandardCharsets.UTF_8);
            file = file.replace("\t", space);
            Files.write(filePath, file.getBytes(StandardCharsets.UTF_8));
        }catch(IOException error) {
            error.printStackTrace();
        }
    }
}
