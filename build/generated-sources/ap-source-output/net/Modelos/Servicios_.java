package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Servicios.class)
public abstract class Servicios_ {

	public static volatile SingularAttribute<Servicios, Calendar> fecha;
	public static volatile SingularAttribute<Servicios, String> estado;
	public static volatile SingularAttribute<Servicios, Usuario> id_us;
	public static volatile SingularAttribute<Servicios, Orden_serv> id_pres;
	public static volatile SingularAttribute<Servicios, Integer> id_ord;
	public static volatile ListAttribute<Servicios, Det_servicios> detalles;
	public static volatile SingularAttribute<Servicios, Cliente> id_prov;

}

