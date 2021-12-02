package com.bigtree.fapi.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse {
    
    String endpoint;
    String method;
    String[] headers;
    String message;
    
}