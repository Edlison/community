package xyz.edlison.community.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.edlison.community.DTO.QuestionDTO;
import xyz.edlison.community.mapper.QuestionMapper;
import xyz.edlison.community.mapper.UserMapper;
import xyz.edlison.community.model.Question;
import xyz.edlison.community.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {//组装User层和Question层

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionMapper questionMapper;

    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }
}