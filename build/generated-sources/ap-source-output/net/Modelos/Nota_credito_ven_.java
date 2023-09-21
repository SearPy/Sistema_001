package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Nota_credito_ven.class)
public abstract class Nota_credito_ven_ {

	public static volatile SingularAttribute<Nota_credito_ven, String> tipo;
	public static volatile SingularAttribute<Nota_credito_ven, String> estado;
	public static volatile SingularAttribute<Nota_credito_ven, Integer> totaliva5;
	public static volatile SingularAttribute<Nota_credito_ven, Integer> totaliva10;
	public static volatile SingularAttribute<Nota_credito_ven, Integer> id_nc;
	public static volatile SingularAttribute<Nota_credito_ven, Cliente> id_prov;
	public static volatile SingularAttribute<Nota_credito_ven, Calendar> fecha;
	public static volatile SingularAttribute<Nota_credito_ven, Integer> total;
	public static volatile SingularAttribute<Nota_credito_ven, String> pagado;
	public static volatile SingularAttribute<Nota_credito_ven, Usuario> id_us;
	public static volatile SingularAttribute<Nota_credito_ven, String> timbrado;
	public static volatile SingularAttribute<Nota_credito_ven, String> fecha_fac;
	public static volatile ListAttribute<Nota_credito_ven, Det_nota_credito_ven> detalles;
	public static volatile SingularAttribute<Nota_credito_ven, Factura_ven> id_fac;

}

