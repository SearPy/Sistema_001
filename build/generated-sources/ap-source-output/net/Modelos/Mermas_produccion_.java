package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Mermas_produccion.class)
public abstract class Mermas_produccion_ {

	public static volatile SingularAttribute<Mermas_produccion, Calendar> fecha;
	public static volatile SingularAttribute<Mermas_produccion, String> estado;
	public static volatile SingularAttribute<Mermas_produccion, Usuario> id_us;
	public static volatile ListAttribute<Mermas_produccion, Det_mermas_produccion> detalles;
	public static volatile SingularAttribute<Mermas_produccion, Integer> id_mer;

}

