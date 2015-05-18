package com.hancheng.privatewords.util;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by chan on 4/28/15.
 */
public class Utils {

    public enum FontType {
        LIGHT,
        MEDIUM,
        REGULAR,
        BOLD
    }

    private static final Map<FontType, String> sFontMap = new EnumMap<FontType, String>(FontType.class);

    static {
        sFontMap.put(FontType.LIGHT, "Roboto-Light.ttf");
    }
}
