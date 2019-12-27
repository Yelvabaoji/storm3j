package org.storm3j.contracts.eip165.generated;

import java.math.BigInteger;
import java.util.Arrays;
import org.storm3j.abi.TypeReference;
import org.storm3j.abi.datatypes.Bool;
import org.storm3j.abi.datatypes.Function;
import org.storm3j.abi.datatypes.Type;
import org.storm3j.crypto.Credentials;
import org.storm3j.protocol.Storm3j;
import org.storm3j.protocol.core.RemoteCall;
import org.storm3j.tx.Contract;
import org.storm3j.tx.TransactionManager;
import org.storm3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.storm3j.io/command_line.html">storm3j command line tools</a>,
 * or the org.storm3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/storm3j/storm3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with storm3j version 4.1.1.
 */
public class ERC165 extends Contract {
    private static final String BINARY = "Bin file was not provided";

    public static final String FUNC_SUPPORTSINTERFACE = "supportsInterface";

    @Deprecated
    protected ERC165(String contractAddress, Storm3j storm3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, storm3j, credentials, gasPrice, gasLimit);
    }

    protected ERC165(String contractAddress, Storm3j storm3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, storm3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ERC165(String contractAddress, Storm3j storm3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, storm3j, transactionManager, gasPrice, gasLimit);
    }

    protected ERC165(String contractAddress, Storm3j storm3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, storm3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Boolean> supportsInterface(byte[] interfaceID) {
        final Function function = new Function(FUNC_SUPPORTSINTERFACE, 
                Arrays.<Type>asList(new org.storm3j.abi.datatypes.generated.Bytes4(interfaceID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    @Deprecated
    public static ERC165 load(String contractAddress, Storm3j storm3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ERC165(contractAddress, storm3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ERC165 load(String contractAddress, Storm3j storm3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ERC165(contractAddress, storm3j, transactionManager, gasPrice, gasLimit);
    }

    public static ERC165 load(String contractAddress, Storm3j storm3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new ERC165(contractAddress, storm3j, credentials, contractGasProvider);
    }

    public static ERC165 load(String contractAddress, Storm3j storm3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ERC165(contractAddress, storm3j, transactionManager, contractGasProvider);
    }
}
