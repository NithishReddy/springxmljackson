package com.example.springxmljackson.controllers;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.example.springxmljackson.dto.response.QwikBookResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.dataformat.xml.*;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/v1/api")
public class TestController {
    @RequestMapping(path = "/getmsg",method = RequestMethod.GET)
    public QwikBookResponse get() throws XMLStreamException, IOException{
        InputStream xmlResource = TestController.class.getClassLoader().getResourceAsStream("schema.xml");
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(xmlResource);

        XmlMapper xmlMapper = new XmlMapper();
        QwikBookResponse qwikBookResponse = xmlMapper.readValue(xmlStreamReader, QwikBookResponse.class);

        return qwikBookResponse;
    }

    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    public String home(){
        return "This is what i was looking for";                      
   }
}
