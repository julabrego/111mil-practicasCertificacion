

import com.cientooncemil.hibernate.model.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//http://cursohibernate.es/doku.php?id=unidades:03_relaciones:03_uno_a_muchos_desordenada



public class Main {
  private static final SessionFactory ourSessionFactory;

  static { // Código entre esto (STATIC) se va a cargar cuando levanta la aplicación y se ejecuta UNA SOLA VEZ Y AL PRINCIPIO, ANTES DE EJECUTAR EL CODIGO MAIN
    try {
      Configuration configuration = new Configuration(); // va a buscar el hibernate.cfg.xml / COMO SE EJECUTA PRIMERO CUALQUIER ERROR DE MAPEO SALTA EN ESTA INSTANCIA,AL PRINCIPIO
      configuration.configure();

      ourSessionFactory = configuration.buildSessionFactory();
    } catch (Throwable ex) {
      throw new ExceptionInInitializerError(ex);
    }
  }

  public static Session getSession() throws HibernateException {
    return ourSessionFactory.openSession(); // EXCEPCIÓN con cualquier error que haya saltado por algo mal con la conexion a bd
  }

  public static void main(final String[] args) throws Exception {
    final Session session = getSession();


    try {
        /*
      System.out.println("querying all the managed entities...");
      
      final Metamodel metamodel = session.getSessionFactory().getMetamodel(); // metamodels -> datos de todo lo mapeado

      for (EntityType<?> entityType : metamodel.getEntities()) { // getEntities -> devuelve lista de todo lo mapeado
        final String entityName = entityType.getName();
        
        final Query query = session.createQuery("from " + entityName);
        
        System.out.println("executing: " + query.getQueryString());
        
        for (Object o : query.list()) { // MUESTRA EN FORMATO OBJETO TODO LO MAPEADO
          System.out.println("  " + o);
        }
        

      }
*/
      
        //final Query query = session.createQuery("from Cliente c where c.id=24855538");
        final Query query = session.createQuery("from Cliente c where c.id=24855538");
        
        System.out.println("executing: " + query.getQueryString());
        
        for (Object o : query.list()) {
          System.out.println("  " + o);
          
          session.beginTransaction(); // PARA CAMBIAR UN VALOR
          Cliente c = (Cliente)o;
          c.setNombre("Capitan Piluso");
          session.save(c); // SAVE -> UPDATE
          session.getTransaction().commit(); // COMMIT REALIZA LA TRANSACCION. SIN ESTO NO SE REALIZA EL CAMBIO
        }
        
        
        //Cliente c = (Cliente) session.find(Cliente.class, 77777777);
        //System.out.println(c);
        
        //c.setNombre("XXXXXXXX");
        
        //session.save(c);
        
       // c = (Cliente) session.find(Cliente.class, 77777777);
        //System.out.println(c);
        
        //session.delete(c);
        
        
        
    } finally {
      session.close();
    }

  }
}