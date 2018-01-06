package web3jtest;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.2.0.
 */
public class SimpleStorage extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b6040516020806108d98339810160405280805160008054600160a060020a03909216600160a060020a03199092169190911790555050610885806100546000396000f3006060604052600436106100745763ffffffff60e060020a60003504166321f8a72181146100795780634b7b0713146100ab5780636e899550146100c6578063986e791a1461011c578063b91ea167146101a9578063ca446dd9146101d1578063dc97d962146101f3578063eb9f319f14610209575b600080fd5b341561008457600080fd5b61008f600435610222565b604051600160a060020a03909116815260200160405180910390f35b34156100b657600080fd5b6100c46004356024356102bd565b005b34156100d157600080fd5b6100c4600480359060446024803590810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284375094965061035095505050505050565b341561012757600080fd5b6101326004356103f5565b60405160208082528190810183818151815260200191508051906020019080838360005b8381101561016e578082015183820152602001610156565b50505050905090810190601f16801561019b5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156101b457600080fd5b6101bf600435610539565b60405190815260200160405180910390f35b34156101dc57600080fd5b6100c4600435600160a060020a03602435166105cb565b34156101fe57600080fd5b6101bf600435610687565b341561021457600080fd5b6100c4600435602435610719565b60008054600160a060020a03166342087d4f33836040516020015260405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561027b57600080fd5b6102c65a03f1151561028c57600080fd5b5050506040518051905015156102a157600080fd5b50600090815260046020526040902054600160a060020a031690565b60008054600160a060020a031690633239b71b9033906040516020015260405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561031857600080fd5b6102c65a03f1151561032957600080fd5b50505060405180519050151561033e57600080fd5b60009182526001602052604090912055565b60008054600160a060020a031690633239b71b9033906040516020015260405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b15156103ab57600080fd5b6102c65a03f115156103bc57600080fd5b5050506040518051905015156103d157600080fd5b60008281526002602052604090208180516103f09291602001906107ac565b505050565b6103fd61082a565b60008054600160a060020a0316906342087d4f9033906040516020015260405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561045857600080fd5b6102c65a03f1151561046957600080fd5b50505060405180519050151561047e57600080fd5b6002600083600019166000191681526020019081526020016000208054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561052d5780601f106105025761010080835404028352916020019161052d565b820191906000526020600020905b81548152906001019060200180831161051057829003601f168201915b50505050509050919050565b60008054600160a060020a03166342087d4f33836040516020015260405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561059257600080fd5b6102c65a03f115156105a357600080fd5b5050506040518051905015156105b857600080fd5b5060009081526003602052604090205490565b60008054600160a060020a031690633239b71b9033906040516020015260405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561062657600080fd5b6102c65a03f1151561063757600080fd5b50505060405180519050151561064c57600080fd5b600091825260046020526040909120805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03909216919091179055565b60008054600160a060020a03166342087d4f33836040516020015260405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b15156106e057600080fd5b6102c65a03f115156106f157600080fd5b50505060405180519050151561070657600080fd5b5060009081526001602052604090205490565b60008054600160a060020a031690633239b71b9033906040516020015260405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561077457600080fd5b6102c65a03f1151561078557600080fd5b50505060405180519050151561079a57600080fd5b60009182526003602052604090912055565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106107ed57805160ff191683800117855561081a565b8280016001018555821561081a579182015b8281111561081a5782518255916020019190600101906107ff565b5061082692915061083c565b5090565b60206040519081016040526000815290565b61085691905b808211156108265760008155600101610842565b905600a165627a7a723058206694c2790803bd5e8a9faebf626cce41fb126f3fbf8dd0590e3af5a4cd85bd6a0029";

    protected SimpleStorage(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected SimpleStorage(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> getAddress(byte[] key) {
        Function function = new Function("getAddress", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(key)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setInt(byte[] key, BigInteger x) {
        Function function = new Function(
                "setInt", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(key), 
                new org.web3j.abi.datatypes.generated.Uint256(x)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setString(byte[] key, String x) {
        Function function = new Function(
                "setString", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(key), 
                new org.web3j.abi.datatypes.Utf8String(x)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getString(byte[] key) {
        Function function = new Function("getString", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(key)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> getByte(byte[] key) {
        Function function = new Function("getByte", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(key)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setAddress(byte[] key, String x) {
        Function function = new Function(
                "setAddress", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(key), 
                new org.web3j.abi.datatypes.Address(x)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getInt(byte[] key) {
        Function function = new Function("getInt", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(key)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setByte(byte[] key, byte[] x) {
        Function function = new Function(
                "setByte", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(key), 
                new org.web3j.abi.datatypes.generated.Bytes32(x)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<SimpleStorage> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _permission) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_permission)));
        return deployRemoteCall(SimpleStorage.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<SimpleStorage> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _permission) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_permission)));
        return deployRemoteCall(SimpleStorage.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static SimpleStorage load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SimpleStorage(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static SimpleStorage load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SimpleStorage(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}