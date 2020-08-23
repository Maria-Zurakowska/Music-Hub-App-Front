package com.musichubappfront.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class YouTubeResponseDto {

    private String kind;
    private String etag;
    private String nextPageToken;
    private String regionCode;

    private YTPageInfoDto pageInfo;
    private List<YTItemDto> items;
 

}
