package com.pankmri.korim.service;

import org.springframework.stereotype.Service;

/**
 * @Project user-activity
 * @Author mgohain
 * @Created 2019-11-16
 **/
@Service
public class JWTService {
    private static final String SERECT = "NUNU6";
    private static final long JWT_VALIDITY = 5*60*1000;

    private String generateJWTToken() {
        return null;
    }
}
