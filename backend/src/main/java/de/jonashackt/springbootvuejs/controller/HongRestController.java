package de.jonashackt.springbootvuejs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import de.jonashackt.springbootvuejs.domain.User;
import de.jonashackt.springbootvuejs.repository.UserRepository;

@RestController()
@RequestMapping("/hong")
public class HongRestController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final String HELLO_TEXT = "Hello from Spring Boot Backend!";

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path = "/hi", produces=MediaType.APPLICATION_XML_VALUE)
    public Object sayHello() {
    	Map<String, String> m = new HashMap<>();
    	m.put("a", "aa");
    	m.put("b", "bb");
    	return m;
    }

    @RequestMapping(path = "/hong", method = {RequestMethod.POST, RequestMethod.GET}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Object addNewUser () {
    	List<Object> list = new ArrayList<>();
    	for(int i=0; i<10; i++) {
    		TestDto d = new TestDto();
    		d.name = "hong";
    		d.age = 33;
    		list.add(d);
    	}
    	return list;
    }
    
    @RequestMapping(path = "/list", method = {RequestMethod.POST, RequestMethod.GET}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object list () {
    	List<Object> list = new ArrayList<>();
    	int age = Math.abs(new Random().nextInt()) % 30;
    	for(int i=0; i<age; i++) {
    		TestDto d = new TestDto();
    		d.name = "hong" + i;
    		d.age = i;
    		list.add(d);
    	}
    	return list;
    }

    @GetMapping(path="/user/{id}")
    public @ResponseBody User getUserById(@PathVariable("id") long id) {
        logger.info("Reading user with id " + id + " from database.");
        return userRepository.findById(id).get();
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name="ppp")
    public static class TestDto{
    	public String name;
    	public int age;
    }
}
