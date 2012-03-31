package com.example.user;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractUser.class)
public abstract class AbstractUser_ {

	public static volatile SingularAttribute<AbstractUser, Long> id;
	public static volatile SingularAttribute<AbstractUser, Boolean> enabled;
	public static volatile SingularAttribute<AbstractUser, String> username;
	public static volatile SingularAttribute<AbstractUser, Boolean> accountNonExpired;
	public static volatile SingularAttribute<AbstractUser, String> password;
	public static volatile SingularAttribute<AbstractUser, Boolean> credentialsNonExpired;
	public static volatile SingularAttribute<AbstractUser, Boolean> accountNonLocked;

}

