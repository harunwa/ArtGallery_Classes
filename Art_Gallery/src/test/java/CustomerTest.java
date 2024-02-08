import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.naming.Name;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("Name", 200);
    }

    @Test
    public void getName() {
        assertThat(customer.getName()).isEqualTo("Name");
    }

    @Test
    public void setName() {
        customer.setName("Lastname");
        assertThat(customer.getName()).isEqualTo("Lastname");
    }

    @Test
    public void getWallet(){
        assertThat(customer.getWallet()).isEqualTo(200.0);
    }

    @Test
    public void setWallet(){
        customer.setWallet(600);
        assertThat(customer.getWallet()).isEqualTo(600);
    }
}







