package blockchain.poc;

import java.security.NoSuchAlgorithmException;

import blockchain.poc.block.Block;
import blockchain.poc.miner.Miner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Block block1 = new Block();
        //try {
            //block1.setNonce(1234567);
			//System.out.println(block1.hash());
			//System.out.println(block1.hashNumber());
			
            //block1.setNonce(1234545);
			//System.out.println(block1.hash());
			//System.out.println(block1.hashNumber());
			
            //block1.setNonce(1234567);
			//System.out.println(block1.hash());
			//System.out.println(block1.hashNumber());
			
			
			
		//} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
        
        Miner miner = new Miner("coinbase4123456");
        miner.tryBlock();
        
        miner = new Miner("coinbase4123456");
        miner.tryBlock();
        
        miner = new Miner("coinbase4123456");
        miner.tryBlock();
        
        miner = new Miner("coinbase4123456");
        miner.tryBlock();
        
        miner = new Miner("coinbase4123456");
        miner.tryBlock();
        
        miner = new Miner("coinbase4123456");
        miner.tryBlock();
        
        miner = new Miner("coinbase4123456");
        miner.tryBlock();
        
        miner = new Miner("coinbase4123456");
        miner.tryBlock();
        
        miner = new Miner("coinbase4123456");
        miner.tryBlock();
    }
}
