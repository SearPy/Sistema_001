package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Recepcion.class)
public abstract class Recepcion_ {

	public static volatile SingularAttribute<Recepcion, Calendar> fecha;
	public static volatile SingularAttribute<Recepcion, String> marca;
	public static volatile SingularAttribute<Recepcion, Cliente> cliente;
	public static volatile SingularAttribute<Recepcion, String> tipo;
	public static volatile SingularAttribute<Recepcion, String> estado;
	public static volatile SingularAttribute<Recepcion, String> color;
	public static volatile SingularAttribute<Recepcion, Integer> id_rec;
	public static volatile SingularAttribute<Recepcion, String> observaciones;
	public static volatile SingularAttribute<Recepcion, Usuario> usuario;
	public static volatile SingularAttribute<Recepcion, String> modelo;

}

