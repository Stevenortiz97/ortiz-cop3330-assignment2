package Assignment2.ex34;
import java.util.ArrayList;
import java.util.List;

public class names {

        public static void updatedNames(String removedEmployee) {

            List<String> namesList = new ArrayList<>();
            namesList.add("John Smith");
            namesList.add("Jackie Jackson");
            namesList.add("Chris Jones");
            namesList.add("Amanda Cullen");
            namesList.add("Jeremy Goodwin");

            switch (removedEmployee) {
                case "John Smith" -> namesList.remove("John Smith");
                case "Jackie Jackson" -> namesList.remove("Jackie Jackson");
                case "Chris Jones" -> namesList.remove("Chris Jones");
                case "Amanda Cullen" -> namesList.remove("Amanda Cullen");
                case "Jeremy Goodwin" -> namesList.remove("Jeremy Goodwin");
            }

            System.out.println("There are 4 employees:");
            for (String s : namesList) {

                System.out.println(s);

            }

        }
    }


