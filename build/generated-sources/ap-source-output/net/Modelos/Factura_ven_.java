package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Factura_ven.class)
public abstract class Factura_ven_ {

	public static volatile SingularAttribute<Factura_ven, String> tipo;
	public static volatile SingularAttribute<Factura_ven, String> estado;
	public static volatile SingularAttribute<Factura_ven, Integer> totaliva5;
	public static volatile SingularAttribute<Factura_ven, Integer> totaliva10;
	public static volatile SingularAttribute<Factura_ven, Cliente> id_prov;
	public static volatile SingularAttribute<Factura_ven, Calendar> fecha;
	public static volatile SingularAttribute<Factura_ven, Integer> total;
	public static volatile SingularAttribute<Factura_ven, String> factura;
	public static volatile SingularAttribute<Factura_ven, String> pagado;
	public static volatile SingularAttribute<Factura_ven, Usuario> id_us;
	public static volatile SingularAttribute<Factura_ven, String> timbrado;
	public static volatile ListAttribute<Factura_ven, Det_factura_ven> detalles;
	public static volatile SingularAttribute<Factura_ven, Integer> id_fac;

}

