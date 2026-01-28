package service.impl;

import dto.CustomerDto;
import javafx.collections.ObservableList;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public void addCustomerDetails(String customerId, String customerName, Integer phoneNumber, String address, String email) {

    }

    @Override
    public void deleteCustomerDetails(String customerId) {

    }

    @Override
    public void updateCustomerDetails(String customerId, String customerName, Integer phoneNumber, String address, String email) {

    }

    @Override
    public ObservableList<CustomerDto> getAllCustomerDetails() {
        return null;
    }
}
