//this is to load and call

package web3jtest;

import java.io.IOException;
import java.math.BigInteger;

import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

public class Load {
	public static final BigInteger GAS_PRICE = BigInteger.valueOf(100_000_000_000L);
	public static final BigInteger GAS_LIMIT = BigInteger.valueOf(4_300_000);
	
	public static void main(String[] args) throws IOException {
		
		Web3j web3j = Web3j.build(new HttpService());
		Credentials NODE = Credentials.create(NodeConstants.PRIVATE_KEY);
		SimpleStorage simpleStorage = SimpleStorage.load("0xB823574E8f538122FcdFfb49813d8539CFedACC1", web3j, NODE, GAS_PRICE, GAS_LIMIT);
		
		System.out.println(simpleStorage.getContractAddress());
		System.out.println(simpleStorage.isValid());
		byte[] key = stringToBytes32("123").getValue();
		try {
			simpleStorage.setByte(key,stringToBytes32("ram").getValue()).send();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			System.out.println(new String(simpleStorage.getByte(key).send()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
	
	public static Bytes32 stringToBytes32(String string) {
        byte[] byteValue = string.getBytes();
        byte[] byteValueLen32 = new byte[32];
        System.arraycopy(byteValue, 0, byteValueLen32, 0, byteValue.length);
        return new Bytes32(byteValueLen32);
    }
}
