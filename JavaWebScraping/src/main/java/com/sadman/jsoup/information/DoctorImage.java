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
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sadman
 */
public class DoctorImage {

    private static String IMAGE_DESTINATION_FOLDER = "E:/images";

    private static void downloadImage(String strImageURL){

        //get file name from image path
        String strImageName =
                strImageURL.substring( strImageURL.lastIndexOf("/") + 1 );

        System.out.println("Saving: " + strImageName + ", from: " + strImageURL);

        try {

            //open the stream from URL
            URL urlImage = new URL(strImageURL);
            InputStream in = urlImage.openStream();

            byte[] buffer = new byte[4096];
            int n = -1;

            OutputStream os =
                    new FileOutputStream( IMAGE_DESTINATION_FOLDER + "/" + strImageName );

            //write bytes to the output stream
            while ( (n = in.read(buffer)) != -1 ){
                os.write(buffer, 0, n);
            }

            //close the stream
            os.close();

            System.out.println("Image saved");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws  IOException {
        downloadImage("https://www.squarehospital.com/storage/images/1521001342Prof_Wahiuddin_(4).JPG");
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        XSSFSheet sheet = workbook.createSheet("doctors");
//
//
//        List<List<String>> doctors = new ArrayList<List<String>>();
//
//        for(int i=2; i<177; i++) {
//            String link = "https://www.squarehospital.com/doctors/"+i;
//
//            URL url = new URL(link);
//            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
//
//            int responseCode = huc.getResponseCode();
//            if(responseCode == 404){
//                System.out.println(404);
//                continue;
//            }
//
//            Document doc = Jsoup.connect(link).timeout(60000).validateTLSCertificates(false).get();
//
//            List<String> x = new ArrayList<String>();
//
//            Elements bodydivs = doc.body().getElementsByClass("col-lg-3 col-md-3 col-sm-3 col-xs-12 imgDiv2");
//            if (bodydivs.size() != 0) {
//                for (Element e : bodydivs) {
//                    System.out.println(e.getElementsByTag("p").text());
//                    x.add(e.getElementsByTag("p").text());
//                }
//            }
//            doctors.add(x);
//
//        }
//        System.out.println(Arrays.deepToString(doctors.toArray()));
//        System.out.println(doctors.size());
//
//        int rowCount = 0;
//
//        for (List<String> num: doctors) {
//            Row row = sheet.createRow(++rowCount);
//
//            int columnCount = 0;
//
//            for (String s1 : num) {
//                Cell cell = row.createCell(++columnCount);
//                if (s1 instanceof String) {
//                    cell.setCellValue((String) s1);
//                }
//            }
//
//        }
//
//
//        FileOutputStream outputStream = new FileOutputStream("doctors.xlsx");
//        workbook.write(outputStream);
    }
}
