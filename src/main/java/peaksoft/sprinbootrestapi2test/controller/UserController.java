package peaksoft.sprinbootrestapi2test.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.sprinbootrestapi2test.dto.UserRequest;
import peaksoft.sprinbootrestapi2test.dto.UserResponse;
import peaksoft.sprinbootrestapi2test.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")


public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponse create(@RequestBody UserRequest userRequest){
        return userService.create(userRequest);
    }

    @GetMapping("{id}")
    public UserResponse update(@PathVariable Long id){
        return userService.findById(id);
    }

    @PutMapping("{id}")
    public UserResponse update(@PathVariable Long id,@RequestBody UserRequest userRequest){
        return userService.update(id,userRequest);
    }

    @DeleteMapping("{id}")
    public UserResponse delete(@PathVariable Long id){
        return userService.deleteById(id);
    }

    @GetMapping
    public List<UserResponse> getAllUsers(){
        return userService.getAllUsers();
    }

}
