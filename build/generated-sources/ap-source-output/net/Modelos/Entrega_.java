package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Entrega.class)
public abstract class Entrega_ {

	public static volatile SingularAttribute<Entrega, Calendar> fecha;
	public static volatile SingularAttribute<Entrega, String> estado;
	public static volatile SingularAttribute<Entrega, Servicios> reg;
	public static volatile SingularAttribute<Entrega, Integer> id_pres;
	public static volatile SingularAttribute<Entrega, Usuario> usuarioid;

}

