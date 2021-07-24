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
public class Brand {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Brands");


        List<List<String>> brands = new ArrayList<List<String>>();

        for(int i=1; i<641; i++) {
            String url = "https://medex.com.bd/brands?page="+i;

            Document doc = Jsoup.connect(url).timeout(60000).validateTLSCertificates(false).get();

            Elements divs = doc.body().getElementsByClass("col-xs-12 col-sm-6 col-lg-4");
            if (divs.size() != 0) {
                for (Element div : divs) {
                    Elements es = div.getElementsByClass("hoverable-block");
                    for (Element e : es) {
                        String name = e.getElementsByClass("col-xs-12 data-row-top").text();
                        String link = e.getElementsByTag("a").attr("href");
                        String strength = e.getElementsByClass("col-xs-12 data-row-strength").text();
                        String generic = e.getElementsByClass("col-xs-12").get(2).text();
                        String company = e.getElementsByClass("col-xs-12").get(3).text();
                        String price = e.getElementsByClass("col-xs-12 packages-wrapper").text();
                        System.out.println(name);
                        System.out.println(link);
                        System.out.println(strength);
                        System.out.println(generic);
                        System.out.println(company);
                        System.out.println(price);
                        List<String> x = new ArrayList<String>();
                        x.add(name);
                        x.add(strength);
                        x.add(generic);
                        x.add(company);
                        x.add(price);
                        x.add(link);
                        brands.add(x);
                        System.out.println(e);
                    }
                    System.out.println(es.size());
                }
                System.out.println(divs.size());
            }
        }
        System.out.println(Arrays.deepToString(brands.toArray()));
        System.out.println(brands.size());

        int rowCount = 0;

        for (List<String> num: brands) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;

            for (String s1 : num) {
                Cell cell = row.createCell(++columnCount);
                if (s1 instanceof String) {
                    cell.setCellValue((String) s1);
                }
            }

        }


        FileOutputStream outputStream = new FileOutputStream("brands.xlsx");
        workbook.write(outputStream);

//        String attr = div.attr("row");
//        System.out.println(attr);
//        System.out.println(doc.body().getElementsByClass("col-xs-12 col-sm-6 col-lg-4"));
    }
}
