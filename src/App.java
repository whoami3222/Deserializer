import java.io.*;


public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvalidClassException {

        User user = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\David\\repos\\Serializer\\Serializer\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
