package org.example.lesson_27.point_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DOMParserExample {

    public static final String FILE_PASS = "lesson_27/employee.xml";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        InputStream resource = ClassLoader.getSystemResourceAsStream(FILE_PASS);

        Document document = documentBuilder.parse(resource);

        List<EmployeeXml> employees = new ArrayList<>();

        NodeList noteList = document.getDocumentElement().getChildNodes();

        for(int i = 0; i < noteList.getLength(); i++){
            Node node = noteList.item(i);
            if(node instanceof Element){
               EmployeeXml employee = new EmployeeXml();
               String id = node.getAttributes().getNamedItem("id").getNodeValue();
               employee.setId(id);

               NodeList childNodes = node.getChildNodes();
               for(int j = 0; j < childNodes.getLength(); j++){
                   Node cNode = childNodes.item(j);

                   if(cNode instanceof Element){
                       String contact = cNode.getLastChild().getTextContent();
                       switch(cNode.getNodeValue()){
                           case "firstName":
                               employee.setFirstName(contact);
                               break;
                           case "lastName":
                               employee.setLastName(contact);
                               break;
                           case "location":
                               employee.setLocation(contact);
                               break;
                       }
                   }
               }
               employees.add(employee);
            }
        }
    }
}
