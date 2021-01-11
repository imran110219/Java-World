package com.sadman.jsoup;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IndicationGeneric {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("IndicationGeneric");


        List<List<String>> indicationGeneric = new ArrayList<List<String>>();

        String excelFilePath = "indications.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);

        Workbook workbook1 = new XSSFWorkbook(inputStream);

        Sheet firstSheet = workbook1.getSheetAt(0);
        Iterator<Row> rowIterator = firstSheet.iterator();
//        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row nextRow = rowIterator.next();
            String iName = nextRow.getCell(1).getStringCellValue();
            String iLink = nextRow.getCell(2).getStringCellValue();
            Document doc = Jsoup.connect(iLink).timeout(60000).validateTLSCertificates(false).get();
            Elements divs = doc.body().getElementsByClass("col-xs-12 col-sm-6 col-lg-4");
            if (divs.size() != 0) {
                for (Element div : divs) {
                    Elements es = div.getElementsByClass("col-xs-12 data-row-top");
                    for (Element e : es) {
                        System.out.println(e.getElementsByTag("a").attr("href"));
                        System.out.println(e.getElementsByTag("a").text());
                        List<String> x = new ArrayList<String>();
                        x.add(iName);
                        x.add(e.getElementsByTag("a").text());
                        x.add(e.getElementsByTag("a").attr("href"));
                        indicationGeneric.add(x);
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(indicationGeneric.toArray()));
        System.out.println(indicationGeneric.size());

        int rowCount = 0;

        for (List<String> num: indicationGeneric) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;

            for (String s1 : num) {
                Cell cell = row.createCell(++columnCount);
                if (s1 instanceof String) {
                    cell.setCellValue((String) s1);
                }
            }

        }
        FileOutputStream outputStream = new FileOutputStream("IndicationGeneric.xlsx");
        workbook.write(outputStream);
    }
}
