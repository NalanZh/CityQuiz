package edu.lawrence.CityServer;

import java.util.Random;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Joe Gregg
 */
@RestController
@RequestMapping("/quiz")
@CrossOrigin(origins="*")
public class QuizController {
    private QuizDAO dao;
    private int rightanswer;
    private Random r = new Random();
    private City c;
    
    
    public QuizController(QuizDAO dao) {
        this.dao = dao;
    }
    /*one for a GET with no parameters
      one for a POST that takes an Answer object as its parameter. 
    
    The GET select a random integer in the range from 1 to 198, fetch the City object with that id, 
    and return that City. (Before returning the City object you should also set
    its answer value to 0 so the user won't know the answer in advance.)
    
    The POST method will get the id number from the Answer the user posts and look up the
    City with that id. The POST method will then compare the correct answer found 
    in the City with the answer in the Answer object. If they match, the POST method
    should return the integer 1. If they don't match the method should return 0.*/
    
    @GetMapping
    public City getAnswer(){
        int id = r.nextInt(198) + 1;
        c = dao.findById(id);  
        rightanswer=c.getAnswer();
        c.setAnswer(0);
        return c;
    }
    
    @PostMapping//parameter: getting param from url checking if the right answer
    public int save(@RequestBody Answer answer) {
        int idanswer =answer.getAnswer();
        if(rightanswer==idanswer)
        {return 1;}
        else
        {return 0;}
    }
    
}
