package com.epam.mjc.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileReader {

    public Profile getDataFromFile(File file)  {

        String[] parts = null;
        try{String content = new String(Files.readAllBytes(Paths.get(file.getPath())));


            parts = content.split("\n");

        }
        catch(IOException f){
            f.printStackTrace();
        }



        String[] parts0 = parts[0].split(": ");
        String[] parts1 = parts[1].split(": ");
        String[] parts2 = parts[2].split(": ");
        String[] parts3 = parts[3].split(": ");



        return new Profile(parts0[1].replaceAll("\\s",""), Integer.parseInt(parts1[1].replaceAll("\\s","")),
                parts2[1].replaceAll("\\s",""), Long.parseLong(parts3[1].replaceAll("\\s","")));
    }
}
