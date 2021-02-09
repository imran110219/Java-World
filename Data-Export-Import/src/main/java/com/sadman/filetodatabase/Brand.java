package com.sadman.filetodatabase;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.Date;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Brand {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String username = "root";
        String password = "12345678";

        String excelFilePath = "Medicine Database.xlsx";


        Connection connection = null;

        try {
            long start = System.currentTimeMillis();

            FileInputStream inputStream = new FileInputStream(excelFilePath);

            Workbook workbook = new XSSFWorkbook(inputStream);

            Sheet firstSheet = workbook.getSheetAt(4);
            Iterator<Row> rowIterator = firstSheet.iterator();

            connection = DriverManager.getConnection(jdbcURL, username, password);
            connection.setAutoCommit(false);

//            String sql = "INSERT INTO brand (id, name, strength, dosage, generic, company, price) VALUES (?,?,?,?,?,?,?)";
            String sql = "INSERT INTO brand (id, name, dosage) VALUES (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            int count = 0;

//            rowIterator.next(); // skip the header row
            DataFormatter formatter = new DataFormatter();
            while (rowIterator.hasNext()) {
                Row nextRow = rowIterator.next();
//                Iterator<Cell> cellIterator = nextRow.cellIterator();

                count++;
                String name = nextRow.getCell(0).getStringCellValue();
//                String strength = formatter.formatCellValue(nextRow.getCell(1));
                String dosage = nextRow.getCell(2).getStringCellValue();
//                String generic = nextRow.getCell(3).getStringCellValue();
//                String company = nextRow.getCell(4).getStringCellValue();
//                String price = nextRow.getCell(5).getStringCellValue();


                statement.setInt(1, count);
                statement.setString(2, name);
//                statement.setString(3, strength);
                statement.setString(3, dosage);
//                statement.setString(5, generic);
//                statement.setString(6, company);
//                statement.setString(7, price);

                statement.addBatch();


                statement.executeBatch();


            }

            workbook.close();

            // execute the remaining queries
            statement.executeBatch();

            connection.commit();
            connection.close();

            long end = System.currentTimeMillis();
            System.out.printf("Import done in %d ms\n", (end - start));

        } catch (IOException ex1) {
            System.out.println("Error reading file");
            ex1.printStackTrace();
        } catch (SQLException ex2) {
            System.out.println("Database error");
            ex2.printStackTrace();
        }
    }
}

