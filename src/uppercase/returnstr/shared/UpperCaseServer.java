package uppercase.returnstr.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseServer extends Remote {
    String toUpperCaseServer(String str) throws RemoteException;
}
