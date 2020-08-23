package com.musichubappfront.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketMasterResponseDto {

    private TmEmbeddedDto _embedded;
    private TmEmbeddedDto _links;

}
