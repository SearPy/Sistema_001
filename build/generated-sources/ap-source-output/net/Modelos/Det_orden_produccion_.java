package net.Modelos;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Det_orden_produccion.class)
public abstract class Det_orden_produccion_ {

	public static volatile SingularAttribute<Det_orden_produccion, Integer> precio;
	public static volatile SingularAttribute<Det_orden_produccion, Integer> id_det;
	public static volatile SingularAttribute<Det_orden_produccion, Orden_produccion> id_ord;
	public static volatile SingularAttribute<Det_orden_produccion, Producto> id_prod;
	public static volatile SingularAttribute<Det_orden_produccion, Integer> cantidad;

}

