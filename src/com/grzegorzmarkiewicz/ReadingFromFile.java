package com.grzegorzmarkiewicz;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("employees.txt");
        PrintWriter writer = new PrintWriter("employees_sorted_by_id.txt");
        try {
            Stream<String> lines = Files.lines(path);
            List<Employee> employeesList = lines.map(line -> line.split(";"))
                    .map(employee -> new Employee(employee[0], employee[1], employee[2], Long.valueOf(employee[3])))
                    .sorted((o1, o2) -> (int)o1.getId() - (int)o2.getId())
                    .collect(Collectors.toList());
            for(Employee e : employeesList){
                writer.println(e.getName() + ";" + e.getSurname() + ";" + e.getPosition() + ";" + e.getId() + ";");
            }
            writer.close();
            } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
