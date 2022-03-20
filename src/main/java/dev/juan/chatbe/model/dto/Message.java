package dev.juan.chatbe.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Message implements Serializable {

    private String text;
    private String userName;
    private String type;
    private Long date;

    private static final long serialVersionUID = 6335788608736496166L;
}
