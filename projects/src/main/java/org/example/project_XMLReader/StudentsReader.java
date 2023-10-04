package org.example.project_XMLReader;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentsReader {

    public static final String STUD_PATh = "lesson_27/students.xml";
    public static void main(String[] args) throws XMLStreamException {
        List<StudentXML> students = new ArrayList<>();
        StudentXML cur = null;
        StudAddress curAddress = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        InputStream resource = ClassLoader.getSystemResourceAsStream(STUD_PATh);
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(resource);

        while(xmlEventReader.hasNext()){
            XMLEvent xmlEvent = xmlEventReader.nextEvent();

            if(xmlEvent.isStartElement()){
                StartElement startElement = xmlEvent.asStartElement();
                String localPart = startElement.getName().getLocalPart();

                if(localPart.equals("student")){
                    cur = new StudentXML();
                    Attribute groupNumber = startElement.getAttributeByName(new QName("groupNumber"));
                    if(groupNumber!=null){
                        cur.setGroupNumber(Integer.parseInt(groupNumber.getValue()));
                    }
                }
                else if(localPart.equals("address")){
                    curAddress = new StudAddress();
                }
                else {
                    switch (localPart){
                        case "name" -> {
                            xmlEvent = xmlEventReader.nextEvent();
                            cur.setName(xmlEvent.asCharacters().getData());
                        }
                        case "surname" -> {
                            xmlEvent = xmlEventReader.nextEvent();
                            cur.setSurname(xmlEvent.asCharacters().getData());
                        }
                        case "faculty" -> {
                            xmlEvent = xmlEventReader.nextEvent();
                            cur.setFaculty(xmlEvent.asCharacters().getData());
                        }
                        case "street" -> {
                            xmlEvent = xmlEventReader.nextEvent();
                            curAddress.setStreet(xmlEvent.asCharacters().getData());
                        }
                        case "streetNumber" -> {
                            xmlEvent = xmlEventReader.nextEvent();
                            curAddress.setStreetNumber(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        }
                    }
                }
            }

            if(xmlEvent.isEndElement()){
                EndElement endElement = xmlEvent.asEndElement();
                if(endElement.getName().getLocalPart().equals("student")){
                    students.add(cur);
                }
                else if (endElement.getName().getLocalPart().equals("address")) {
                    cur.setAddress(curAddress);
                }
            }
        }
        students.forEach(System.out::println);
    }
}
