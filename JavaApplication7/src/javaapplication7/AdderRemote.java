

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Devilsoul
 */
public class AdderRemote extends UnicastRemoteObject implements Adder{
    AdderRemote()throws RuntimeException, RemoteException{
    super();
    }
    public int add(int x,int y){return x+y;}
}
