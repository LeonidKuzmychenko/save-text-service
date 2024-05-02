package com.example.savetextservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IpInfo {

    @JsonProperty("ip")
    private String ip;
    @JsonProperty("hostname")
    private String hostname;
    @JsonProperty("city")
    private String city;
    @JsonProperty("region")
    private String region;
    @JsonProperty("country")
    private String country;
    @JsonProperty("loc")
    private String loc;
    @JsonProperty("org")
    private String org;
    @JsonProperty("postal")
    private String postal;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("readme")
    private String readme;

}