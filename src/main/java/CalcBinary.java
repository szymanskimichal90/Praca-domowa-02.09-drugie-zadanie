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
        String a = binaryNumber.toString();
        int index = a.length();
        if (a.charAt(a.length() - 1) == '0') {
            for (int i = 0; i < index; i++) {
                {   int index1=a.length();
                    a = a.substring(0, index1 - 1);

                }
            }
        }
        String[] strings = a.split("1");
        for (String string : strings) {

            if (string.length() > length) {
                length = string.length();
            }
        }
        return length;
    }


}





//        String[] strings = a.split("1");
//        int length = 0;
//        for (String string : strings) {
//
//            if (string.length() > length) {
//                length = string.length();
//            }
//        }
//        return length;
//    }
//}
