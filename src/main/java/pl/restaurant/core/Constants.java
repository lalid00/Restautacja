package pl.restaurant.core;

import java.time.ZoneId;
import java.util.Locale;

public interface Constants {
    String NAME_REGEX = "[A-ZĄ-Ź][a-zą-ź]{1,15}";
    String EMAIL_REGEX = ".+@.+\\.[a-z]{2,3}";
    String PHONE_REGEX = "(\\+\\d{2})?\\d{9}";
    String INTEGER_REGEX = "[0-9]+";
    String DOUBLE_REGEX = "(\\d+)(\\.\\d+)?";
    ZoneId DEFAULT_SYSTEM_ZONE_ID = ZoneId.of("Europe/Warsaw");
    Locale DEFAULT_LOCALE = new Locale("pl","PL");
    String LETTER_REGEX = "[A-C]";
}

