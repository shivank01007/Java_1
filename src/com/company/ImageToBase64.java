package com.company;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Base64;

public class ImageToBase64 {

    public static void encodeImage(String iPath, String sPath) throws Exception{
        FileInputStream imageStream = new FileInputStream(iPath);
        byte[] data = imageStream.readAllBytes();
        String imageString = Base64.getEncoder().encodeToString(data);

        FileWriter fileWriter = new FileWriter(sPath);
        fileWriter.write(imageString);

        fileWriter.close();
        imageStream.close();
    }

    public static void main(String[] args) throws Exception {
        encodeImage("C:\\Users\\MQT\\Desktop\\Image.jpg","C:\\Users\\MQT\\Desktop\\Image.txt");
    }
}
