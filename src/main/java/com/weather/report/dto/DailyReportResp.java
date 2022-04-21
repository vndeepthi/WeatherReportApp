package com.weather.report.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class DailyReportResp {

    private Long dt;
    private Temp temp;
}
