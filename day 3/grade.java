
public class grade {
    public static void main(String[] args) {

        char originalGrade = 'A';

        // Encrypt (add 8)
        char encryptedGrade = (char)(originalGrade + 8);
        System.out.println("Encrypted Grade = " + encryptedGrade);

        // Decrypt (subtract 8)
        char decryptedGrade = (char)(encryptedGrade - 8);
        System.out.println("Decrypted Grade = " + decryptedGrade);
    }
}
