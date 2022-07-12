package peaksoft.sprinbootrestapi2test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.sprinbootrestapi2test.dto.UserRequest;
import peaksoft.sprinbootrestapi2test.dto.UserResponse;
import peaksoft.sprinbootrestapi2test.entity.User;
import peaksoft.sprinbootrestapi2test.mapper.UserEditMapper;
import peaksoft.sprinbootrestapi2test.mapper.UserViewMapper;
import peaksoft.sprinbootrestapi2test.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserEditMapper userEditMapper;
    private final UserViewMapper userViewMapper;

    public UserResponse create(UserRequest userRequest){
        User user = userEditMapper.create(userRequest);
        userRepository.save(user);
        return userViewMapper.viewUser(user);
    }

    public UserResponse update(Long id,UserRequest userRequest){
        User user = userRepository.findById(id).get();
        userEditMapper.update(user,userRequest);
        return userViewMapper.viewUser(userRepository.save(user));
    }

    public UserResponse findById(Long id){
        User user = userRepository.findById(id).get();
        return userViewMapper.viewUser(user);
    }

    public  UserResponse deleteById(Long id){
        User user = userRepository.getById(id);
        userRepository.deleteById(id);
        return  userViewMapper.viewUser(user);
    }

    public List<UserResponse> getAllUsers(){
        return userViewMapper.viewAll(userRepository.findAll());
    }

}
