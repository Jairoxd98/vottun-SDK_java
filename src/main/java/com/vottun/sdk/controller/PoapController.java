package com.vottun.sdk.controller;

import com.vottun.sdk.dto.*;
import com.vottun.sdk.service.PoapService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/poap")
@RequiredArgsConstructor
public class PoapController {

    private final PoapService poapService;

    @PostMapping("/deploy")
    public ResponseDeploy deployPOAP(@RequestBody DeployPOAP request) {
        return poapService.deployPOAP(request);
    }

    @PostMapping("/transfer")
    public ResponseTransfer transferPOAP(@RequestBody TransferPOAP request) {
        return poapService.transferPOAP(request);
    }

    @PostMapping("/balanceOf")
    public ResponseBalance getBalanceOf(@RequestBody BalanceOfPOAP request) { return poapService.getBalanceOfPOAP(request); }

    @PostMapping("/tokenUri")
    public ResponseUri getTokenUri(@RequestBody TokenUriPOAP request) { return poapService.getTokenUri(request); }
}
