package com.sadman.filetodatabase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sadman
 */
public class Doctor {
    public static void main(String[] args) {
//        String jdbcURL = "jdbc:mysql://localhost:3306/medical_information?useSSL=false";
//        String username = "root";
//        String password = "12345678";

        String excelFilePath = "doctors.csv";

//        Connection connection = null;

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(excelFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            long start = System.currentTimeMillis();

//            connection = DriverManager.getConnection(jdbcURL, username, password);
//            connection.setAutoCommit(false);
//
//            String sql = "INSERT INTO institutions (id, name, acronym, university, established, started, enroll, location, website) VALUES (?,?,?,?,?,?,?,?,?)";
//            PreparedStatement statement = connection.prepareStatement(sql);

            int count = 0;

            FileWriter csvWriter = new FileWriter("new.csv");

            for (List<String> rowData : records) {
                csvWriter.append(String.join(",", rowData));
                csvWriter.append("\n");
            }


//            for (List<String> list:records) {
//                count++;
//                String name = list.get(1);
//                String acronym = list.get(2);
//                String versity = list.get(3);
//                String established = list.get(4);
//                String started = list.get(5);
//                String enroll = list.get(6);
//                String location = list.get(7);
//                System.out.println(list.get(0) + " | " + list.get(1) + " | " + list.get(2) + " | " + list.get(3) + " | " + list.get(4) + " | " + list.get(5) + " | " + list.get(6));
//                statement.setInt(1, count);
//                statement.setString(2, name);
//                statement.setString(3, acronym);
//                statement.setString(4, versity);
//                statement.setString(5, established);
//                statement.setString(6, started);
//                statement.setString(7, enroll);
//                statement.setString(8, location);
//                statement.setString(9, "");
//
//                statement.addBatch();
//                statement.executeBatch();
//            }

            // execute the remaining queries
//            statement.executeBatch();

//            connection.commit();
//            connection.close();

            long end = System.currentTimeMillis();
            System.out.printf("Import done in %d ms\n", (end - start));
        } catch (Exception ex) {
            System.out.println("Database error");
            ex.printStackTrace();
        }
    }
}
