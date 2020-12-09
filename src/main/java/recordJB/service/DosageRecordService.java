package recordJB.service;

import java.util.List;

import org.springframework.stereotype.Service;

import recordJB.dto.DosageRecDTO;


public interface DosageRecordService {
	
	public List<DosageRecDTO> readAll();
	
	public void recode(DosageRecDTO rec);
	
	public void delete(int no);
	
	public void modify(DosageRecDTO rec);	
	
	
}
