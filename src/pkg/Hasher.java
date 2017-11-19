package pkg;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import org.apache.commons.lang3.RandomUtils;

public class Hasher {
  public static byte[] hashPassword(final char[] password, final byte[] salt, final int iterations, final int keyLength) {

    try {
      SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
      PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keyLength);
      SecretKey key = skf.generateSecret(spec);
      byte[] res = key.getEncoded();
      return res;

    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
      throw new RuntimeException(e);
    }
  }

  public static byte[] generateSalt(){
    return RandomUtils.nextBytes(20);
  }
}
