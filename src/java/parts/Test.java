package parts;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test {

    public static void main(String[] args) {
//        Product product1 = new Product("монитор", 30000);
//        Product product4 = new Product("монитор", 20000);
//        Product product2 = new Product("проектор", 100000);
//        Product product3 = new Product("лэптоп", 360000);
//        List<Product> products = new ArrayList<>();
//        products.add(product1);
//        products.add(product2);
//        products.add(product3);
//        products.add(product4);
//
////        seller1.getProducts().add(product1);   //another option
//        Seller seller1 = new Seller("продавец", products, "Alexei", "Dimitrov", "36911022334", 0);
//        List<OwnProduct> ownProducts = new ArrayList<>();
//        Customer customer1 = new Customer(50000, ownProducts, "Dima", "Ivanov", "36812012234");
//        System.out.println(customer1);
//        System.out.println("Покупаем монитор");
//        customer1.setOwnProducts{"монитор"};

//        System.out.println("После покупки: " + customer1.toString());
        
Worker worker = new Worker("Alex","Kozlov","38925063216");

EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebFurniturePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        
        em.persist(worker);
        
        tx.commit();
        em.close();
        emf.close();

    }
}
