package InterfaceChallenges;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.poweron();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.poweron();
        timsPhone.callPhone(24565);
        timsPhone.answer();

    }

}
