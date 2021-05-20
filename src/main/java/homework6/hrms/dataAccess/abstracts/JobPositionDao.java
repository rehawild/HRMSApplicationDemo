package homework6.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import homework6.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{ 
	//JPA REPOSITORY GETALL,UPDATE,DELETE,VS METHODUNUN YERİNİ TUTAR BİRİNCİSİ ENTITY TÜRÜ İKİNİCİSİ PRIMARY KEY TÜRÜNÜN GİRİLDİĞİ YER
	// <T: GENERİC, ID: TABLONUN KULLANACAĞIN VERİNİN TİPİNİN TÜRÜ NEYSE O
	
}
