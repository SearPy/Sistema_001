package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Orden_serv.class)
public abstract class Orden_serv_ {

	public static volatile SingularAttribute<Orden_serv, Calendar> fecha;
	public static volatile SingularAttribute<Orden_serv, String> estado;
	public static volatile SingularAttribute<Orden_serv, Usuario> id_us;
	public static volatile SingularAttribute<Orden_serv, Presupuesto_serv> id_pres;
	public static volatile SingularAttribute<Orden_serv, Integer> id_ord;
	public static volatile ListAttribute<Orden_serv, Det_orden_serv> detalles;
	public static volatile SingularAttribute<Orden_serv, Cliente> id_prov;

}

