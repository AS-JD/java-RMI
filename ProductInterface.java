package Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProductInterface  extends Remote {//permet d acceder l inteface a distance
	public void ajout( Produit p)throws RemoteException;
	public  void suppression(Produit p)throws RemoteException;
	public void modification( Produit p)throws RemoteException;
	public Produit consultation(int code)throws RemoteException;
}
