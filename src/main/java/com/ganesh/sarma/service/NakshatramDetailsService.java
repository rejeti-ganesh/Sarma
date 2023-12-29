package com.ganesh.sarma.service;

import java.lang.reflect.Field;
import org.springframework.stereotype.Service;
import com.ganesh.sarma.data.NakshatramDetails;
import com.ganesh.sarma.dto.PontanaRequestDTO;
import com.ganesh.sarma.dto.PonthanaResponseDTO;

@Service
public class NakshatramDetailsService {

	public PonthanaResponseDTO getPonthanalu(PontanaRequestDTO pontanaRequestDTO) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field fVarudu = NakshatramDetails.class.getField(pontanaRequestDTO.getVaruduNakshtram()); 
		String[] varudu = (String[]) fVarudu.get(null);
		Field fVadhuvu = NakshatramDetails.class.getField(pontanaRequestDTO.getVadhuvuNakshatram()); 
		String[] vadhuvu = (String[]) fVadhuvu.get(null);
		
		PonthanaResponseDTO ponthanaResponseDTO = new PonthanaResponseDTO();
		ponthanaResponseDTO.setHeadings(NakshatramDetails.headings.split(","));
		ponthanaResponseDTO.setVaruduDetails(varudu[pontanaRequestDTO.getVaruduPaadam()].split(","));
		ponthanaResponseDTO.setVadhuvuDetails(vadhuvu[pontanaRequestDTO.getVadhuvuPaadam()].split(","));
		return ponthanaResponseDTO;
	}
	
	public String[] getNakshatrams() {
		String[] nakshatrams = {"Aswini","Bharani","Kruttika","Rohini","Mrugasira","Arudra","Punarvasu","Pushyami","Aslesha","Magha","Pubba",
				"Uttara","Hasta","Chitta","Swathi","Visakha","Anuradha","Jyeshta","Moola","Poorvashaadha","Uttarashaadha","Sravanam","Dhanishta",
				"Satabhisham","Poorvabhadra","Uttarabhadra","Revathi"};
		return nakshatrams;
	}
}
