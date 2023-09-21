package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Diagnostico.class)
public abstract class Diagnostico_ {

	public static volatile SingularAttribute<Diagnostico, String> recomendaciones;
	public static volatile SingularAttribute<Diagnostico, Calendar> fecha;
	public static volatile SingularAttribute<Diagnostico, String> estado;
	public static volatile SingularAttribute<Diagnostico, Integer> id_diag;
	public static volatile SingularAttribute<Diagnostico, String> acciones;
	public static volatile SingularAttribute<Diagnostico, String> estadodisp;
	public static volatile SingularAttribute<Diagnostico, String> problemas;
	public static volatile SingularAttribute<Diagnostico, Usuario> usuario;
	public static volatile SingularAttribute<Diagnostico, Recepcion> recepcion;

}

