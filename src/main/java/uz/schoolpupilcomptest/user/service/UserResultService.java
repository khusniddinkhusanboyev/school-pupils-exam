package uz.schoolpupilcomptest.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.schoolpupilcomptest.security.model.User;
import uz.schoolpupilcomptest.security.repository.UserRepository;
import uz.schoolpupilcomptest.user.model.UserResultRequest;
import uz.schoolpupilcomptest.user.model.UserResults;
import uz.schoolpupilcomptest.user.repository.UserResultRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserResultService {
    private final UserResultRepository userResultRepository;
    private final UserRepository userRepository;

    public List<UserResults> getAll() {
        return userResultRepository.findAll();
    }

    public UserResults create(UserResultRequest userResultRequest) {
        Optional<User> user = userRepository.findById(userResultRequest.getUserId());
        UserResults userResults = new UserResults();
        if (user.isPresent()) {
            userResults = UserResults
                    .builder()
                    .userId(user.get())
                    .answerCount(userResultRequest.getCorrectAnswerCount())
                    .localDateTime(LocalDateTime.now())
                    .build();
        }
        return userResultRepository.save(userResults);
    }
}
