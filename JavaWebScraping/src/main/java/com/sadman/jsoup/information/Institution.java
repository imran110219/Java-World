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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sadman
 */
public class Institution {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Institutions");


        List<List<String>> institutions = new ArrayList<List<String>>();

        String url = "https://en.wikipedia.org/wiki/List_of_medical_colleges_in_Bangladesh";

        Document doc = Jsoup.connect(url).timeout(60000).validateTLSCertificates(false).get();
        Elements div = doc.body().getElementsByClass("mw-parser-output");
        System.out.println(div);

    }
}

