package peaksoft.sprinbootrestapi2test.mapper;

import org.springframework.stereotype.Component;
import peaksoft.sprinbootrestapi2test.dto.UserResponse;
import peaksoft.sprinbootrestapi2test.entity.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserViewMapper {

    public UserResponse viewUser(User user){
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setName(user.getName());
        userResponse.setSurname(user.getSurname());
        userResponse.setEmail(user.getEmail());
        userResponse.setAge(user.getAge());
        userResponse.setActive(user.isActive());
        userResponse.setCreated(user.getCreated());
        return userResponse;
    }

    public List<UserResponse> viewAll(List<User> users){
        List<UserResponse> userResponses = new ArrayList<>();
        for (User user :  users) {
            userResponses.add(viewUser(user));
        }
        return userResponses;
    }

}
