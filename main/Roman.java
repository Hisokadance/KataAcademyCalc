package main;

public class Roman {
    static String[] arrayRoman = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
            "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
            "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
            "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
            "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
            "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
            "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
            "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
            "XCVIII", "XCIX", "C"};

    public static boolean isRoman(String val1, String val2) {
        boolean flag1 = false;
        boolean flag2 = false;
        for (String s : arrayRoman) {
            if (val1.equalsIgnoreCase(s)) {
                flag1 = true;
            }
            if (val2.equalsIgnoreCase(s)) {
                flag2 = true;
            }
        }
        return flag1 && flag2;
    }

    public static int convertToArabian(String arabian) {
        for (int i = 0; i < arrayRoman.length; i++) {
            if (arabian.equalsIgnoreCase(arrayRoman[i])) {
                return i;
            }
        }
        return -1;
    }

    public static String convertToRoman(int roman) {
        return arrayRoman[roman];
    }
}