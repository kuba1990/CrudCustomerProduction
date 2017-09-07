import hello.entities.Customer;
import hello.entities.Product;
import hello.repositories.CustomerRepository;
import hello.services.CustomerService;
import hello.services.CustomerServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceTest {

    @Autowired
    private Customer    customer;
    @Autowired
    private Product product;


    @Test
    public void testFindById(){

        CustomerRepository customerRepository;





    }
}
