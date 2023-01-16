package com.example.springxmljackson.dto.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Data
@JacksonXmlRootElement(localName = "ConfirmTicketResult")
@JsonIgnoreProperties(ignoreUnknown = true)
public class QwikBookResponseData {

    @JacksonXmlProperty(localName="Response")
    private QwikResponseObject qwikResponseObject;

    @JacksonXmlProperty(localName="TicketDetails")
    private QwikBookTicketDetails qwikBookTicketDetails;
}
