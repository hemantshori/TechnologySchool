package com.shori.TechnologySchool;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TopicService {
	
private static List<Topic> topics =  Arrays.asList(
		new Topic("java", "basejava", "sadfsafdfasfddasdfadsdfsafsdffasdfsa"),
		new Topic("spring", "base spring", "sadsfsfsdfsdfsfgrtyhhryhr")
		);
	
public static List<Topic> getAllTopics()
{
return topics;
}
}
