package uppercase.callback.server;

import uppercase.callback.shared.UpperCaseClient;
import uppercase.callback.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl implements UpperCaseServer {

    public ServerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }
    @Override
    public void toUpperCase(String str, UpperCaseClient client){
        String result = str.toUpperCase();
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){}

        try {
            client.upperCaseResult(result);
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }
}
