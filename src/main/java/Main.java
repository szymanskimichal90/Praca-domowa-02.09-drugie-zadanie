public class Main {
    public static void main(String[] args) {

        CalcBinary calc = new CalcBinary();
        String a = calc.intToBinary(32 );
        System.out.println(a);
        System.out.println(calc.howManyZerosBetweenOne());


    }
}