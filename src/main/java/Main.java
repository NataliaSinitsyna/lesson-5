package src.main.java;//1) поупражняться с математическими и логическими операторами,
// добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
//2) попробовать вычисления комбинаций типов данных (int и double)

public class Main {
    public static void main(String[] args) {

        //поупражняться с математическими и логическими операторами,
        // добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        System.out.println("Поупражняться с математическими и логическими операторами " +
                "и добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль):");

        System.out.println("логические вычисления:\n10 равно 5 (ложь)");
        System.out.println(10 == 5);
        System.out.println("10 больше 5 (правда)");
        System.out.println(10 > 5);

        byte varByte = 100;
        byte varByteOverflow = (byte) (varByte + 100);
        System.out.println("переполнение для типа byte " + varByteOverflow);

        short varShort = -30000;
        short varShortOverflow = (short) (varShort - 10000);
        System.out.println("переполнение для типа short " + varShortOverflow);

        int varInt = 50;
        int varIntOverflow = varInt * 1000000000;
        System.out.println("переполнение для типа int " + varIntOverflow);

        long varLong = 1_000_000_000_000L;
        long varLongOverflow = varLong * 700_000_000;
        System.out.println("переполнение для типа long " + varLongOverflow);

        //попробовать вычисления комбинаций типов данных (int и double)
        System.out.println("Попробовать вычисления комбинаций типов данных (int и double)");
        double varDouble = 3.333333;
        varInt = (int) (varInt + varDouble);
        System.out.println(varInt);
        varDouble = varInt + varDouble;
        System.out.println(varDouble);
    }

}
