package com.example.springxmljackson.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import com.example.springxmljackson.dto.BookRequestData;


@XmlRootElement(name = "srir:ConfirmTicket")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookRequest {
    @XmlElement(name="srir:confirmBookingInput")
    private BookRequestData bookRequestData;

    @XmlAttribute
    private String xmlns;


    public BookRequestData getBookRequestData() {
        return this.bookRequestData;
    }

    public void setBookRequestData(BookRequestData bookRequestData) {
        this.bookRequestData = bookRequestData;
    }

    public String getXmlns() {
        return this.xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }
   

    @Override
    public String toString() {
        return "{" +
            " bookRequestData='" + getBookRequestData() + "'" +
            ", xmlns='" + getXmlns() + "'" +
            "}";
    }
    
}