package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ajuste_stock.class)
public abstract class Ajuste_stock_ {

	public static volatile SingularAttribute<Ajuste_stock, Calendar> fecha;
	public static volatile SingularAttribute<Ajuste_stock, String> estado;
	public static volatile SingularAttribute<Ajuste_stock, String> tipo;
	public static volatile SingularAttribute<Ajuste_stock, Usuario> id_us;
	public static volatile ListAttribute<Ajuste_stock, Det_ajuste_stock> detalles;
	public static volatile SingularAttribute<Ajuste_stock, Integer> id_aj;

}

