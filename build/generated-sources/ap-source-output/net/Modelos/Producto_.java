package net.Modelos;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Producto.class)
public abstract class Producto_ {

	public static volatile SingularAttribute<Producto, String> descripcion;
	public static volatile SingularAttribute<Producto, String> tipo;
	public static volatile SingularAttribute<Producto, Integer> precio;
	public static volatile SingularAttribute<Producto, String> iva;
	public static volatile SingularAttribute<Producto, Integer> id_prod;
	public static volatile SingularAttribute<Producto, Integer> stock;

}

