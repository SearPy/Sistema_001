package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Registro_produccion.class)
public abstract class Registro_produccion_ {

	public static volatile SingularAttribute<Registro_produccion, Calendar> fecha;
	public static volatile SingularAttribute<Registro_produccion, Cliente> cliente;
	public static volatile SingularAttribute<Registro_produccion, String> estado;
	public static volatile SingularAttribute<Registro_produccion, Orden_produccion> id_pres;
	public static volatile SingularAttribute<Registro_produccion, Integer> id_ord;
	public static volatile SingularAttribute<Registro_produccion, Usuario> usuario;
	public static volatile ListAttribute<Registro_produccion, Det_registro_produccion> detalles;

}

