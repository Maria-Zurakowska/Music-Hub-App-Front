package com.musichubappfront.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TmPriceRangeDto {

    private String type;
    private String currency;
    private double min;
    private double max;
}
