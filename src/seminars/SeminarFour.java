package seminars;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class SeminarFour {

    public void enterConsole(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<String>> employees = new ArrayList<>();
        int index = 1;

        while (true) {
            ArrayList<String> employee = new ArrayList<>();
            System.out.println("Введите фамилию сотрудника:");
            employee.add(scanner.nextLine());
            System.out.println("Введите имя сотрудника:");
            employee.add(scanner.nextLine());
            System.out.println("Введите отчество сотрудника:");
            employee.add(scanner.nextLine());
            System.out.println("Введите возраст сотрудника:");
            employee.add(scanner.nextLine());
            System.out.println("Введите пол сотрудника:");
            employee.add(scanner.nextLine());
            employee.add(String.valueOf(index));
            index++;
            employees.add(employee);

            System.out.println("Хотите добавить еще одного сотрудника? (да/нет)");
            String answer = scanner.nextLine();
            if (answer.equals("нет")) {
                break;
            }
        }

        // Сортировка по возрасту
        Collections.sort(employees, Comparator.comparingInt(o -> Integer.parseInt(o.get(3))));

        // Вывод данных в формате индекс, Фамилия И.О. возраст пол
        System.out.println("Вывод данных в формате индекс, Фамилия И.О. возраст пол с сортировкой по возрасту");
        for (ArrayList<String> employee : employees) {
            String fullName = employee.get(0) + " " + employee.get(1).toUpperCase().charAt(0) + "." + employee.get(2).toUpperCase().charAt(0) + ".";
            String age = employee.get(3);
            String gender = employee.get(4);
            String indexStr = employee.get(5);
            System.out.println(indexStr + ", " + fullName + " " + age + " " + gender);
        }
        System.out.println("Вывод данных в формате Фамилия И.О. возраст пол, индекс с сортировкой по Индексу, Возрасту, Полу");
        System.out.println("Индексу");
        Collections.sort(employees, Comparator.comparingInt(o -> Integer.parseInt(o.get(5))));

        for (List<String> employee : employees) {
            //System.out.println(employee);
            String fullName = employee.get(0) + " " + employee.get(1).toUpperCase().charAt(0) + "." + employee.get(2).toUpperCase().charAt(0) + ".";
            String age = employee.get(3);
            String gender = employee.get(4);
            String indexStr = employee.get(5);
            System.out.println(indexStr + ", " + fullName + " " + age + " " + gender);
        }
        System.out.println("Возрасту");
        Collections.sort(employees, Comparator.comparingInt(o -> Integer.parseInt(o.get(3))));
        for (List<String> employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Полу");
        Collections.sort(employees, Comparator.comparing(o -> o.get(4)));
        for (List<String> employee : employees) {
            System.out.println(employee);
        }
        //--------Сохранение в файл-------------

        /*try {
            FileWriter writer = new FileWriter("filename.txt");
            for (ArrayList str : employees) {
                writer.write(str + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
            File file = new File("filename.txt");
            Scanner scanner2 = new Scanner(file);

            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                employees.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(employees);*/

    }

}