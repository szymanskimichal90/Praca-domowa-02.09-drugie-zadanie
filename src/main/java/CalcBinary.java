public class CalcBinary {

    private StringBuilder binaryNumber = new StringBuilder();
    int number;

    public String intToBinary(int insertedInt) {

        while (insertedInt > 0) {
            number = insertedInt % 2;
            insertedInt = insertedInt / 2;
            binaryNumber.append(number);
        }
        return binaryNumber.reverse().toString();
    }
    public int howManyZerosBetweenOne() {
        int length = 0;
        while (binaryNumber.charAt(binaryNumber.length() - 1) == '0') {
            binaryNumber.deleteCharAt(binaryNumber.length() - 1);
        }
        String[] strings = binaryNumber.toString().split("1");
        for (String string : strings) {
            if (string.length() > length) {
                length = string.length();
            }
        }
        return length;
    }
}


