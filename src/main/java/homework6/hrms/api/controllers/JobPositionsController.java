package homework6.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import homework6.hrms.business.abstracts.JobPositionService;
import homework6.hrms.entities.concretes.JobPosition;

@RestController// restful api controller kullandığımızı belirtiyoruz
@RequestMapping("/api/jobpositions")// ulaşmak için nereye gitmemiz gerektiğini 
public class JobPositionsController {
	
	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return jobPositionService.getAll();
	}
}
