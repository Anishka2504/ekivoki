package edu.itstep.ekivoki.converter;

import edu.itstep.ekivoki.dto.GameDto;
import edu.itstep.ekivoki.model.Game;

public interface GameConverter {

    GameDto convert(Game game);

    Game convert(GameDto gameDto);
}
