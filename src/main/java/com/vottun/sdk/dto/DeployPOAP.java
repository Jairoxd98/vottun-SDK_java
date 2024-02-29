package com.vottun.sdk.dto;

import lombok.Data;

@Data
public class DeployPOAP {
    String name;
    int amount;
    String ipfsUri;
    int network;
    int gasLimit;
    String alias;
}
