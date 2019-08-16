package com.findMatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.findmatch.entity.InterestedProfile;
import com.findmatch.entity.User;
import com.findmatch.repository.InterestedProfileRepository;
import com.findmatch.service.InterestedProfileService;

@RunWith(MockitoJUnitRunner.class)
public class InterestedProfileServiceMockitoTest {
@InjectMocks 
InterestedProfileService interestedProfileService;
@Mock
InterestedProfileRepository interestedProfileRepository;
@Test
public void testInterestReceived() {
	User user=new User();
	user.setMatrimonalId(244567l);
	InterestedProfile interestedProfile1=new InterestedProfile();
	interestedProfile1.setAcceptorId(123456l);
	interestedProfile1.setInterestedId(1l);
	List<InterestedProfile> interestedProfile=new ArrayList<InterestedProfile>();
	
	interestedProfile.add(interestedProfile1);
	Mockito.when(interestedProfileRepository.findByacceptorId(user.getMatrimonalId())).thenReturn(interestedProfile);
	List<InterestedProfile> interestedProfile3=interestedProfileService.interestReceived(user.getMatrimonalId());
	assertNotNull(interestedProfile3);
	assertEquals(interestedProfile.size(),interestedProfile3.size());
}
@Test
public void testInterestSent() {
	User user=new User();
	user.setMatrimonalId(244567l);
	InterestedProfile interestedProfile1=new InterestedProfile();
	interestedProfile1.setAcceptorId(123456l);
	interestedProfile1.setInterestedId(1l);
	List<InterestedProfile> interestedProfile=new ArrayList<InterestedProfile>();
	
	interestedProfile.add(interestedProfile1);
	Mockito.when(interestedProfileRepository.findByrequestorId(user.getMatrimonalId())).thenReturn(interestedProfile);
	List<InterestedProfile> interestedProfile3=interestedProfileService.interestsent(user.getMatrimonalId());
	assertNotNull(interestedProfile3);
	assertEquals(interestedProfile.size(),interestedProfile3.size());
}

}
