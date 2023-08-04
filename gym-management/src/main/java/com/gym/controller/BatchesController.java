package com.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.model.Batches;
import com.gym.service.BatchesService;

@RestController
@RequestMapping("/batches")
public class BatchesController {

	@Autowired
	private BatchesService batchesService;
	
	@PostMapping("/")
	public Batches addBatch(@RequestBody Batches batch) {
		return batchesService.addBatch(batch);
	}
	
	
}
