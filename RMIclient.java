package Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIclient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		ProductInterface  stub = ( ProductInterface )Naming.lookup("rmi://localhost:1099/PS");//return un type remote
		Produit p1=new Produit(1,15.2,"souris");//copier les classes de serveur et coller dans le projet client 
		stub.ajout(p1 );
	}

}
