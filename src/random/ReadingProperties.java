package random;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Automation_Program_Files\\Projects\\Java_Udemy_2\\src\\random\\test.properties";
        Properties prop = new Properties();
        FileInputStream fileStream = new FileInputStream(path);
        prop.load(fileStream);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("course"));
    }
}
