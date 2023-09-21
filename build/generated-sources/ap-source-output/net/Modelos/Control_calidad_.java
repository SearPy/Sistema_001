package net.Modelos;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Control_calidad.class)
public abstract class Control_calidad_ {

	public static volatile SingularAttribute<Control_calidad, Calendar> fecha;
	public static volatile SingularAttribute<Control_calidad, String> estado;
	public static volatile SingularAttribute<Control_calidad, Integer> id_con;
	public static volatile SingularAttribute<Control_calidad, Usuario> id_us;
	public static volatile SingularAttribute<Control_calidad, Registro_produccion> id_reg;
	public static volatile ListAttribute<Control_calidad, Det_control_calidad> detalles;

}

