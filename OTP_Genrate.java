import java.security.SecureRandom;

public class OTP_Genrate {
    public static String generateOTP(int length) {
        SecureRandom random = new SecureRandom(); // Random use for random number
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < length; i++) {
            otp.append(random.nextInt(10));

        }
        return otp.toString();
    }

    public static void main(String[] args) {
        System.out.print("Your OTP for  meesho login is : " + generateOTP(6));
        String add = "oBcombxknc Messho";
        System.out.print(" your account safe. " + add);
    }
}
