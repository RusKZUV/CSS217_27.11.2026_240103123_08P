package Task04;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ChecksumGenerator {
    public String generateHash(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(data.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            System.out.println("[Checksum] Сгенерирован хеш целостности: " + sb.substring(0, 8) + "...");
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return "error";
        }
    }
}