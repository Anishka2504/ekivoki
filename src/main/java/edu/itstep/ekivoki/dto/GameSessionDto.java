package edu.itstep.ekivoki.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameSessionDto {

    private Long id;
    private String session_uuid;
    private String date_creation;
}
