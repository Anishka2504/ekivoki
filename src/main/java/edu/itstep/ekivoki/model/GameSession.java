package edu.itstep.ekivoki.model;

import edu.itstep.ekivoki.model.parent.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class GameSession extends BaseEntity {

    private UUID session_uuid;
    private Date date_creation;
}
