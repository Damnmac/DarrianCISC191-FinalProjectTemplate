package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class StockAppTest
{
    @Test
    void testRegularCustomer()
    {
        RegularCustomer vehicle = new RegularCustomer("John", "80", "farmer");
        assertEquals("John", vehicle.getName());
        assertEquals("80", vehicle.getAge());
        assertEquals("farmer", vehicle.getOccupation());
    }

    @Test
    void testStock()
    {
        Stock stock = new Stock("TESLA",19);
        assertEquals(19, stock.getPrice());
        assertEquals("TESLA", stock.getSymbol());
    }

    @Test
    void testLinkedList()
    {
        LinkedList<String> customerNames = new LinkedList<>();
        customerNames.add(0,"Jim");
        customerNames.add(1,"Fred");
        customerNames.add(2,"Dr.Dre");
        customerNames.add(3,"Patsy Cline");
        assertEquals("Jim\nFred\nDr.Dre\nPatsy Cline\n", customerNames.traverse());

    }






}
