import java.util.HashSet;

public class OTPGenerator {
    //generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a 6-digit number
        return (int) (Math.random() * 900000) + 100000;
    }
    // Method to ensure the OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);  // Add each OTP to the set
        }
        // If the size of the set equals the length of the OTP array, it means all OTPs are unique
        return otpSet.size() == otps.length;
    }
    public static void main(String[] args) {
        int[] otps = new int[10]; 
        
           for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + i + 1+ ": " + otps[i]);
        }
                if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicated.");
        }
    }
}
