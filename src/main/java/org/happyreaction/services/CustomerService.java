package org.happyreaction.services;

import org.happyreaction.model.Customer;
import org.happyreaction.repositories.CustomerRepository;
import org.happyreaction.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Service implementation for Customer.
 */
@Service("customerService")
public class CustomerService extends BaseService<Customer> {

    private static final long serialVersionUID = 1L;
    
    @Autowired
    private CustomerRepository repository;
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected JpaRepository<Customer, Long> getRepository() {
        return repository;
    }

}
