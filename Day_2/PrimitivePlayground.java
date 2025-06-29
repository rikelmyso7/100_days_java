public class PrimitivePlayground {
    public static void main(String[] args) {
        // 2. Criar classe PrimitivePlayground testando cada tipo
        //Byte
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.printf("byte: %d .. %d%n", maxByte, minByte);

        //Int
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.printf("int: %d .. %d%n", maxInt, minInt);

        //Short
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.printf("Short: %d .. %d%n", maxShort, minShort);

        //Long
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.printf("Long: %d .. %d%n", maxLong, minLong);

        System.out.println("");
        System.out.println("3. Testando Casting e Overflow");
        System.out.println("");
        convertNumbers();
    }

    // 3. Testando Casting e Overflow
    static void logCast(String label, Number original, Number casted) {
        System.out.printf("%-10s %s -> %s%n", label, original, casted);
    }

    static void convertNumbers() {
    // long to int
    long bigLong = Integer.MAX_VALUE + 1l;
    int casted = (int) bigLong;
    logCast("Long -> int", bigLong, casted);

    // double to int
    double doubleNumber = 7 / 2.5;
    int castedNumber = (int) doubleNumber;
    logCast("Double -> int", doubleNumber, castedNumber);
    
    // int to byte
    int maxInt = Integer.MAX_VALUE;
    byte castedByte = (byte) maxInt;
    logCast("Int -> byte", maxInt, castedByte);

    // double to byte
    double doubleToByteNumber = 7 / 5.5;
    byte castedByteNumber = (byte) doubleToByteNumber;
    logCast("Double -> byte", doubleToByteNumber, castedByteNumber);
    }
}