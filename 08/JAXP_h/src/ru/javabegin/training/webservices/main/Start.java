package ru.javabegin.training.webservices.main;

import ru.javabegin.training.webservices.parsers.DomParser;
import ru.javabegin.training.webservices.parsers.SaxParser;
import ru.javabegin.training.webservices.parsers.StaxParser;



public class Start {
    
    public static void main(String[] args) {
//        String xmlPath = "c:\\test\\people2.xml";
        String xmlPath = "people2.xml";
//        new DomParser().parse(xmlPath);
//        new SaxParser().parse(xmlPath);
         new StaxParser().parse(xmlPath);
    }

}
