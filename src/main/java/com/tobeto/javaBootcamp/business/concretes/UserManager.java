package com.tobeto.javaBootcamp.business.concretes;

import com.tobeto.javaBootcamp.business.abstracts.UserService;
import com.tobeto.javaBootcamp.business.requests.create.user.CreateUserRequest;
import com.tobeto.javaBootcamp.business.response.create.user.CreateUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetAllUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetUserResponse;
import com.tobeto.javaBootcamp.core.utilities.mapping.ModelMapperService;
import com.tobeto.javaBootcamp.dataAccess.abstracts.UserRepository;
import com.tobeto.javaBootcamp.entities.concretes.User;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor


public class UserManager implements UserService {
    private  UserRepository userRepository;
    private ModelMapperService mapperService;


    @Override
    public CreateUserResponse  add(CreateUserRequest request) {
        User user =mapperService.forRequest().map(request,User.class);
        user.setCreatedDate(LocalDateTime.now());
        userRepository.save(user);

        CreateUserResponse response =mapperService.forResponse()
                .map(user,CreateUserResponse.class);
        return response;

    }

    @Override
    public List<GetAllUserResponse>getAll(){
      List<User> users=userRepository.findAll();

      List<GetAllUserResponse> userResponses=users.stream().map(user ->
              mapperService.forResponse().map(user,GetAllUserResponse.class))
              .collect(Collectors.toList());


      return userResponses;
    }

    @Override
    public GetUserResponse getById(int id) {
      User user =userRepository.getById(id);
        GetUserResponse response=
                mapperService.forResponse().map(user,GetUserResponse.class);
        return response;
    }

    @Override
    public boolean deleteUser(int userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }
    }





