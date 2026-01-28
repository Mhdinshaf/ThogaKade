package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private String customerId;
    private String customerName;
    private Integer phoneNumber;
    private String address;
    private String email;
}
