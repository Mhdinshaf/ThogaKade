package service;

import dto.CustomerDto;
import javafx.collections.ObservableList;

public interface CustomerService {

    void addCustomerDetails(String customerId,String customerName,Integer phoneNumber,String address,String email);
    void deleteCustomerDetails(String customerId);
    void updateCustomerDetails(String customerId,String customerName,Integer phoneNumber,String address,String email);
    ObservableList<CustomerDto> getAllCustomerDetails();

}
