package j25_문자열;

public class String3 {
    public static void main(String[] args) {

        String phoneNumber = "010 9988/1916";

        String replacePhoneNumber =
                phoneNumber.replaceAll("-", "")
                        .replaceAll("/", "")
                        .replaceAll("_", "")
                        .replaceAll(" ", "");

        System.out.println(replacePhoneNumber);

    }
}
