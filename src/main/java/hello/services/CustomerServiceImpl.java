package hello.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import hello.entities.Customer;
import hello.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getById(Long id) {
        return customerRepository.findOne(id);
    }

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public List<Customer> create(Customer customer) {
        customerRepository.save(customer);
        return customerRepository.findAll();
    }

    public List<Customer> delete(Long id) {
        customerRepository.delete(id);
        return customerRepository.findAll();
    }

    @Override
    public Customer update(Customer customer, Long id) {
        customer.setId(id);
        customerRepository.save(customer);
        return customer;
    }
}
