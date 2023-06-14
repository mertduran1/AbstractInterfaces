public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;
    private MernisAdapterService mernisAdapterService;
    @Override
    public void save(Customer customer) {
       if (mernisAdapterService.real(customer)) {
           super.save(customer);
       }else {
           System.out.println("Fake Person");
       }
    }
}
