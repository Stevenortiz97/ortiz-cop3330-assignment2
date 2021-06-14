package Assignment2.ex34;
import java.util.ArrayList;
import java.util.List;

public class names {

        public static void namesNew(String removedEmployee) {

            List<String> list = new ArrayList<>();

            list.add("John Smith");
            list.add("Jackie Jackson");
            list.add("Chris Jones");
            list.add("Amanda Cullen");
            list.add("Jeremy Goodwin");

            switch (removedEmployee) {

                case "John Smith" -> list.remove("John Smith");
                case "Jackie Jackson" -> list.remove("Jackie Jackson");
                case "Chris Jones" -> list.remove("Chris Jones");
                case "Amanda Cullen" -> list.remove("Amanda Cullen");
                case "Jeremy Goodwin" -> list.remove("Jeremy Goodwin");
            }

            System.out.println("There are 4 employees:");

            for (String s : list) {
                System.out.println(s);
            }
        }
    }


