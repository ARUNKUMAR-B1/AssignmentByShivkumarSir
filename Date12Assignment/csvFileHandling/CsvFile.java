package Date12Assignment.csvFileHandling;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class CsvFile {
    public static void main(String[] args) {
        File csv = new File("people.csv");
        System.out.println("CSV Path: " + csv.getAbsoluteFile());

        // Step 1: Sample data writing
        try (FileWriter writer = new FileWriter(csv)) {
            writer.append("First Name,Last Name,Gender,DOB ,Address,Mobile\n");
           //all fields are mandatory
            writer.write("arun, , , , , ,\n");
            writer.write("arun, , , , ,\n");
            //checking for uniqueness
            writer.write("arun,kumar,male,2000-03-09,lingapura,7795801404\n");
            writer.write("arun,kumar,male,2000-03-09,lingapura,7795801404\n");

            //passing special characters in the address
            writer.write("arun,kumar,male,2002-03-09,l@ingapura,7795801404\n");
            writer.write("arun,kumar,male,2004-03-09,l$@#ingapura,7795801404\n");
            writer.write("arun,kumar,male,2006-03-09,l$@#in&ga^pur*a,7795801404\n");

            //mobile number validation,starts with 7 8 9 and consists of 10 digits

            //strsts with 8 a,true added in the validation file
            writer.write("arun,kumar,male,2007-03-09,l$@#in&ga^pur*a,8795801404\n");
            //strats  with 8 and 11 digits ,added in the invalidatyion file
            writer.write("arun,kumar,male,2008-03-09,l$@#in&ga^pur*a,87958014042\n");
            // starts with 8 and have 9 digits
            writer.write("arun,kumar,male,1995-03-09,l$@#in&ga^pur*a,895801404\n");
            // starts with 7 and 10 digits
            writer.write("arun,kumar,male,2009-03-09,l$@#in&ga^pur*a,7795801404\n");
            //strats with 7 and have 11 digits
            writer.write("arun,kumar,male,1991-03-09,l$@#in&ga^pur*a,77958014044\n");
            //starts with 7 and have 9 digits
            writer.write("arun,kumar,male,1992-03-09,l$@#in&ga^pur*a,779580140\n");
            //starts with 9 and have 10 digits
            writer.write("arun,kumar,male,1993-03-09,l$@#in&ga^pur*a,9795801404\n");
            //starts with 9 and have 11 digits
            writer.write("arun,kumar,male,1994-03-09,l$@#in&ga^pur*a,99795801404\n");
            // starts with 9 and have 9 digits
            writer.write("arun,kumar,male,1995-03-09,l$@#in&ga^pur*a,995801404\n");

            // date of bith should not be future and the age should not be greate than 100
           //future dob
            writer.write("arun,kumar,male,2995-03-09,l$@#in&ga^pur*a,995801404\n");
            //eliminate those who born before 1925
            writer.write("arun,kumar,male,1924-03-09,l$@#in&ga^pur*a,995801404\n");
            //add those of 99 years of age
            writer.write("arun,kumar,male,1926-03-09,l$@#in&ga^pur*a,995801404\n");



            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Step 2: Validation
        validatorFile(csv);
    }

    static void validatorFile(File csvFile) {
        Set<String> uniqueSet = new HashSet<>();
        File validFile = new File("ValidatedMembers.csv");
        File invalidFile = new File("FailedRecords.csv");

        System.out.println(invalidFile.getAbsoluteFile());
        System.out.println(validFile.getAbsoluteFile());

        try (//java 7--avoid writer.close();
                BufferedReader reader = new BufferedReader(new FileReader(csvFile));
                FileWriter validWriter = new FileWriter(validFile);
                FileWriter invalidWriter = new FileWriter(invalidFile)
        ){
            String line = reader.readLine();//read the first line from the csv file and add as a header in both the file
            validWriter.write(line + "\n");
            invalidWriter.write(line + "\n");

//            if((line=reader.readLine())==null){
//                invalidWriter.write((line)+"\n");
//            }

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(",");
                // all fields are mandatory ,if one is not given added to invalid file
                if (words.length < 6) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                //removing the trailiong and leadiong spaces in a string
                String fname = words[0].trim();
                String lname = words[1].trim();
                String gender = words[2].trim();
                String dobStr = words[3].trim();
                String address = words[4].trim();
                String mobile = words[5].trim();


                // All fields mandatory
                if (fname.isEmpty() || lname.isEmpty() || gender.isEmpty() || dobStr.isEmpty() || address.isEmpty() || mobile.isEmpty()) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                // Uniqueness check
                String uniqueKey = fname + lname + gender + dobStr;
                if (!uniqueSet.add(uniqueKey)) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                //if address found any specil characters remove them
                String address2 = address.replaceAll("[@#!$%^&*></]","");



                //  Mobile number check
                if (!mobile.matches("^[789]\\d{9}$")) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                // DOB not future & age <= 100
                LocalDate dob = LocalDate.parse(dobStr);
                LocalDate today = LocalDate.now();
                int age = Period.between(dob, today).getYears();
                if (dob.isAfter(today) || age > 100) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                // If all valid
                validWriter.write(fname+","+lname+","+gender+","+dobStr+","+mobile+","+address2+"\n");
            }

            System.out.println("Validation complete. Check 'ValidatedMembers.csv' and 'FailedRecords.csv'.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
