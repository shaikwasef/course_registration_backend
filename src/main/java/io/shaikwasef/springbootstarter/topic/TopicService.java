package io.shaikwasef.springbootstarter.topic;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRespository ;
	
	
	public List<Topic> getAlltopics() {
		List<Topic> topicList = new ArrayList<>();
		topicRespository.findAll().forEach(topicList :: add);
		return topicList;
	}
	 
	public Topic getTopic(String id) {
//		return result.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRespository.findById(id).get();
		
	}
	
	public void addTopic(Topic newTopic) {
		topicRespository.save(newTopic);
	}

	public void updateTopic(Topic topic, String id) {
		topicRespository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRespository.deleteById(id);
	}

	
	
}
