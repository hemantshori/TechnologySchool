package com.shori.TechnologySchool;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/login")
public List<Topic> getAllTopics()
{
return TopicService.getAllTopics();
	


}
}