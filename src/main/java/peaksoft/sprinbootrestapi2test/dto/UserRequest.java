package peaksoft.sprinbootrestapi2test.dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter

public class UserRequest {

    private String name;
    private String surname;
    private String email;
    private int age;
}
