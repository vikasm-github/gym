package com.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.model.Package;
import com.gym.service.PackageService;

@RestController
@RequestMapping("/package")
public class PackageController {

	@Autowired
	private PackageService packageService;
	
	
	@PostMapping("/")
	public Package addPackage(@RequestBody Package package1) {
		return packageService.addPackage(package1);
	} 
}
