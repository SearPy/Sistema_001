package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pedido_compra.class)
public abstract class Pedido_compra_ {

	public static volatile SingularAttribute<Pedido_compra, Integer> id_ped;
	public static volatile SingularAttribute<Pedido_compra, Calendar> fecha;
	public static volatile SingularAttribute<Pedido_compra, String> estado;
	public static volatile ListAttribute<Pedido_compra, Det_pedido_compra> detalles;
	public static volatile SingularAttribute<Pedido_compra, Usuario> usuarioid;

}

