package uz.schoolpupilcomptest.questions.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.schoolpupilcomptest.questions.model.Category;
import uz.schoolpupilcomptest.questions.model.Question;
import uz.schoolpupilcomptest.questions.repository.QuestionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;
    public Question save(Question question){
      return   questionRepository.save(question);

    }
    public List<Question> getAll(){
        return questionRepository.findAll();
    }

    public List<Question> getByCategoryId(Integer categoryId){
        return questionRepository.findByCategoryId(categoryId);
    }


}
