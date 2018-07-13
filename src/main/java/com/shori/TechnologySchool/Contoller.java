package com.shori.TechnologySchool;



import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	
	}
	
	
	@RequestMapping("/topics/{id}")
	public Topic getPerticularTopicById(@PathVariable String id)
	{
		return topicService.getTopicById(id);
	
	}

	@RequestMapping(value="/topics", method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic sometopic)
	{
		topicService.addTopic(sometopic);
		
	}

	// to update a topic
	@RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic newTopicName, @PathVariable String id)
	{
		topicService.updateTopic(id, newTopicName);
		
	}
	//to remove a topic
	@RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
	public void removeTopic(@PathVariable String id)
	{
		topicService.removeTopic(id);
		
	}
	
}
