package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Presupuesto_serv.class)
public abstract class Presupuesto_serv_ {

	public static volatile SingularAttribute<Presupuesto_serv, Calendar> fecha;
	public static volatile SingularAttribute<Presupuesto_serv, Diagnostico> id_ped;
	public static volatile SingularAttribute<Presupuesto_serv, Usuario> id_us;
	public static volatile SingularAttribute<Presupuesto_serv, Integer> id_pres;
	public static volatile ListAttribute<Presupuesto_serv, Det_presupuesto_serv> detalles;
	public static volatile SingularAttribute<Presupuesto_serv, String> Estado;
	public static volatile SingularAttribute<Presupuesto_serv, Cliente> id_prov;

}

