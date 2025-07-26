package Day7;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

import java.io.File;

public class XML {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\M.SUPRAJA\\Downloads\\Employee.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            Element root = doc.getDocumentElement();
            System.out.println("Root Element: " + root.getNodeName());

            System.out.println("Name: " + root.getElementsByTagName("Name").item(0).getTextContent());
            System.out.println("Age: " + root.getElementsByTagName("Age").item(0).getTextContent());
            System.out.println("Department: " + root.getElementsByTagName("Department").item(0).getTextContent());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
