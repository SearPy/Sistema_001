package net.Modelos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(datos_login.class)
public abstract class datos_login_ {

	public static volatile SingularAttribute<datos_login, Date> fecha;
	public static volatile SingularAttribute<datos_login, Boolean> estado;
	public static volatile SingularAttribute<datos_login, String> maquina;
	public static volatile SingularAttribute<datos_login, Usuario> id_usu;
	public static volatile SingularAttribute<datos_login, Integer> id;

}

