package com.vottun.sdk.dto;

import lombok.Data;

@Data
public class BalanceOfPOAP {
    String contractAddress;
    int network;
    String address;
    int id;
}
