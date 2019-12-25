package com.gungor.alper.ngpostbackend.ngpostbackend.security;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Ag on 23.12.2019
 */
@Data
@AllArgsConstructor
public class AuthenticationResponse {
    private String authenticationToken;
    private String username;
    private String userType;
}
