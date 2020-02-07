package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {
		
		int temp;
		
		// TODO
		// implement marshalling, call and unmarshalling for read RPC method
		
		rpcclient.connect();
		byte[] send = RPCUtils.marshallInteger(RPCID, 0);
		byte[] recieved = rpcclient.call(send);
		temp = RPCUtils.unmarshallInteger(recieved);
		
		return temp;
	}
	
}
