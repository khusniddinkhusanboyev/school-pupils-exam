package uz.schoolpupilcomptest.security.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import uz.schoolpupilcomptest.security.model.User;
import uz.schoolpupilcomptest.security.repository.UserRepository;
import uz.schoolpupilcomptest.security.util.UserRequest;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findUserById(Integer id) throws Exception {
        return userRepository.findById(id).orElseThrow(()->new Exception("User not found with id - "+id));
    }

    public Optional<User> validation(UserRequest userRequest)  {
        return userRepository.findByUsername(userRequest.getUsername());
    }
}
