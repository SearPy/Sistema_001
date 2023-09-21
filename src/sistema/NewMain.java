/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;

import net.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session st = HibernateUtil.getSessionFactory().openSession();
        st.beginTransaction();
    }
    
}
