import org.junit.Test;

import static org.junit.Assert.*;

public class CalcBinaryTest {

    @Test
    public void calcBinaryTest() {
        //given
        int intTest1 = 35;
        String resultIntToBinary1 = "100011";
        int intResult1 = 3;

        int intTest2 = 57;
        String resultIntToBinary2 = "111001";
        int intResult2 = 2;

        int intTest3 = 30;
        String resultIntToBinary3 = "11110";
        int intResult3 = 0;

        int intTest4 = 32;
        String resultIntToBinary4 = "100000";
        int intResult4 = 0;

        //when
        CalcBinary testCalc1 = new CalcBinary();
        String whenString1 = testCalc1.intToBinary(intTest1);
        int whenInt1 = testCalc1.howManyZerosBetweenOne();

        CalcBinary testCalc2 = new CalcBinary();
        String whenString2 = testCalc2.intToBinary(intTest2);
        int whenInt2 = testCalc2.howManyZerosBetweenOne();

        CalcBinary testCalc3 = new CalcBinary();
        String whenString3 = testCalc3.intToBinary(intTest3);
        int whenInt3 = testCalc3.howManyZerosBetweenOne();

        CalcBinary testCalc4 = new CalcBinary();
        String whenString4 = testCalc4.intToBinary(intTest4);
        int whenInt4 = testCalc4.howManyZerosBetweenOne();


        //then
        if (    whenString1.equals(resultIntToBinary1) && (whenInt1 == intResult1)
                && whenString2.equals(resultIntToBinary2) && (whenInt2 == intResult2)
                && whenString3.equals(resultIntToBinary3) && (whenInt3 == intResult3)
                && whenString4.equals(resultIntToBinary4) && (whenInt4 == intResult4)
                ) {
            System.out.println("Aplikacja działa ok");
        } else {
            System.out.println("Coś nie działa, jednak nie umiesz programować");

        }

    }
}