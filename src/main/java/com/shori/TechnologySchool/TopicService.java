package com.shori.TechnologySchool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {
	
	List<Topic>topics = new ArrayList<>(Arrays.asList(new Topic("001","Maths","Algebra"),
            new Topic("002","Science","Physics"),
            new Topic("003","Science","Chemistry")));


	
	public List<Topic> getAllTopics()
	{

		return topics;
	}

	
	public Topic getTopicById(String id)
	
	{
	   return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}


	public void addTopic(Topic topic) {
	topics.add(topic);
		
	}


	public void updateTopic(String id, Topic newTopicName) {

		for(int i=0; i<=topics.size(); i++ )
		{
			Topic theId = topics.get(i);
		
			if(theId.getId().equals(id))
			{
				topics.set(i, newTopicName);
				return;
			}
		}
	}


	public void removeTopic(String id) {
	
		for(int i=0; i<=topics.size(); i++ )
		{
			Topic theId = topics.get(i);
		
			if(theId.getId().equals(id))
			{
				topics.remove(theId);
				System.out.println("############");
				return;
			}
		}
	}





	



}
