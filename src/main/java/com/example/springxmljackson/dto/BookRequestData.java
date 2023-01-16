package com.example.springxmljackson.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

public class BookRequestData {
    @XmlElement(name="srir:TentaiveBookingReferenceNo")
    private String TentaiveBookingReferenceNo;

    @XmlElement(name="srir:Mobile")
    private String Mobile;

    public String getTentaiveBookingReferenceNo() {
        return this.TentaiveBookingReferenceNo;
    }

    public void setTentaiveBookingReferenceNo(String TentaiveBookingReferenceNo) {
        this.TentaiveBookingReferenceNo = TentaiveBookingReferenceNo;
    }

    public String getMobile() {
        return this.Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }     


    @Override
    public String toString() {
        return "{" +
            " TentaiveBookingReferenceNo='" + getTentaiveBookingReferenceNo() + "'" +
            ", Mobile='" + getMobile() + "'" +
            "}";
    }

}
