package edu.itstep.ekivoki.converter;

import edu.itstep.ekivoki.dto.GameSessionDto;
import edu.itstep.ekivoki.model.GameSession;

public interface GameSessionConverter {

    GameSessionDto convert(GameSession gameSession);

    GameSession convert(GameSessionDto gameSessionDto);
}
