package org.bcos.web3j.protocol.core.methods.response;

import org.bcos.web3j.protocol.core.Response;

/**
 * net_listening.
 */
public class NetListening extends Response<Boolean> {
    public boolean isListening() {
        return getResult();
    }
}
