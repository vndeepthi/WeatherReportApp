package com.weather.report.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Temp {

    private Double day;
    private Double min;
    private Double max;
    private Double night;
    private Double eve;
    private Double morn;
}
