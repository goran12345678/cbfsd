package blockchain.poc.miner;

import blockchain.poc.block.Block;
import blockchain.poc.platform.FullStackRealCoinPlatform;

//The miner tries to generate a correct block which the platform will accept.
public class Miner {
	
	Block block = null;
	public Miner(String walletID) {
		block = new Block();
		block.setWalletId(walletID);
	}
	//1. Generate a block
	//2. Send it to the platform
	//3. Repeat
	public void tryBlock() {
		for(int i = 1; i <= 10; i++ ) {
			block.setNonce(i);
			Boolean validation =  FullStackRealCoinPlatform.validate(block);
			if(validation) {
				break;
			}	}
	}
}
