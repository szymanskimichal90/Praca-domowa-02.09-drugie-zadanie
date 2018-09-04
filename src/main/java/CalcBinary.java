public class CalcBinary {


    public void intToBinary(int insertedInt) {
        int binary[] = new int[30];
        int i = 0;
        while (insertedInt > 0) {
            binary[i++] = insertedInt % 2;
            insertedInt = insertedInt / 2;
        }
        for (int i1 = i - 1; i1 >= 0; i1--) {
            System.out.print(binary[i1]);
        }
    }
    public int howManyZerosBetweenOne()
}
