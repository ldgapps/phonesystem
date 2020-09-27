// 
// Decompiled by Procyon v0.5.36
// 

package DB;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import sun.misc.BASE64Decoder;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.Key;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;

public class EncriptadorPassword1
{
    Cipher ecipher;
    Cipher dcipher;
    
    public EncriptadorPassword1(final SecretKey key, final String algorithm) {
        try {
            this.ecipher = Cipher.getInstance(algorithm);
            this.dcipher = Cipher.getInstance(algorithm);
            this.ecipher.init(1, key);
            this.dcipher.init(2, key);
        }
        catch (Exception e) {
            System.out.println("EXCEPTION: NoSuchPaddingException");
        }
    }
    
    public EncriptadorPassword1(final String passPhrase) {
        final byte[] salt = { -87, -101, -56, 50, 86, 52, -29, 3 };
        final int iterationCount = 19;
        try {
            final KeySpec keySpec = new PBEKeySpec(passPhrase.toCharArray(), salt, iterationCount);
            final SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);
            this.ecipher = Cipher.getInstance(key.getAlgorithm());
            this.dcipher = Cipher.getInstance(key.getAlgorithm());
            final AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);
            this.ecipher.init(1, key, paramSpec);
            this.dcipher.init(2, key, paramSpec);
        }
        catch (InvalidAlgorithmParameterException e) {
            System.out.println("EXCEPTION: InvalidAlgorithmParameterException");
        }
        catch (NoSuchPaddingException e2) {
            System.out.println("EXCEPTION: NoSuchPaddingException");
        }
        catch (NoSuchAlgorithmException e3) {
            System.out.println("EXCEPTION: NoSuchAlgorithmException");
        }
        catch (InvalidKeyException e4) {
            System.out.println("EXCEPTION: InvalidKeyException");
        }
        catch (InvalidKeySpecException ex) {
            Logger.getLogger(EncriptadorPassword1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String encrypt(final String str) {
        try {
            final byte[] utf8 = str.getBytes("UTF8");
            this.ecipher.doFinal(utf8);
        }
        catch (Exception ex) {}
        return null;
    }
    
    public String decrypt(final String str) {
        try {
            final byte[] dec = new BASE64Decoder().decodeBuffer(str);
            final byte[] utf8 = this.dcipher.doFinal(dec);
            return new String(utf8, "UTF8");
        }
        catch (BadPaddingException ex) {}
        catch (IllegalBlockSizeException ex2) {}
        catch (UnsupportedEncodingException ex3) {}
        catch (IOException ex4) {}
        return null;
    }
}
