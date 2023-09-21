package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Nota_credito.class)
public abstract class Nota_credito_ {

	public static volatile SingularAttribute<Nota_credito, String> tipo;
	public static volatile SingularAttribute<Nota_credito, String> estado;
	public static volatile SingularAttribute<Nota_credito, Integer> totaliva5;
	public static volatile SingularAttribute<Nota_credito, Integer> totaliva10;
	public static volatile SingularAttribute<Nota_credito, Integer> id_nc;
	public static volatile SingularAttribute<Nota_credito, Proveedor> id_prov;
	public static volatile SingularAttribute<Nota_credito, Calendar> fecha;
	public static volatile SingularAttribute<Nota_credito, Integer> total;
	public static volatile SingularAttribute<Nota_credito, String> pagado;
	public static volatile SingularAttribute<Nota_credito, Usuario> id_us;
	public static volatile SingularAttribute<Nota_credito, String> timbrado;
	public static volatile SingularAttribute<Nota_credito, String> fecha_fac;
	public static volatile ListAttribute<Nota_credito, Det_nota_credito> detalles;
	public static volatile SingularAttribute<Nota_credito, Factura_com> id_fac;

}

