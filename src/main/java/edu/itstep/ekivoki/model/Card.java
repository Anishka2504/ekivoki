package edu.itstep.ekivoki.model;

import edu.itstep.ekivoki.model.parent.LogEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card extends LogEntity {

    private Long topicId;
    private Long taskId;
    private int number;
    private String task;

}
