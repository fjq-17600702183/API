package SelfTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import javax.crypto.Cipher;

import org.apache.commons.lang3.ArrayUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class RSAUtil {
	
	
	
	
	
	/**
	 * 	RSA加密
	 * 	@param key
	 * 	@param data
	 * 	@param type
	 * 	@return
	 * 	@throws Exception
	 *	2020年5月21日
	 */
	public static byte[] encrypt(Key key,byte[] data) throws Exception{   // key-rsa公钥
		
		byte[] b1 = null;
		
		if (key != null) {
		      Cipher ci = Cipher.getInstance("RSA");
		        ci.init(Cipher.ENCRYPT_MODE, key);
		        /** 执行加密操作 */
		        for (int i = 0; i < data.length; i += 501) {  
		        	byte[] doFinal  = ci.doFinal(ArrayUtils.subarray(data, i,i + 501));      
		        	b1 = ArrayUtils.addAll(b1, doFinal);  
		        }
		        return b1;
		}
		return null;
      
	}
	
	
	
	
	
	

}
