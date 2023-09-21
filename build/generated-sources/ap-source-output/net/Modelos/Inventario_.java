package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Inventario.class)
public abstract class Inventario_ {

	public static volatile SingularAttribute<Inventario, Calendar> fecha;
	public static volatile SingularAttribute<Inventario, Integer> id_inv;
	public static volatile ListAttribute<Inventario, Det_inventario> detalles;
	public static volatile SingularAttribute<Inventario, Usuario> usuarioid;
	public static volatile SingularAttribute<Inventario, String> Estado;

}

