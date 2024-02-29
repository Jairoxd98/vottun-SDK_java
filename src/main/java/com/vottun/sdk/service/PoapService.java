package com.vottun.sdk.service;

import com.vottun.sdk.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.vottun.sdk.util.JsonUtil.convertObjectToJson;

@Service
@RequiredArgsConstructor
public class PoapService {

    private final RestTemplate restTemplate;
    private final String baseUrl = "https://api.vottun.tech/erc/v1/poap";

    private HttpEntity<String> createHttpEntityWithHeaders(String body) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth("");
        headers.set("x-application-vkn", "");

        return new HttpEntity<>(body, headers);
    }

    public ResponseDeploy deployPOAP(DeployPOAP request) {
        String requestJson = convertObjectToJson(request);
        HttpEntity<String> entity = createHttpEntityWithHeaders(requestJson);
        return restTemplate.postForObject(baseUrl + "/deploy", entity, ResponseDeploy.class);
    }

    public ResponseTransfer transferPOAP(TransferPOAP request) {
        String requestJson = convertObjectToJson(request);
        HttpEntity<String> entity = createHttpEntityWithHeaders(requestJson);
        return restTemplate.postForObject(baseUrl + "/transfer", entity, ResponseTransfer.class);
    }

    public ResponseBalance getBalanceOfPOAP(BalanceOfPOAP request) {
        String requestJson = convertObjectToJson(request);
        HttpEntity<String> entity = createHttpEntityWithHeaders(requestJson);
        return restTemplate.postForObject(baseUrl + "/balanceOf", entity, ResponseBalance.class);
    }

    public ResponseUri getTokenUri(TokenUriPOAP request) {
        String requestJson = convertObjectToJson(request);
        HttpEntity<String> entity = createHttpEntityWithHeaders(requestJson);
        return restTemplate.postForObject(baseUrl + "/tokenUri", entity, ResponseUri.class);
    }

}
