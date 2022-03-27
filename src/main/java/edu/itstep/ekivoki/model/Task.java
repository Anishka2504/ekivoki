package edu.itstep.ekivoki.model;

import edu.itstep.ekivoki.model.parent.NameEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code Task} class is intended for description of the essence of game tasks. Each task has
 * the type (gestures, drawing, plasticine etc) and directly assignment condition.
 * @author Anna Drozdovskaya
 * @version 1.0
 */

@Getter
@Setter
public class Task extends NameEntity {

    private String description;
}
