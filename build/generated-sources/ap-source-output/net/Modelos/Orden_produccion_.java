package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Orden_produccion.class)
public abstract class Orden_produccion_ {

	public static volatile SingularAttribute<Orden_produccion, Calendar> fecha;
	public static volatile SingularAttribute<Orden_produccion, Cliente> cliente;
	public static volatile SingularAttribute<Orden_produccion, String> estado;
	public static volatile SingularAttribute<Orden_produccion, presupuesto_prod> id_pres;
	public static volatile SingularAttribute<Orden_produccion, Integer> id_ord;
	public static volatile SingularAttribute<Orden_produccion, Usuario> usuario;
	public static volatile ListAttribute<Orden_produccion, Det_orden_produccion> detalles;

}

