
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void main(String[] args) {

        Person[] people = {new Person("Dima", 1), new Person("Lili", 2),
                        new Person("ViVi", 3)};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){

            oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
