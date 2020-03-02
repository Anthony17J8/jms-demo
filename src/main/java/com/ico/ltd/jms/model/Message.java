package com.ico.ltd.jms.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
public class Message implements Serializable {

    private static final long serialVersionUID = 5735719984163672672L;

    private UUID id;

    private String message;
}
