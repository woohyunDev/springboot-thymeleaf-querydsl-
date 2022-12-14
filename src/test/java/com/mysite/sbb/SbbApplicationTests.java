package com.mysite.sbb;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;

//import com.mysite.sbb.answer.Answer;
//import com.mysite.sbb.answer.AnswerRepository;
//import com.mysite.sbb.question.Question;
//import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

	//@Autowired
	//private QuestionRepository questionRepository;
	
	//@Autowired
	//private AnswerRepository answerRepository;
	
    @Autowired
    private QuestionService questionService;
	
	//@Transactional
	@Test
	void testJpa() {
		/*		
  		Question q1 = new Question();
		q1.setSubject("sbb가 무엇인가요?");
		q1.setContent("sbb에대해 알고싶습니다.");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);
		
		Question q2 = new Question();
		q2.setSubject("what is spring boot?");
		q2.setContent("springboot is framwork");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
		
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2,all.size());
		
		
		Optional<Question> oq = this.questionRepository.findById(1);
		if(oq.isPresent()) {
			Question q = oq.get();
			assertEquals("sbb가 무엇인가요?",q.getSubject());			
			
		
		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
		assertEquals(1,q.getId());
		
		
		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?","sbb에대해 알고싶습니다.");
		assertEquals(1,q.getId());
		
		
		List<Question> qList = this.questionRepository.findBySubjectLike("%s%");
		Question q = qList.get(0);
		assertEquals("sbb가 무엇인가요?",q.getSubject());
			
		
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		q.setContent("spring is framework");
		this.questionRepository.save(q);
		
		
		assertEquals(2, this.questionRepository.count());
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		this.questionRepository.delete(q);
		assertEquals(1, this.questionRepository.count());		
		
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		Answer a = new Answer();
		a.setContent("okay,thank you2");
		a.setQuestion(q);
		a.setCreateDate(LocalDateTime.now());
		
		this.answerRepository.save(a);
		
		
		List<Answer> aList = this.answerRepository.findAll();
		assertEquals(2,aList.size());
		
		
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		List<Answer> aList = q.getAnswerList();
		assertEquals(2,aList.size());
		
		*/
		
		for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용무";
            this.questionService.create(subject, content, null);
        }
				
		
		}
		
		
		
}


