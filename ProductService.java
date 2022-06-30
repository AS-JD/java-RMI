package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import serveur.ProductInterface;
import serveur.Produit;

public class ProductService extends UnicastRemoteObject implements ProductInterface {// permet d acceder a l 'architecture RMI //description de l interface
	 ArrayList <Produit> Plist= new ArrayList <Produit>();
	 
	public ProductService() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void ajout(Produit p) throws RemoteException {
		// TODO Auto-generated method stub
		Plist.add(p);
		
	}

	@Override
	public void suppression(Produit p) throws RemoteException {
		// TODO Auto-generated method stub
		Plist.remove(p);
	}

	@Override
	public void modification(Produit p) throws RemoteException {
		// TODO Auto-generated method stub
		for (int i =0;i<Plist.size();i++) {
			if (Plist.get(i).getCode()== p.getCode()) { 
				Plist.get(i).setNom(p.getNom());
				Plist.get(i).setPrix(p.getPrix());
				//Plist.set(i,p);//methode simple pour la modification

			}}
		
	}

	@Override
	public Produit consultation(int code) throws RemoteException {
		// TODO Auto-generated method stub
		for (int i =0;i<Plist.size();i++) {
			if( Plist.get(i).getCode()== code) {
				return Plist.get(i);
					 		
	}		
}
		return null;}
	}
