import java.io.*;
import java.util.Arrays;


public class ReadFromFile {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

