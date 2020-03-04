package com.ico.ltd.jms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloMessage implements Serializable {

    private static final long serialVersionUID = 5735719984163672672L;

    private UUID id;

    private String message;
}
