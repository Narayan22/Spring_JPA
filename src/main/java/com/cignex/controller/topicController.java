package com.cignex.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class topicController 
{
	@Autowired
	private TopicService TopicService;
	
	@RequestMapping("/list")
	public List<topictodo> getallTopic()
	{
		return TopicService.getallTopic();
	}
	
	@RequestMapping("/get/{id}")
	public topictodo getTopic(@PathVariable String id)
	{
		return TopicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/save")
	public void addTopic( @RequestBody  topictodo topic) {
		TopicService.addservice(topic);
		
	}
	@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
	public void updateTopic( @RequestBody topictodo topic,@PathVariable String id) {
		TopicService.updateTopic(id,topic);
		
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public void deleteTopic( @RequestBody topictodo topic,@PathVariable String id) {
		 TopicService.deleteTopic(id);
		
	}
}