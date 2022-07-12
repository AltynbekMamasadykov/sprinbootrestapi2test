package peaksoft.sprinbootrestapi2test.mapper;

import org.springframework.stereotype.Component;
import peaksoft.sprinbootrestapi2test.dto.UserRequest;
import peaksoft.sprinbootrestapi2test.entity.User;

import java.time.LocalDate;

@Component
public class UserEditMapper {

    public User create(UserRequest userRequest){
        if(userRequest == null){
            return null;
        }
        User user = new User();
        user.setName(userRequest.getName());
        user.setSurname(userRequest.getSurname());
        user.setEmail(userRequest.getEmail());
        user.setAge(userRequest.getAge());
        user.setCreated(LocalDate.now());
        user.setActive(true);
        return user;
    }

    public void update(User user, UserRequest userRequest){
        user.setName(userRequest.getName());
        user.setSurname(userRequest.getSurname());
        user.setEmail(userRequest.getEmail());
        user.setAge(userRequest.getAge());
    }


}
