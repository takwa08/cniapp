package entity;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGenerator implements IdentifierGenerator {

   

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		return 1;
	}


	
}