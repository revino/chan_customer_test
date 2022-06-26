package com.chan.CustomerSample.controller;

import com.chan.CustomerSample.config.ApplicationUrlConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class Hello {

    private final ApplicationUrlConfig applicationUrlConfig;

    @GetMapping("/")
    public Object Hi(){
        HashMap<String, String> result = new HashMap<>();
        result.put("data", "hi");
        return result;
    }

    @GetMapping("/customerHi")
    public Object HELLO(){
        HashMap<String, String> result = new HashMap<>();
        result.put("data", "hello customer");
        return result;
    }

    @GetMapping("/customerToSeller")
    public String CustomerToSeller(){
        //Spring restTemplate
        HashMap<String, Object> result = new HashMap<String, Object>();
        String jsonInString = "";
        String url = "http://" + applicationUrlConfig.getSellerUrl();

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders header = new HttpHeaders();
        HttpEntity<?> entity = new HttpEntity<>(header);

        UriComponents uri = UriComponentsBuilder.fromHttpUrl(url).build();

        ResponseEntity<?> resultMap = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, Object.class);

        result.put("statusCode", resultMap.getStatusCodeValue()); //http status code를 확인
        result.put("header", resultMap.getHeaders()); //헤더 정보 확인
        result.put("body", resultMap.getBody()); //실제 데이터 정보 확인

        //데이터를 제대로 전달 받았는지 확인 string 형태로 파싱해줌
        ObjectMapper mapper = new ObjectMapper();
        jsonInString = result.get("body").toString();

        return "hello customer + " + jsonInString;
    }
}

