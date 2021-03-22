public class HelloMain {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String value = System.getenv("RETE_ENV");
        if (value != null) {
            System.out.format("RETE_ENV=%s%n", value);
        } else {
            System.out.format("RETE_ENV is not assigned.%n");
        }
    }
}