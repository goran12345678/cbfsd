package blockchain.poc.block;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Block {
	
	private Long timeStamp = System.currentTimeMillis();
	private Double priorBlock = Math.random() * Integer.MAX_VALUE;
	private int nonce;
	private String digWalletID; //Bitcoin, Aetherium
	
	public String getWalletId() {
		return this.digWalletID;
	}
	public String setWalletId(String id) {
		return this.digWalletID = id;
	}
	public Double getPriorBlock() {
		return this.priorBlock;
	}
	public void setNonce(int n) {
		Double rnd = Math.random() * Integer.MAX_VALUE;
		this.nonce = Math.abs( n * rnd.intValue() * timeStamp.intValue());
	}
	public int hashNumber() throws NoSuchAlgorithmException {
		BigInteger bigNumber = new BigInteger(hash().getBytes());
		return  bigNumber.intValue();
	}
	public String hash() throws NoSuchAlgorithmException {
		MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
		byte[] passBytes = String.valueOf(priorBlock + nonce).getBytes();
		byte[] hash = sha256.digest(passBytes);
		return Base64.getEncoder().encodeToString(hash);
	}
	
}
