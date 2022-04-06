package edu.itstep.ekivoki.model.parent;

import lombok.Getter;
import lombok.Setter;

/**
 * This class contains field "Id" which is common for all models in the project.
 *
 * @author Anna Drozdovskaya
 * @version 1.0
 */

@Getter
@Setter
public abstract class BaseEntity {

    private Long id;
}
