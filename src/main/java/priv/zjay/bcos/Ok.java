package priv.zjay.bcos;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;

import org.bcos.channel.client.TransactionSucCallback;
import org.bcos.web3j.abi.TypeReference;
import org.bcos.web3j.abi.datatypes.Function;
import org.bcos.web3j.abi.datatypes.Type;
import org.bcos.web3j.abi.datatypes.generated.Uint256;
import org.bcos.web3j.crypto.Credentials;
import org.bcos.web3j.crypto.EncryptType;
import org.bcos.web3j.protocol.Web3j;
import org.bcos.web3j.protocol.core.methods.response.TransactionReceipt;
import org.bcos.web3j.tx.Contract;
import org.bcos.web3j.tx.TransactionManager;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link bcos.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version none.
 */
public final class Ok extends Contract {
    private static String BINARY = "6060604052341561000c57fe5b5b6001600060000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506402540be4006000600101819055506002600260000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060006002600101819055505b5b610443806100c26000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806366c99139146100465780636d4ce63c14610066575bfe5b341561004e57fe5b610064600480803590602001909190505061008c565b005b341561006e57fe5b610076610264565b6040518082815260200191505060405180910390f35b806000600101540360006001018190555080600260010160008282540192505081905550600480548060010182816100c49190610272565b916000526020600020906004020160005b608060405190810160405280604060405190810160405280600881526020017f32303137303431330000000000000000000000000000000000000000000000008152508152602001600060000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001600260000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200185815250909190915060008201518160000190805190602001906101c49291906102a4565b5060208201518160010160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550606082015181600301555050505b50565b600060026001015490505b90565b81548183558181151161029f5760040281600402836000526020600020918201910161029e9190610324565b5b505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106102e557805160ff1916838001178555610313565b82800160010185558215610313579182015b828111156103125782518255916020019190600101906102f7565b5b50905061032091906103aa565b5090565b6103a791905b808211156103a357600060008201600061034491906103cf565b6001820160006101000a81549073ffffffffffffffffffffffffffffffffffffffff02191690556002820160006101000a81549073ffffffffffffffffffffffffffffffffffffffff021916905560038201600090555060040161032a565b5090565b90565b6103cc91905b808211156103c85760008160009055506001016103b0565b5090565b90565b50805460018160011615610100020316600290046000825580601f106103f55750610414565b601f01602090049060005260206000209081019061041391906103aa565b5b505600a165627a7a72305820e0fc40328d872bb49a449e3c4175442de3e4ca08d510d0abc656e961d438923d0029";

    public static final String ABI = "[{\"constant\":false,\"inputs\":[{\"name\":\"num\",\"type\":\"uint256\"}],\"name\":\"trans\",\"outputs\":[],\"payable\":false,\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"get\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"type\":\"function\"},{\"inputs\":[],\"payable\":false,\"type\":\"constructor\"}]";

    private static String GUOMI_BINARY = "6060604052341561000c57fe5b5b6001600060000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506402540be4006000600101819055506002600260000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060006002600101819055505b5b610443806100c26000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff168063299f7f9d146100465780638fff0fc41461006c575bfe5b341561004e57fe5b61005661008c565b6040518082815260200191505060405180910390f35b341561007457fe5b61008a600480803590602001909190505061009a565b005b600060026001015490505b90565b806000600101540360006001018190555080600260010160008282540192505081905550600480548060010182816100d29190610272565b916000526020600020906004020160005b608060405190810160405280604060405190810160405280600881526020017f32303137303431330000000000000000000000000000000000000000000000008152508152602001600060000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001600260000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200185815250909190915060008201518160000190805190602001906101d29291906102a4565b5060208201518160010160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550606082015181600301555050505b50565b81548183558181151161029f5760040281600402836000526020600020918201910161029e9190610324565b5b505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106102e557805160ff1916838001178555610313565b82800160010185558215610313579182015b828111156103125782518255916020019190600101906102f7565b5b50905061032091906103aa565b5090565b6103a791905b808211156103a357600060008201600061034491906103cf565b6001820160006101000a81549073ffffffffffffffffffffffffffffffffffffffff02191690556002820160006101000a81549073ffffffffffffffffffffffffffffffffffffffff021916905560038201600090555060040161032a565b5090565b90565b6103cc91905b808211156103c85760008160009055506001016103b0565b5090565b90565b50805460018160011615610100020316600290046000825580601f106103f55750610414565b601f01602090049060005260206000209081019061041391906103aa565b5b505600a165627a7a72305820c0113945a34f32983a634dd4dbbd9712ccf1ea932f1555bcaf218d186b9fde210029";

    private Ok(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, isInitByName);
        if(EncryptType.encryptType == 1) super.setContractBinary(GUOMI_BINARY);
    }

    private Ok(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, isInitByName);
        if(EncryptType.encryptType == 1) super.setContractBinary(GUOMI_BINARY);
    }

    private Ok(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, false);
        if(EncryptType.encryptType == 1) super.setContractBinary(GUOMI_BINARY);
    }

    private Ok(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
        if(EncryptType.encryptType == 1) super.setContractBinary(GUOMI_BINARY);
    }

    public Future<TransactionReceipt> trans(Uint256 num) {
        Function function = new Function("trans", Arrays.<Type>asList(num), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public void trans(Uint256 num, TransactionSucCallback callback) {
        Function function = new Function("trans", Arrays.<Type>asList(num), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<Uint256> get() {
        Function function = new Function("get", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<Ok> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        if(EncryptType.encryptType == 1) setBinary(getGuomiBinary());
        return deployAsync(Ok.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<Ok> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        if(EncryptType.encryptType == 1) setBinary(getGuomiBinary());
        return deployAsync(Ok.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Ok load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Ok(contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    public static Ok load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Ok(contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static Ok loadByName(String contractName, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Ok(contractName, web3j, credentials, gasPrice, gasLimit, true);
    }

    public static Ok loadByName(String contractName, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Ok(contractName, web3j, transactionManager, gasPrice, gasLimit, true);
    }

    public static void setBinary(String binary) {
        BINARY = binary;
    }

    public static String getGuomiBinary() {
        return GUOMI_BINARY;
    }
}
