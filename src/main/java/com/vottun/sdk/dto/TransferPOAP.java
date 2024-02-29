package com.vottun.sdk.dto;

import lombok.Data;

@Data
public class TransferPOAP {
    String contractAddress;
    int network;
    String to;
    int id;
}
