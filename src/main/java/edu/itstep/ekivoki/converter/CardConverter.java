package edu.itstep.ekivoki.converter;

import edu.itstep.ekivoki.dto.CardDto;
import edu.itstep.ekivoki.model.Card;

public interface CardConverter {

    CardDto convert(Card card);

    Card convert(CardDto cardDto);
}
