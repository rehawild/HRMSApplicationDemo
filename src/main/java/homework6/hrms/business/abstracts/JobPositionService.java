package homework6.hrms.business.abstracts;

import java.util.List;

import homework6.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
}
