package com.training.ioPackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesClass {

    public static void main(String[] args) throws IOException {

//        Files.writeString(Paths.get("C:\\Users\\raushan\\Desktop\\output\\def.txt"), "Test");
        List<String> listOfWords = new ArrayList<>();
        listOfWords.add("This is java training");
        listOfWords.add("This is online java training");
//


        java.nio.file.Files.write(Paths.get("list.txt"), listOfWords, StandardCharsets.UTF_8);

        List<String> content = java.nio.file.Files.readAllLines(Paths.get("C:\\Users\\raushan\\Desktop\\output\\def.txt"));
//        System.out.println(content);

        content = java.nio.file.Files.readAllLines(Paths.get("list.txt"));
        System.out.println(content);
    }
}