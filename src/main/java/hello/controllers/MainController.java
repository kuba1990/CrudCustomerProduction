package hello.controllers;


import hello.entities.Customer;
import hello.repositories.CustomerRepository;
import hello.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/customer") // This means URL's start with /demo (after Application path)
public class MainController {

    //request param- tylko paramter--> integer
    //request body--> oczekuje całego obiektu

    @Autowired
    private CustomerService customerService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Customer> create(@RequestBody Customer user) {
        customerService.create(user);
        return customerService.getAll();
    }


    @PutMapping("/update/{id}")
    public Customer updateBook(@RequestBody Customer customer, @PathVariable Long id) {
        return customerService.update(customer, id);
    }

    @DeleteMapping("/delete/{id}")
    public List<Customer> delete(@PathVariable("id") Long id) {
        return customerService.delete(id);

    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@RequestParam("id") Long id){
        return customerService.getById(id);
    }










   /* @RequestMapping(value="/editemp/{id}")
    public ModelAndView edit(@PathVariable int id){
        Emp emp=dao.getEmpById(id);
        return new ModelAndView("empeditform","command",emp);*/



    }