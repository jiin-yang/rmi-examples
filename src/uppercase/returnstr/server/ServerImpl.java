package uppercase.returnstr.server;

import uppercase.returnstr.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl implements UpperCaseServer {

    public ServerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }
    @Override
    public String toUpperCaseServer(String str) {
        return str.toUpperCase();
    }
}
