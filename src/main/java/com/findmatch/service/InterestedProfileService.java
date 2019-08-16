package com.findmatch.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.findmatch.entity.InterestedProfile;
import com.findmatch.repository.InterestedProfileRepository;
@Service
public class InterestedProfileService {
	
	@Autowired
	InterestedProfileRepository interestedProfileRepository;
	public 	InterestedProfile sendRequest(Long requestorId,Long acceptorId) {
		String status="pending";
	
		InterestedProfile interestedProfile =new InterestedProfile();
		interestedProfile.setRequestorId(requestorId);
		interestedProfile.setAcceptorId(acceptorId);
		interestedProfile.setRequestDate(new Date());
		interestedProfile.setStatus(status);
		return interestedProfileRepository.save(interestedProfile);		
		
	}
	public List<InterestedProfile> interestReceived(Long matrimonalId) {
		return interestedProfileRepository.findByacceptorId(matrimonalId);
		
	}
	public List<InterestedProfile> interestsent(Long matrimonalId) {
		
		return interestedProfileRepository.findByrequestorId(matrimonalId);
		
	} 
	public void approval(Long requestorId,Long acceptorId,String status) {
		interestedProfileRepository.update(requestorId,acceptorId,status,new Date());
	}
	public List<InterestedProfile> getall(Long matrimonalId) {
		return interestedProfileRepository.findByMatrimonalId(matrimonalId);
	
			}

}
