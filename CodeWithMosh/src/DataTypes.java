import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        // Learning different data types in java.

        /*
         * ----------- Byte -----------------
         * Storage used - 1 byte
         * Range - [-127 -> 128]
         */
        byte byteType = 5;

        /*
         * ----------- Short -----------------
         * Storage used - 2 bytes
         * Range - [-32,768(-32K) -> 32,767(32K)]
         */

        short shortType = 50;

        /*
         * ----------- Int -----------------
         * Storage used - 4 bytes
         * Range - [-2,147,483,648(-2B) -> 2,147,483,647(2B)]
         */

        int intType = 500;

        /*
         * ----------- Long -----------------
         * Storage used - 8 bytes
         * Range - [-9,223,372,036,854,775,808(-9Q) -> 9,223,372,036,854,775,807(9Q)]
         */

        long longType = 123_456_789L;

        /*
         * ----------- Float -----------------
         * Storage used - 4 bytes
         * Range - [-3.4E38 -> 3.4E38]
         */

        float floatType = 5.5f;

        /*
         * ----------- Double -----------------
         * Storage used - 8 bytes
         * Range - [-1.7E308 -> 1.7E308]
         */

        double doubleType = 5.5;

        /*
         * ----------- Char -----------------
         * Storage used - 2 bytes
         * Range - [0 -> 65,535]
         */

        char charType = 'A';

        /*
         * ----------- Boolean -----------------
         * Storage used - 1 bit
         * Range - [true, false]
         */

        boolean booleanType = true;

        System.out.println("\n--------------------------------------------------");
        System.out
                .print("A Program to Print Different Primitive data types:\n--------------------------------------------------\n");
        System.out.println("- Byte -> " + byteType);
        System.out.println("- Short -> " + shortType);
        System.out.println("- Int -> " + intType);
        System.out.println("- Long -> " + longType);
        System.out.println("- Float -> " + floatType);
        System.out.println("- Double -> " + doubleType);
        System.out.println("- Char -> " + charType);
        System.out.println("- Boolean -> " + booleanType);

        System.out.println("\nNon Primitive Data Type \"DATE\"");
        System.out.println("-------------------------------");

        Date now = new Date();
        System.out.println(now);
    }
}
