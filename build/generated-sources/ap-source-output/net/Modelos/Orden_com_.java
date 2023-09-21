package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Orden_com.class)
public abstract class Orden_com_ {

	public static volatile SingularAttribute<Orden_com, Calendar> fecha;
	public static volatile SingularAttribute<Orden_com, String> estado;
	public static volatile SingularAttribute<Orden_com, Usuario> id_us;
	public static volatile SingularAttribute<Orden_com, Presupuesto_com> id_pres;
	public static volatile SingularAttribute<Orden_com, Integer> id_ord;
	public static volatile ListAttribute<Orden_com, Det_orden_com> detalles;
	public static volatile SingularAttribute<Orden_com, Proveedor> id_prov;

}

