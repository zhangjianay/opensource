package org.bcos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.bcos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.bcos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed192x24 extends Ufixed {
    public static final Ufixed192x24 DEFAULT = new Ufixed192x24(BigInteger.ZERO);

    public Ufixed192x24(BigInteger value) {
        super(192, 24, value);
    }

    public Ufixed192x24(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(192, 24, m, n);
    }
}
