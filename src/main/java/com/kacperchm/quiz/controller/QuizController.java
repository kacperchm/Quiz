package com.kacperchm.quiz.controller;

import com.kacperchm.quiz.dto.QuestionDto;
import com.kacperchm.quiz.model.Question;
import com.kacperchm.quiz.service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/all")
    public List<QuestionDto> getAllQuestion() {
        return quizService.getQuestions();
    }

}
