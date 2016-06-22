package hackerrank.accesslist;

import java.util.ArrayList;
import java.util.List;

public class AccessList {
	

	public static void main(String[] args) {
		List<Customer> lstCustomer = new ArrayList<Customer>();

		Customer customer = new Customer();
		customer.setData("01/12/2006");
		customer.setNome("Mschuster");
		lstCustomer.add(customer);

		customer = null;
		customer = new Customer();
		customer.setData("01/05/2006");
		customer.setNome("Rafael");
		lstCustomer.add(customer);
		
		customer = null;
		customer = new Customer();
		customer.setData("02/02/2006");
		customer.setNome("Diniz");
		lstCustomer.add(customer);

		customer = null;
		customer = new Customer();
		customer.setData("02/02/2006");
		customer.setNome("Mschuster");
		lstCustomer.add(customer);
		
		customer = null;
		customer = new Customer();
		customer.setData("02/02/2006");
		customer.setNome("Mschuster");
		lstCustomer.add(customer);
		
		customer = null;
		customer = new Customer();
		customer.setData("01/02/2006");
		customer.setNome("Diniz");
		lstCustomer.add(customer);

		checkMultAccess(lstCustomer);
	}

	public static void checkMultAccess(List<Customer> lstCustomerAccess) {
		int loopCount = 0;

		List<String> multAccessList = new ArrayList<String>();

		for (Customer customer : lstCustomerAccess) {
			for (int i = loopCount; i < lstCustomerAccess.size(); i++) {
				Customer customerChild = lstCustomerAccess.get(i);

				if (customer.getNome().equals(customerChild.getNome())
						&& !customer.getData().equals(customerChild.getData())
						&& !multAccessList.contains(customer.getNome())) {
					multAccessList.add(customer.getNome());
					break;
				}
			}
			loopCount++;
		}

		System.out.println(String.valueOf(multAccessList.size()));
	}
}
