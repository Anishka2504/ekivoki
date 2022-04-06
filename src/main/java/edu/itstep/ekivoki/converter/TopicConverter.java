package edu.itstep.ekivoki.converter;

import edu.itstep.ekivoki.dto.TopicDto;
import edu.itstep.ekivoki.model.Topic;

public interface TopicConverter {

    TopicDto convert(Topic topic);

    Topic convert(TopicDto topicDto);
}
