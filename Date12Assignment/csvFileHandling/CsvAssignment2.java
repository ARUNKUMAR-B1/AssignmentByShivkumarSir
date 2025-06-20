package Date12Assignment.csvFileHandling;

import java.io.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.Set;

public class CsvAssignment2 {
    public static void main(String[] args) {
        Long starttime=System.currentTimeMillis();
        File file = new File("C:\\Users\\Admin\\Desktop\\members.csv");
        validatorFile(file);
        Long endtime=System.currentTimeMillis();
        System.out.println(endtime-starttime);
    }

    static void validatorFile(File csv) {
        File validFile = new File("ValidatedMembers1.csv");
        File invalidFile = new File("FailedRecords1.csv");
        //print the path of the files
        System.out.println(invalidFile.getAbsoluteFile());
        System.out.println(validFile.getAbsoluteFile());

        try (
                BufferedReader reader = new BufferedReader(new FileReader(csv));
                BufferedWriter validatedWriter = new BufferedWriter(new FileWriter(validFile));
                BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(invalidFile));
        ) {
            String line = reader.readLine();
            // adding first line to the valid Members and invalid Memebers file
            validatedWriter.append(line + "\n");
            invalidWriter.append(line + "\n");

            //uniqness check
            Set<String> unique = new HashSet<>();

            //applyying while loop for checing he conditions
            while ((line = reader.readLine()) != null) {
                // splitting the lines on the terms of comma
                String[] data = line.split(",");

                //eliminate leading and trailing spaces
                String siNo = data[0].trim();
                String fname = data[1].trim();
                String lname = data[2].trim();
                String dob = data[3].trim();
                String gender = data[4].trim();
                String education = data[5].trim();
                String house = data[6].trim();
                String address1 = data[7].trim();
                String address2 = data[8].trim();
                String city = data[9].trim();
                String pincode = data[10].trim();
                String mobileNo = data[11].trim();
                String company = data[12].trim();
                String monthlySalary = data[13].trim();

                //checking all fields are mandatory
                // if all fields are not empty --measn length of the string should not be equal to zero
                if (siNo.isEmpty() || fname.isEmpty() || lname.isEmpty() || gender.isEmpty() || dob.isEmpty() || education.isEmpty() || address1.isEmpty() || address2.isEmpty() || city.isEmpty() || pincode.isEmpty() || company.isEmpty() || mobileNo.isEmpty() || monthlySalary.isEmpty()) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                String uniqueKey = fname + lname + dob + gender;
                if (!unique.add(uniqueKey)) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                //regex for the house number
                String houseRegex = "^\\d{3,}";
                if (!house.matches(houseRegex)) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                //in address found any special characters remove with null values
                address1 = address1.replaceAll("[^a-zA-Z0-9 ,]", "");
                address2 = address2.replaceAll("[^a-zA-Z0-9 ,]", "");

                //Regex for gender
                String genderRegex = "(?i)(Male|Female)";
                if (!gender.matches(genderRegex)) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                //regex for education
                String educationRegex = "[a-zA-Z.]+";
                if (!education.matches(educationRegex)) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                // regex for city
                String cityRegex = "[a-zA-Z]+";
                if (!city.matches(cityRegex)) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                //pin code regex
                String pinCodeRegex = "\\d{6}";
                if (!pincode.matches(pinCodeRegex)) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                //mobile number validation
                String mobRegex = "^[789]\\d{9}";
                if (!mobileNo.matches(mobRegex)) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                // company regex
                String companyRegex = "[a-zA-Z]+";
                if (!company.matches(companyRegex)) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                // dob should not be future and age should not be more than 100
                try {
                    LocalDate today = LocalDate.now();
                    LocalDate dobDate;
                    if (dob.contains("/")) {
                        dobDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("d/M/yyyy"));
                    } else if (dob.contains("-")) {
                        dobDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("d-M-yyyy"));
                    } else {
                        invalidWriter.write(line + "\n");
                        continue;
                    }

                    int age = Period.between(dobDate, today).getYears();
                    if (age > 100 || dobDate.isAfter(today)) {
                        invalidWriter.write(line + "\n");
                        continue;
                    }
                } catch (DateTimeParseException e) {
                    invalidWriter.write(line + "\n");
                    continue;
                }

                validatedWriter.write(line + "\n");
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
