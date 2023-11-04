public class Strings {
    public static void main(String[] args) {
        String message = "Hello World" + "!!";

        System.out.println("endsWith method:");
        System.out.println(message.endsWith("!!"));
        System.out.println(message.endsWith("e"));

        System.out.println("startsWith method:");
        System.out.println(message.startsWith("H"));
        System.out.println(message.startsWith("!!"));

        System.out.println("message:" + message);
    }
}
