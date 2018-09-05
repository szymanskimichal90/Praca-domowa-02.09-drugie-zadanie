public class CalcBinary {

    StringBuilder binaryNumber = new StringBuilder();


    public String intToBinary(int insertedInt) {

        int binary[] = new int[30];
        int i = 0;
        while (insertedInt > 0) {
            binary[i++] = insertedInt % 2;
            insertedInt = insertedInt / 2;
        }
        for (int i1 = i - 1; i1 >= 0; i1--) {
            binaryNumber.append(binary[i1]);
        }
        return binaryNumber.toString();
    }


    public int howManyZerosBetweenOne() {

        int length = 0;
        String a = binaryNumber.toString();
        int index = a.length();
        if (a.charAt(a.length() - 1) == '0') {
            for (int i = 0; i < index; i++) {
                {
                    a = a.substring(0, index - 1);
                    index = a.length();
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
