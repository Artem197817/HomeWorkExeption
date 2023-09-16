package homeWork3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPerson {

    public void fileWriter(Person person) {
        try {
            if (person == null)
                throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Что то пошло не так");
            return;
        }
        File file = new File(person.getSurname() + ".txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(person.toString());
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

