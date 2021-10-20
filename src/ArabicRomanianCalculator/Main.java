package ArabicRomanianCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int firstNumber;
    static int secondNumber;
    static int resultOfOperation;
    static boolean typeOfNumberOne;
    static boolean typeOfNumberTwo;

    public static void main(String[] args) throws Exception, IOException {
        System.out.println("Введите два числа и желаемую операцию над ними через пробел(число_знак операции_число)");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String stringForParsing = bufferedReader.readLine();              // записываем ввод с консоли в переменную stringForParsing
            String[] parsedStringArray = stringForParsing.split(" ");   // парсим строки по разделителю в массив строк

        if (parsedStringArray.length > 3) {
            throw new Exception("Разрешается использовать только два числа");}
        try {
            typeOfNumberOne = Converter.numIsArabicOr(parsedStringArray[0]);
            typeOfNumberTwo = Converter.numIsArabicOr(parsedStringArray[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Exception("Введите запрос согласно формату");}

        if(typeOfNumberOne !=typeOfNumberTwo) {
            throw new Exception("Числа должны быть в одной системе счисления!");}

        if(!typeOfNumberOne) {
            firstNumber = Converter.romanArabicConverter(parsedStringArray[0]); // если числа римские, то переводим в арабскиеsecond
            secondNumber = Converter.romanArabicConverter(parsedStringArray[2]);
        } else {
        firstNumber = Integer.parseInt(parsedStringArray[0]);
        secondNumber = Integer.parseInt(parsedStringArray[2]);}

    if(firstNumber >10||secondNumber >10) {
        throw new Exception("Числа должны быть меньше 10!");
    }

    if(parsedStringArray[1].equals("+"))resultOfOperation = Operations.plus(firstNumber,secondNumber); // производим операцию
    if(parsedStringArray[1].equals("-"))resultOfOperation = Operations.minus(firstNumber,secondNumber);
    if(parsedStringArray[1].equals("/"))resultOfOperation = Operations.divide(firstNumber,secondNumber);
    if(parsedStringArray[1].equals("*"))resultOfOperation = Operations.multiply(firstNumber,secondNumber);


        if (typeOfNumberOne) {
            System.out.println(resultOfOperation);
        } else {
            if (resultOfOperation < 0) {
                throw new Exception("В римской системе исчисления не бывает отрицательных чисел!");
            }
            System.out.println(Converter.romanArabicConverter(resultOfOperation));
        }

    }
}

