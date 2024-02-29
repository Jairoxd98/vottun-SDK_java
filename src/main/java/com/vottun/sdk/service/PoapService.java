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
        headers.setBearerAuth("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJqdGkiOiIyY1NYUzNSNGpLRkV3R1NJOWF1MkxKaXNUeWMiLCJ0eXBlIjoiZXJwIiwiaWQiOiIiLCJ1c2VybmFtZSI6ImphaXJvY3I5OEBob3RtYWlsLmNvbSIsImNpZCI6ImViMzM5YThhLTYyNWItNDM1Yi04NDRhLWQyYzRkOTBkMGIyYyIsInNrdSI6W3siciI6MTEsInMiOjMsImUiOjB9LHsiciI6MTEsInMiOjgwMDMsImUiOjB9LHsiciI6MTEsInMiOjgsImUiOjB9LHsiciI6MTEsInMiOjgwMDEsImUiOjB9LHsiciI6MTEsInMiOjgwMDUsImUiOjB9LHsiciI6MTEsInMiOjgwMTAsImUiOjB9LHsiciI6MTEsInMiOjgwMDIsImUiOjB9XSwicHVjIjoiMDAwMDAwMDAtMDAwMC0wMDAwLTAwMDAtMDAwMDAwMDAwMDAwIn0.bgLYR_jLFKch_FURFua_d8tEx6aWwkTE2Hi0mQwg2ehLZgOW9TwWQzPbzZJuU4WT6F8t5jNj395AKwj0YQac4lkkn6ANzd3ZbewHnQdtuwiq_DQ-rz0AjX7Ne3asjk3hcYBwFmJUf4m-GKjJN0wOsc5jGEYz2x0r9qOMaTve0WnjflgcB86yat-rHSif5AQPeQbJh6Rs9U82wmQyFhqjqxRYNRzLA0QwX3kufwGAW5cl8_6ngBlZ32wFUGbfWOW64yyDUDpo4lA1HOrm3vnjUXw51xPfFp5FqlBbUQbeuJDPBRo_Y-r1bMi75LwFYbnfYEWQ5-NX8G1uQYTaMtenaE1xAtWeJH02ElZSeJYxTVfCdaZAsIGehn2e4jdc0Muwe7x4XJmW6BwONBzn29lXugGYuwALk8r_pGA_NUZR9a9QkWXmSJ-BhOyEO2sREqcu6Nq0naadu_I3NoaGh_eHqKMti9VVVh6IpuTaC0AyIOk8AlvBb2jHi_NhJCpeZtyi_guPOmPoW-vrgmvzbx4VkViwvy7xlF5vHGLuWX1xpill0bR4rsIlYxjWz_GWwhv_CpXMK1jRYT3XdHisW5NF9GfNqFqEL67R2vhFAq_QJkgPPSdRyu6ctVD2vvimWl08Fds9i8Ctm8aXXfJuYMxn1zwLlvj7dzj6VvaxEVS6Vlk");
        headers.set("x-application-vkn", "TC4JfUT8nRd7dYXuo8Nl7jTZ-t0T-UDfvScXOgSNkfJEcJs6XrVXV3qD8I2UfXGB");

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
