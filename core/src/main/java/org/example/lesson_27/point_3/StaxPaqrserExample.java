package org.example.lesson_27.point_3;

import org.example.lesson_27.point_1.EmployeeXml;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StaxPaqrserExample {

    public static final String FILE_PASS = "lesson_27/employee.xml";
    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
        List<EmployeeXml> employee = new ArrayList<>();
        EmployeeXml cur = null;

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

       XMLEventReader xsmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(FILE_PASS));
       while(xsmlEventReader.hasNext()){
           XMLEvent xmlEvent = xsmlEventReader.nextEvent();

           if(xmlEvent.isStartElement()){
               StartElement startElement = xmlEvent.asStartElement();
               String localPart = startElement.getName().getLocalPart();
               if(startElement.getName().getLocalPart().equals("employee")){
                   cur = new EmployeeXml();
                   Attribute id = startElement.getAttributeByName(new QName("id"));
                   if(id != null){
                       cur.setId(id.getValue());
                   }
               } else {
                   switch(localPart){
                       case "firstName" -> {
                           xmlEvent = xsmlEventReader.nextEvent();
                           cur.setFirstName(xmlEvent.asCharacters().getData());
                       }
                       case "lastName" -> {
                           xmlEvent = xsmlEventReader.nextEvent();
                           cur.setLastName(xmlEvent.asCharacters().getData());
                       }
                       case "location" -> {
                           xmlEvent = xsmlEventReader.nextEvent();
                           cur.setLocation(xmlEvent.asCharacters().getData());
                       }
                   }
               }
               if(xmlEvent.isEndElement()){
                   EndElement endElement = xmlEvent.asEndElement();
                   if(endElement.getName().getLocalPart().equals("employee")){
                       employee.add(cur);
                   }
               }
           }
       }

    }
}
