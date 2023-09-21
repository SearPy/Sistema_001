package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Libroivaven.class)
public abstract class Libroivaven_ {

	public static volatile SingularAttribute<Libroivaven, Integer> iva5;
	public static volatile SingularAttribute<Libroivaven, Calendar> fecha;
	public static volatile SingularAttribute<Libroivaven, String> tipo;
	public static volatile SingularAttribute<Libroivaven, Integer> id;
	public static volatile SingularAttribute<Libroivaven, Integer> iva10;
	public static volatile SingularAttribute<Libroivaven, Factura_ven> id_fac;
	public static volatile SingularAttribute<Libroivaven, Nota_credito_ven> id_nc;

}

