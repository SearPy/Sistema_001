package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Presupuesto_com.class)
public abstract class Presupuesto_com_ {

	public static volatile SingularAttribute<Presupuesto_com, Calendar> fecha;
	public static volatile SingularAttribute<Presupuesto_com, Pedido_compra> id_ped;
	public static volatile SingularAttribute<Presupuesto_com, Usuario> id_us;
	public static volatile SingularAttribute<Presupuesto_com, Integer> id_pres;
	public static volatile ListAttribute<Presupuesto_com, Det_presupuesto_com> detalles;
	public static volatile SingularAttribute<Presupuesto_com, String> Estado;
	public static volatile SingularAttribute<Presupuesto_com, Proveedor> id_prov;

}

