package com.epam.mjc.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;



public class FileReader {

    public Profile getDataFromFile(File file)  {

//        String[] parts = null;
//        try{String content = new String(Files.readAllBytes(Paths.get(file.getPath())));
//
//
//            parts = content.split("\n");
//
//        }
//        catch(IOException f){
//            f.printStackTrace();
//        }
//
//
//
//        String[] parts0 = parts[0].split(": ");
//        String[] parts1 = parts[1].split(": ");
//        String[] parts2 = parts[2].split(": ");
//        String[] parts3 = parts[3].split(": ");
//
//
//
//        return new Profile(parts0[1].replaceAll("\\s",""), Integer.parseInt(parts1[1].replaceAll("\\s","")),
//                parts2[1].replaceAll("\\s",""), Long.parseLong(parts3[1].replaceAll("\\s","")));

        StringBuilder str = new StringBuilder();
        String line;


        try( BufferedReader my_Reader = new BufferedReader(new java.io.FileReader(file))) {




            while ((line = my_Reader.readLine()) != null) {
                str.append(line + "\n");
            }


        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        String singleString = str.toString();

        String[] parts = singleString.split("\n");

        String[] parts0 = parts[0].split(": ");
        String[] parts1 = parts[1].split(": ");
        String[] parts2 = parts[2].split(": ");
        String[] parts3 = parts[3].split(": ");



        return new Profile(parts0[1], Integer.parseInt(parts1[1]), parts2[1], Long.parseLong(parts3[1]));

    }
}
