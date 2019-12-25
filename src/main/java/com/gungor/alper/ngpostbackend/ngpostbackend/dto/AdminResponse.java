package com.gungor.alper.ngpostbackend.ngpostbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Ag on 25.12.2019
 */
@Data
@AllArgsConstructor
public class AdminResponse {
    String userCount;
    String postCount;

}
