import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClaseRMI extends UnicastRemoteObject implements InterfaceRMI {
    //Es necesario que el constructor ClaseRMI() invoque el método de la super clase
    public ClaseRMI() throws RemoteException {
        super();
    }

    public String mayusculas(String name) throws RemoteException {
        return name.toUpperCase();
    }

    public int suma(int a, int b)throws RemoteException{
        return a+b;
    }

    public long checksum(int[][] m) throws RemoteException{
        long s = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                s += m[i][j];
            }
        }
        return s;
    }
}
