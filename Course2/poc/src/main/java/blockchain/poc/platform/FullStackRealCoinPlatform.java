package blockchain.poc.platform;

import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

import blockchain.poc.block.Block;

public class FullStackRealCoinPlatform {
	
    public static LinkedList<Block> chain = new LinkedList<Block>();
	
	public static Block getLastBlock() {
		return chain.pop();
	}
	public static Boolean validate(Block b) {
		//1. a new block needs to have a reference to the prior block
		//2. a new block needs to have a hash integer value less than
		//  or equal to the previous block.	
		try {
			if(chain.size() == 0) {
				addToBlockChain(b);
				System.out.println("Block with wallet id is a success :" + b.getWalletId());
				return true;
			}
			Block lastBlock = chain.peekFirst();	
			if(b.getPriorBlock() == lastBlock.getPriorBlock() && 
					b.hashNumber() <= lastBlock.hashNumber()) {
				addToBlockChain(b);
				System.out.println("Block with wallet id is a success :" + b.getWalletId());	
				return true;
			}

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Block with wallet id failed :" + b.getWalletId());
		return false;
	}
	private static void addToBlockChain(Block b) {
		chain.push(b);
		
	}
	

}
