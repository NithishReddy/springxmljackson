package com.example.springxmljackson.dto.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "ConfirmTicketResponse")
@JsonIgnoreProperties(ignoreUnknown = true)
public class QwikBookResponse {
    
    @JacksonXmlProperty(localName="ConfirmTicketResult")
    private QwikBookResponseData qwikBookResponseData;
}
