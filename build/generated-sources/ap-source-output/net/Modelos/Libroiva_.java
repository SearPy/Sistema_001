package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Libroiva.class)
public abstract class Libroiva_ {

	public static volatile SingularAttribute<Libroiva, Integer> iva5;
	public static volatile SingularAttribute<Libroiva, Calendar> fecha;
	public static volatile SingularAttribute<Libroiva, String> tipo;
	public static volatile SingularAttribute<Libroiva, Integer> id;
	public static volatile SingularAttribute<Libroiva, Integer> iva10;
	public static volatile SingularAttribute<Libroiva, Factura_com> id_fac;
	public static volatile SingularAttribute<Libroiva, Nota_credito> id_nc;

}

