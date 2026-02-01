public class Phone {
    String numberPhone;
    String modelPhone;
    double weightPhone;

    static String countryProduce;

    public Phone() {}

    public Phone(String numberPhone, String modelPhone, double weightPhone) {
        this.numberPhone = numberPhone;
        this.modelPhone = modelPhone;
        this.weightPhone = weightPhone;
    }

    public void receiveCall(String callersName) {
        receiveCall(callersName, "");
    }

    public void receiveCall(String callersName, String numberPhone) {
        if (numberPhone.isEmpty()) {
            System.out.println("Звонит абонент по имени " + callersName);
        } else {
            System.out.println("Звонит абонент по имени " + callersName + " номер " + numberPhone);
        }
    }

}
