package com.weather.report.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@ToString
public class CoordResp implements Serializable{

    private String zip;
    private String name;
    private Double lat;
    private Double lon;
    private String country;

}
