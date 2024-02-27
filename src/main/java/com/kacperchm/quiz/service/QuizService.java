package com.kacperchm.quiz.service;

import com.kacperchm.quiz.dto.QuestionDto;
import com.kacperchm.quiz.model.Question;
import com.kacperchm.quiz.reposiotry.QuestionRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {

    private QuestionRepo repository;

    public QuizService(QuestionRepo repository) {
        this.repository = repository;
    }

    public List<QuestionDto> getQuestions() {
        List<Question> questionList = repository.findAll();
        List<QuestionDto> questionDtoList = new ArrayList<>();

        for (Question question: questionList) {
            questionDtoList.add(new QuestionDto(question));
        }
        return questionDtoList;
    }
}
