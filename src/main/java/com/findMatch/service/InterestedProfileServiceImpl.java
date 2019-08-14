package com.findMatch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findMatch.entity.InterestedProfile;
import com.findMatch.repository.InterestedProfileRepository;

@Service
public class InterestedProfileServiceImpl implements InterestedProfileService {
	@Autowired
	InterestedProfileRepository interestedProfileRepository;

	/*
	 * @Override public String acceptedOrRejected(long requestedId, long
	 * accepectedId, String status) { List <InterestedProfile>
	 * interestedP=interestedProfileRepository.findByAccepectorIdAndRequestorId(
	 * requestedId, accepectedId); InterestedProfile ip=new InterestedProfile();
	 * ip.setStatus(status); interestedProfileRepository.save(ip); return
	 * "accepted Successfully";
	 * 
	 * }
	 */
}
