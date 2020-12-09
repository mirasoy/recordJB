package recordJB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import recordJB.dto.DosageRecDTO;
import recordJB.service.DosageRecordService;

@Controller
public class DosageRecordController {

	@Autowired
	DosageRecordService drs;

	@PostMapping("recordJB/dosageRecord")
	@ResponseBody
	public void dasageRecord(DosageRecDTO rec) {
		drs.recode(rec);
		System.out.println("저장완료");
	}

	@PostMapping("recordJB/readDasageRecord")
	@ResponseBody
	public ResponseEntity<List<DosageRecDTO>> readDasageRecord() {
		
		System.out.println("불러오기");
		return new ResponseEntity<List<DosageRecDTO>>(drs.readAll(), HttpStatus.OK);

	}
	@PostMapping("recordJB/delRecord")
	@ResponseBody
	public void delRecord(Integer no) {
		drs.delete(no);
	}

}
