package com.weather.report;

import com.weather.report.dto.CoordResp;
import com.weather.report.dto.DailyReportResp;
import com.weather.report.dto.Temp;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Optional;

public class WeatherReportApp {

    public static void main(String[] args) {

        Client client = ClientBuilder.newClient();
        /*client.target("http://api.openweathermap.org/data/2.5/forecast/daily")
                .queryParam("lat", )
                .queryParam("lon", )
                .queryParam("cnt", 1)
                .queryParam("appid", )
                .request(MediaType.APPLICATION_JSON)
                .get(DailyReportResp.class);*/
        CoordResp resp = client.target("http://api.openweathermap.org/geo/1.0/zip")
                .queryParam("zip", "11789,US")
                .queryParam("appid", "")
                .request(MediaType.APPLICATION_JSON)
                .get(CoordResp.class);
        System.out.println("------------" + resp);
    }
}
