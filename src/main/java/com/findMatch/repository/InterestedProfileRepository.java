package com.findMatch.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.findMatch.entity.InterestedProfile;

@Repository
public interface InterestedProfileRepository extends JpaRepository<InterestedProfile, Long> {

//	List<InterestedProfile> findByAccepectorIdAndRequestorId(Long acceptor,Long rejector);
}
