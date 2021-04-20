package com.msdt.phrental;

import com.msdt.phrental.domain.CustRole;
import com.msdt.phrental.domain.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer = new Customer(1, "San", "Mathy", "Addres", false, CustRole.ADMIN);
        
        System.out.println(customer);
        System.out.println(customer.getCustAddress());
    }
}
