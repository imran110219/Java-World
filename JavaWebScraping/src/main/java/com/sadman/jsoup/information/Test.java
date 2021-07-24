package com.sadman.jsoup.information;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sadman
 */
public class Test {
    public static void main(String[] args) throws Exception {


//        String url = "https://www.squarehospital.com/doctors/2";


        URL url = new URL("https://www.squarehospital.com/doctors/1");
        HttpURLConnection huc = (HttpURLConnection) url.openConnection();

        int responseCode = huc.getResponseCode();
        System.out.println(responseCode);
//        Document doc = Jsoup.connect(url).timeout(60000).validateTLSCertificates(false).get();



    }
}
