package homework6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import homework6.hrms.business.abstracts.JobPositionService;
import homework6.hrms.dataAccess.abstracts.JobPositionDao;
import homework6.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired//:altındaki veri tipine bakıyor. İmplemente olduğu somut sınıf arıyor, onu bulup ( ancak ve ancak 1 tane bulursa )
	//onu newliyor nerde o istenirse oluşturduğu referansı atıyor.
	
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return jobPositionDao.findAll();
	}

}
