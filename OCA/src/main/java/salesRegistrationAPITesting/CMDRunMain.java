package salesRegistrationAPITesting;

public class CMDRunMain {

    static public void main(String phone[]) {
        System.out.println(phone[0] + " " + phone[1]);
        Integer I = new Integer(127);
        Integer II = new Integer(128);

        int i = 127;
        int ii = 128;
        int iii = 1000;
        Integer III = new Integer(1000);
        System.out.println("I==i = " + (I == i));
        System.out.println("I.equals(i) = " + (I.equals(i)));
        System.out.println("II==ii = " + (II == ii));
        System.out.println("II.equals(ii) = " + (II.equals(ii)));
        System.out.println("III==ii = " + (III == iii));
        System.out.println("III.equals(ii) = " + (III.equals(iii)));
    }
}
