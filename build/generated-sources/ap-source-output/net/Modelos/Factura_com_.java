package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Factura_com.class)
public abstract class Factura_com_ {

	public static volatile SingularAttribute<Factura_com, String> tipo;
	public static volatile SingularAttribute<Factura_com, String> estado;
	public static volatile SingularAttribute<Factura_com, Integer> totaliva5;
	public static volatile SingularAttribute<Factura_com, Orden_com> id_ord;
	public static volatile SingularAttribute<Factura_com, Integer> totaliva10;
	public static volatile SingularAttribute<Factura_com, Proveedor> id_prov;
	public static volatile SingularAttribute<Factura_com, Calendar> fecha;
	public static volatile SingularAttribute<Factura_com, Integer> total;
	public static volatile SingularAttribute<Factura_com, String> pagado;
	public static volatile SingularAttribute<Factura_com, Usuario> id_us;
	public static volatile SingularAttribute<Factura_com, String> timbrado;
	public static volatile SingularAttribute<Factura_com, String> fecha_fac;
	public static volatile ListAttribute<Factura_com, Det_factura_com> detalles;
	public static volatile SingularAttribute<Factura_com, Integer> id_fac;

}

