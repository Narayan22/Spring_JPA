package com.cignex.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

			@Service 	 
			public class TopicService 
			{
				@Autowired
				private TopicRepository topicRepository;
				
	/*
	 * private List<topic> topics = new ArrayList<>(Arrays.asList( new
	 * topic("Spring","SpringBoot","SpringDescription"), new
	 * topic("java","javaBoot","SpringDescription"), new
	 * topic("Hibernate","HBnet","SpringDescription"), new
	 * topic("PostMan","PMMan","SpringDescription") ));
	 */
			
			public List<topictodo> getallTopic()
			{
				//return topics;
				List<topictodo> topic =new ArrayList<>();
				topicRepository.findAll()
				.forEach(topic:: add);
				return topic;
				 
			

			}
			public topictodo getTopic(String id)
			{
				//return topics.stream().filter( t ->t.getId().equals(id)).findFirst().get();
				return topicRepository.findById(id).get();
			}
		
			public void addservice(topictodo topic)
			{
				topicRepository.save(topic);
				//topics.add(topic);
						
			}
			public void updateTopic(String id, topictodo topic) {
				topicRepository.save(topic);
				
			}
			public void deleteTopic(String id) {
				//topics.removeIf(t-> t.getId().equals(id));
				topicRepository.deleteById(id );
			}
			
}