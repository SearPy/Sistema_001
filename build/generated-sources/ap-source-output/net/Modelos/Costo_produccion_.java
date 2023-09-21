package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Costo_produccion.class)
public abstract class Costo_produccion_ {

	public static volatile SingularAttribute<Costo_produccion, Calendar> fecha;
	public static volatile SingularAttribute<Costo_produccion, String> estado;
	public static volatile SingularAttribute<Costo_produccion, Servicios> reg;
	public static volatile SingularAttribute<Costo_produccion, Integer> id_pres;
	public static volatile ListAttribute<Costo_produccion, Det_costo_produccion> detalles;
	public static volatile SingularAttribute<Costo_produccion, Usuario> usuarioid;

}

