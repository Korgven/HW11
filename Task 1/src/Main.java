public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("89109156555", "Samsung", 10.5);
        phone.receiveCall("Ivan", "89109101010");
        phone.receiveCall("Ivan");
    }
}
