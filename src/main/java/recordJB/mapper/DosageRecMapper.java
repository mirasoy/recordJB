package recordJB.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import recordJB.dto.DosageRecDTO;

@Mapper
public interface DosageRecMapper {
	
	public List<DosageRecDTO> readAll() ;
	public void recode(DosageRecDTO rec);
	public void delete(int no) ;
	public void modify(DosageRecDTO rec);
	
}
