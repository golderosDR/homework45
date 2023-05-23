package de.GolderosDR;

public abstract class StringTools {
    public static String firstToUpperCase(String str) {
        return str.replaceFirst(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(0)).toUpperCase());
    }

    public static boolean isStartingFromCapital(String str) {
        return Character.isUpperCase(str.charAt(0));
    }
}
