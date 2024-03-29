package com.sadman.jsoup.inventory;

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
public class Indication {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Indications");


        List<List<String>> indications = new ArrayList<List<String>>();

        for(int i=1; i<69; i++) {
            String url = "https://medex.com.bd/indications?page="+i;

            Document doc = Jsoup.connect(url).timeout(60000).validateTLSCertificates(false).get();

            Elements divs = doc.body().getElementsByClass("col-xs-12 col-sm-6 col-lg-4");
            if (divs.size() != 0) {
                for (Element div : divs) {
                    Elements es = div.getElementsByClass("col-xs-12 data-row-top");
                    for (Element e : es) {
//                System.out.println(i.getElementsByTag("a"));
                        System.out.println(e.getElementsByTag("a").attr("href"));
                        System.out.println(e.getElementsByTag("a").text());
                        List<String> x = new ArrayList<String>();
                        x.add(e.getElementsByTag("a").text());
                        x.add(e.getElementsByTag("a").attr("href"));
                        indications.add(x);


                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(indications.toArray()));
        System.out.println(indications.size());

        int rowCount = 0;

        for (List<String> num: indications) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;

            for (String s1 : num) {
                Cell cell = row.createCell(++columnCount);
                if (s1 instanceof String) {
                    cell.setCellValue((String) s1);
                }
            }

        }


        FileOutputStream outputStream = new FileOutputStream("indications.xlsx");
        workbook.write(outputStream);

//        String attr = div.attr("row");
//        System.out.println(attr);
//        System.out.println(doc.body().getElementsByClass("col-xs-12 col-sm-6 col-lg-4"));
    }
}
