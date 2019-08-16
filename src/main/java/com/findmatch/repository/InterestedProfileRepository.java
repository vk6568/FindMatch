package com.findmatch.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.findmatch.entity.InterestedProfile;



public interface InterestedProfileRepository extends JpaRepository<InterestedProfile,Long> {
	@Query("select c from InterestedProfile c where c.acceptorId=:matrimonalid")
	List<InterestedProfile> findByacceptorId(@Param("matrimonalid") Long matrimonalId);



	@Query("select c from InterestedProfile c where c.requestorId=:matrimonalid")
	List<InterestedProfile> findByrequestorId(@Param("matrimonalid") Long matrimonalId);


@Modifying
@Transactional
@Query("update InterestedProfile c set c.status=:status,c.requestProcessedDate=:date where c.acceptorId=:acceptorid and c.requestorId=:requestorid")
	void update(@Param("requestorid") Long requestorId,@Param("acceptorid") Long acceptorId,@Param("status") String status,@Param("date") Date date);


@Query("select c  from InterestedProfile c  where c.acceptorId=:matrimonalid or c.requestorId=:matrimonalid")
List<InterestedProfile> findByMatrimonalId(@Param("matrimonalid")Long matrimonalId);

}
