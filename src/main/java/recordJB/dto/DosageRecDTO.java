package recordJB.dto;

import java.time.LocalDateTime;
import java.util.Calendar;

import lombok.Data;

@Data
public class DosageRecDTO {

	private Integer dosingNO;
	private String dosingTime;
	private String pillType;
	private String memo;
	private char deletedYN;
	
}
