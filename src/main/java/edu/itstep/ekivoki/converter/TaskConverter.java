package edu.itstep.ekivoki.converter;

import edu.itstep.ekivoki.dto.TaskDto;
import edu.itstep.ekivoki.model.Task;

public interface TaskConverter {

    TaskDto convert(Task task);

    Task convert(TaskDto taskDto);
}
