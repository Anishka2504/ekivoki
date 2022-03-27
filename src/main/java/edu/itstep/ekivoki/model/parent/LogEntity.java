package edu.itstep.ekivoki.model.parent;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * This class contains field "Id" extended from BaseEntity class and information about when the entity was created
 * and was modified, and also the information about how many times the entity was changed.
 * @author Anna Drozdovskaya
 * @version 1.0
 */

@Getter
@Setter
public abstract class LogEntity extends BaseEntity {

    private Date date_creation;
    private Date last_modified;
    private Long version;
}
