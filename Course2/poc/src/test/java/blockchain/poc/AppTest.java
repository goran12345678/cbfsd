package blockchain.poc;

import static org.junit.Assert.assertTrue;

import java.security.NoSuchAlgorithmException;

import org.junit.Test;

import blockchain.poc.block.Block;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void checkHashInteger() {
    	Block b = new Block();
    	b.setNonce(1234567);
    	
    	try {
			int num = b.hashNumber();
			assertTrue(num > 0);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
