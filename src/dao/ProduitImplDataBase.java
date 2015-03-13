package dao;

import java.util.List;

import org.hibernate.classic.Session;

import util.HibernateUtil;

public class ProduitImplDataBase implements ProduitDAO {

	@Override
	public void addProduit(Produit produit) {
		Session session = (Session) HibernateUtil.getSessionFactory();
		session.beginTransaction();
		session.save(produit);
		session.getTransaction().commit();

	}

	@Override
	public void deleteProduit(Long idProduit) {
		Session session = (Session) HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p = (Produit) session.load(Produit.class, idProduit);
		session.delete(p);
		session.getTransaction().commit();
	}

	@Override
	public Produit getProduitById(Long idProduit) {
		Session session = (Session) HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p = (Produit) session.load(Produit.class, idProduit);
		return p;
	}

	@Override
	public List<Produit> getAllProduits() {
		Session session = (Session) HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		return session.createQuery("from Produit").list();
	}

	@Override
	public void updateProduit(Produit produit) {
		// TODO Auto-generated method stub
	}
	
	public void init(){
		System.out.println("Hibernate framework !! ");
	}

}
