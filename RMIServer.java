package RMIserver;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import service.ProductService;

public class RMIServer {//
	public static void main (String[] args) throws RemoteException, MalformedURLException {
		ProductService ps= new  ProductService ();
		LocateRegistry.createRegistry(1099);//reservation du port n:1099
		Naming.rebind("rmi://localhost:1099/PS", ps);//annuaire est un registre qui reference les objet a distant

}}
