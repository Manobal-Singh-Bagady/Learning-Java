public class DataTypes {
    public static void main(String[] args) {
        // total number of values that can be stored -> -2^(8*bytes)/2 to 2^(8*bytes)-1.

        // byte data type stores 1 byte of numbers from -128 to 126.
        byte b = 1;
        System.out.println("1. Byte data type: " + b);
        // short data type stores 2 bytes of numbers.
        short s = 43;
        System.out.println("2. Short data type : " + s);
        // int data type stores 4 bytes of numbers.
        int i = 123;
        System.out.println("3. Int data type: " + i);
        // float data type stores 4 bytes of data.
        float f = 1.5f;
        System.out.println("4. Float data type : " + f);
        // long data type stores 8 bytes of numbers.
        long l = 5;
        System.out.println("5. Long data type : " + l);
        // double data type stores 8 bytes of data.
        double d = 2.54;
        System.out.println("6. Double data type : " + d);
        // char data type stores 2 bytes of data (due to unicode).
        char c = 'C';
        System.out.println("7. Char data type : " + c);
        // boolean data type.
        boolean bool = false;
        System.out.println("8. Boolean data type : " + bool);
    }
}