package recordJB.dto;

import java.util.Calendar;

import lombok.Data;

@Data
public class MemoDTO {

	private int memoNo;
	private Calendar memoTime;
	private String memoType;
	private String memo;
	private String urinVol;
	private char deleteYn;
	
}
