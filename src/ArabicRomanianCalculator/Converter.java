package ArabicRomanianCalculator;



public class Converter {


    public static final String[] romeNums = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "XLX",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};


    public static boolean numIsArabicOr(String number) {
        //определяем принадлежность числа
        for (String temp : romeNums) {
            if (number.equals(temp)) {
                return false;
            }
        }
        return true;
    }

    public static int romanArabicConverter(String romeNum) {             //перевод из римских в арабские
        int result = 0;
        for (int i = 0; i < romeNums.length; i++) {
            if (romeNum.equals(romeNums[i])) {
                result = i + 1;
                break;
            }
        }
        return result;
    }

    public static String romanArabicConverter(int arabicNum) {         //перевод из арабских в римские
        return romeNums[arabicNum - 1];
    }
}


