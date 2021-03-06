package org.bcos.web3j.crypto;

import java.math.BigInteger;
import java.security.KeyPair;

import org.bcos.web3j.crypto.sm2.crypto.asymmetric.SM2KeyGenerator;
import org.bcos.web3j.crypto.sm2.crypto.asymmetric.SM2PrivateKey;
import org.bcos.web3j.crypto.sm2.crypto.asymmetric.SM2PublicKey;
import org.bcos.web3j.crypto.sm2.util.encoders.Hex;

public class GenCredential {

	public static ECKeyPair createGuomiKeyPair() {
		System.out.println("=====INIT GUOMI KEYPAIR ====");
		final SM2KeyGenerator generator = new SM2KeyGenerator();
		final KeyPair keyPairData = generator.generateKeyPair();
		if (keyPairData != null)
			return genEcPairFromKeyPair(keyPairData);
		System.out.println("=====INIT GUOMI KEYPAIR FAILED ====");
		return null;
	}

	private static ECKeyPair genEcPairFromKeyPair(KeyPair keyPairData) {
		try {
			SM2PrivateKey vk = (SM2PrivateKey)keyPairData.getPrivate();
			SM2PublicKey pk = (SM2PublicKey)keyPairData.getPublic();
			final byte[] publicKey = pk.getEncoded();
			final byte[] privateKey = vk.getEncoded();

            //System.out.println("===public:" + Hex.toHexString(publicKey));
            //System.out.println("===private:" + Hex.toHexString(privateKey));
			BigInteger biPublic = new BigInteger(Hex.toHexString(publicKey), 16);
			BigInteger biPrivate = new BigInteger(Hex.toHexString(privateKey), 16);

            //System.out.println("---public:" + biPublic.toString(16));
            //System.out.println("---private:" + biPrivate.toString(16));

			ECKeyPair keyPair = new ECKeyPair(biPrivate, biPublic);
			return keyPair;
		} catch (Exception e) {
			return null;
		}
	}

	private static ECKeyPair createGuomiKeyPair(String privKey) {
		System.out.println("=====INIT GUOMI KEYPAIR from Private Key");
		SM2KeyGenerator generator = new SM2KeyGenerator();
		final KeyPair keyPairData = generator.generateKeyPair(privKey);
        System.out.println("generate keypair data succeed");
		if (keyPairData != null)
			return genEcPairFromKeyPair(keyPairData);
		System.out.println("=====INIT GUOMI KEYPAIR from Private Key FAILED ====");
		return null;
	}

	private static ECKeyPair createECDSAKeyPair(String privKey) {
		System.out.println("=====INIT ECDSA KEYPAIR From private key===");
		try {
			BigInteger bigPrivKey = new BigInteger(privKey, 16);
			ECKeyPair keyPair = ECKeyPair.create(bigPrivKey);
			return keyPair;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static ECKeyPair createECDSAKeyPair() {
		System.out.println("=====INIT ECDSA KEYPAIR");
		try {
			ECKeyPair keyPair = Keys.createEcKeyPair();
			return keyPair;
		} catch (Exception e) {
			return null;
		}
	}

	private static ECKeyPair createKeyPair() {
		// use guomi
		if (EncryptType.encryptType == 1)
			return createGuomiKeyPair();
		return createECDSAKeyPair(); // default use ECDSA
	}

	private static ECKeyPair createKeyPair(String privKey) {
		if (EncryptType.encryptType == 1)
			return createGuomiKeyPair(privKey);
		return createECDSAKeyPair(privKey);
	}

	public static Credentials create() {
		try {
			ECKeyPair keyPair = createKeyPair();
			if (keyPair == null)
				return null;

			Credentials credentials = Credentials.create(keyPair);
			return credentials;
		} catch (Exception e) {
			System.out.println("init credential failed");
			return null;
		}
	}

	public static Credentials create(String privKey) {
		try {
			ECKeyPair keyPair = createKeyPair(privKey);
			if (keyPair == null)
				return null;
			Credentials credentials = Credentials.create(keyPair);
			return credentials;
		} catch (Exception e) {
			System.out.println("init credential from private key failed ");
			return null;
		}
	}

}
