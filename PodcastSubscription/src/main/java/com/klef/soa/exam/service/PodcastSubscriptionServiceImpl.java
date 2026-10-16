package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.PodcastSubscription;
import com.klef.soa.exam.repository.PodcastSubscriptionRepository;

@Service
public class PodcastSubscriptionServiceImpl implements PodcastSubscriptionService {
	
	@Autowired
	private PodcastSubscriptionRepository repository;
	
	@Override
	public PodcastSubscription addSubscriber(PodcastSubscription ps) {
		
		return repository.save(ps);
		
	}
	
	@Override
	public List<PodcastSubscription> displayAll() {
		return repository.findAll();
	}
	
	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}
	
	

}
