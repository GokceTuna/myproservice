package com.sample.bo.welcome;

import org.springframework.stereotype.Service;

import com.sample.dao.customer.Customer;
import com.sample.service.contants.BoNames;

/**
 * 
 * @author N44947
 *
 *         Business object for welcome operations. Default feature.
 * 
 */
@Service(BoNames.BO_WELCOME_DEFAULT)
class WelcomeBO extends WelcomeBaseBO {

	@Override
	protected String getNameForMessage(Customer pOBCustomer) {
		StringBuilder lOBStringBuilder = new StringBuilder();
		lOBStringBuilder.append(pOBCustomer.getFirstName()).append(' ').append(pOBCustomer.getLastName());

		return lOBStringBuilder.toString();
	}

}
