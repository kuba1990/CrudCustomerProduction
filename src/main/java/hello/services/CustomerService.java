package hello.services;

import hello.entities.Customer;
import hello.repositories.CustomerRepository;

import java.util.List;

public interface CustomerService {
    public Customer getById(Long id);
    public List<Customer> getAll();
    public List<Customer> create(Customer customer);
    public List<Customer> delete(Long id);
    public Customer update(Customer customer, Long id);

}




    //dalete customer
    //add customer
    //update customer

