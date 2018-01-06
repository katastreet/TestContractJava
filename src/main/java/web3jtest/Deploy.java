// this is to deploy contract


package web3jtest;

import java.math.BigInteger;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;

public class Deploy {
	
	public static final BigInteger GAS_PRICE = BigInteger.valueOf(100_000_000_000L);
	public static final BigInteger GAS_LIMIT = BigInteger.valueOf(4_300_000);
	
	public static void main(String[] args) {
		
		Web3j web3j = Web3j.build(new HttpService());
		// defaults to http://localhost:8545/
		
		Credentials NODE = Credentials.create(NodeConstants.PRIVATE_KEY);
		
		try {
			System.out.println("hello");
			SimpleStorage simpleStorage = SimpleStorage.deploy(web3j, NODE, GAS_PRICE, GAS_LIMIT,"0").send();
			System.out.println("here");
			assert simpleStorage.isValid();
			
			
			System.out.println("Contract Address:" + simpleStorage.getContractAddress());
		} catch (Exception e) {
			System.out.println("exception occured");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
