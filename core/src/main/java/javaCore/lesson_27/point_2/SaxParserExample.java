package javaCore.lesson_27.point_2;

import javaCore.lesson_27.point_1.EmployeeXml;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SaxParserExample {

    public static final String FILE_PASS = "lesson_27/employee.xml";

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = parserFactory.newSAXParser();

        InputStream resource = ClassLoader.getSystemResourceAsStream(FILE_PASS);
        SAXHandler handler = new SAXHandler();
        saxParser.parse(resource, handler);



    }
}

class SAXHandler extends DefaultHandler {

    private List<EmployeeXml> employees = new ArrayList<>();
    private EmployeeXml cur = null;
    private String content = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "employee":
                cur = new EmployeeXml();
                cur.setId(attributes.getValue("id"));
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case "firstName":
                cur.setFirstName(content);
                break;
            case "lastName":
                cur.setLastName(content);
                break;
            case "location":
                cur.setLocation(content);
                break;
            case "employee":
                employees.add(cur);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public List<EmployeeXml> getEmployees() {
        return employees;
    }

    public EmployeeXml getCur() {
        return cur;
    }

    public String getContent() {
        return content;
    }
}
