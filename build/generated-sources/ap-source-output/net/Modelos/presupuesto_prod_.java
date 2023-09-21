package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(presupuesto_prod.class)
public abstract class presupuesto_prod_ {

	public static volatile SingularAttribute<presupuesto_prod, Calendar> fecha;
	public static volatile SingularAttribute<presupuesto_prod, String> estado;
	public static volatile SingularAttribute<presupuesto_prod, Cliente> clienteid;
	public static volatile SingularAttribute<presupuesto_prod, Integer> id_pres;
	public static volatile ListAttribute<presupuesto_prod, Det_presupuesto_prod> detalles;
	public static volatile SingularAttribute<presupuesto_prod, Usuario> usuarioid;

}

