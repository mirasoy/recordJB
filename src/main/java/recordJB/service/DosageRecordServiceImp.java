package recordJB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recordJB.dto.DosageRecDTO;
import recordJB.mapper.DosageRecMapper;


@Service
public class DosageRecordServiceImp  implements DosageRecordService{

	@Autowired
	DosageRecMapper drm ;
	
	
	@Override
	public void recode(DosageRecDTO rec) {
		// TODO Auto-generated method stub
		drm.recode(rec);
	}

	@Override
	public void delete(int no) {
		drm.delete(no);
		
	}

	@Override
	public void modify(DosageRecDTO rec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DosageRecDTO> readAll() {
		
		return drm.readAll();
	}
	
	
	
}
