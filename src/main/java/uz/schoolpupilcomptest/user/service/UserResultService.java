package uz.schoolpupilcomptest.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.schoolpupilcomptest.user.model.UserResults;
import uz.schoolpupilcomptest.user.repository.UserResultRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserResultService {
    private final UserResultRepository userResultRepository;

    public List<UserResults> getAll(){
        return userResultRepository.findAll();
    }
    public UserResults create(UserResults userResults){
        return userResultRepository.save(userResults);
    }
}
