package com.findMatch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.findMatch.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	/*@Query(value = "select * from user where age =: age",nativeQuery = true)
	public List<User> findByAgeOne(@Param("age") int age);

	@Query(value = "select * from user where age BETWEEN :fromage AND :toage",nativeQuery = true)
	public List<User> findByAge(@Param("fromage") int fromage, @Param("toage") int toage);
	
	
	@Query(value = "select * from user where age BETWEEN :fromage AND :toage AND city=:city",nativeQuery = true)
	public List<User> findByAgeAndCity(@Param("fromage") int fromage, @Param("toage") int toage,
			 @Param("city") String city);
	
	@Query(value = "select * from user where age BETWEEN :fromage AND :toage AND city=:city AND caste=:caste AND occupation=:occupation",nativeQuery = true)
	public List<User> findByAgeAndCityAndCasteANDOccupation(@Param("fromage") int fromage, @Param("toage") int toage,
			 @Param("city") String city, @Param("caste") String caste, @Param("occupation") String occupation);
	
	
	@Query(value = "select * from user where age BETWEEN :fromage AND :toage OR city=:city OR caste=:caste OR occupation=:occupation OR religion=:religion",nativeQuery = true)
	public List<User> findByAgeAndCityAndCasteANDOccupation(@Param("fromage") int fromage, @Param("toage") int toage,
			 @Param("city") String city, @Param("caste") String caste, @Param("occupation") String occupation,  @Param("religion") String religion);
	
	

	public List<User> findByCasteAndCity(String caste, String city);
	
	public List<User> findByCasteAndOccupation(String caste, String occupation);
	
	public List<User> findByCityAndOccupation(String city, String occupation);
	
	public List<User> findByReligionAndOccupation(String religion, String occupation);
	
	public List<User> findByReligionAndCity(String religion, String city);
	
	public List<User> findByReligionAndCaste(String religion, String caste);
	
	public List<User> findByAgeAndOccupation(int age, String occupation);
	
	public List<User> findByAgeAndCity(int age, String city);
	
	public List<User> findByAgeAndCaste(int age, String caste);
	
	public List<User> findByAgeAndReligion(int age, String religion);
	
	public List<User> findAllByAgeAndCasteAndOccupation(int age, String caste, String occupation);
	
	public List<User> findAllByAgeAndCityAndOccupation(int age, String city, String occupation);
	
	public List<User> findAllByAgeAndCasteAndReligion(int age, String caste, String religion);
	
	public List<User> findByReligionAndCasteAndCity(String religion, String caste, String city);
	
	public List<User> findAllByAgeAndReligionAndCity(int age, String religion, String city);
	
	
	public List<User> findAllByAgeAndReligionAndOccupation(int age, String religion, String occupation);
	
	public List<User> findByReligionAndCasteAndOccupation(String religion, String caste, String occupation);
	
	public List<User> findAllByCityAndCasteAndOccupation(String city, String caste, String occupation);
	
	public List<User> findAllByAgeAndCityAndCasteAndOccupation(int age, String city, String caste, String occupation);
	
	public List<User> findByAgeAndReligionAndCasteAndOccupation(int age, String religion, String caste, String occupation);
	
	public List<User> findByAgeAndCityAndReligionAndOccupation(int age, String religion, String city, String occupation);
	
	public List<User> findByAgeAndCityAndReligionAndCaste(int age, String religion, String city, String caste);
	
	public List<User> findByAge(int age);
	
	public List<User> findByReligion(String religion);
	
	public List<User> findByCaste(String caste);
	
	public List<User> findByCity(String city);
	
	public List<User> findByOccupation(String occupation);*/
	
	@Query(value = "select u from User u where u.age =:age or u.occupation=:occupation or u.city =:city")
	public List<User> findAllByAgeAndOccupationAndCity(@Param("age") int age,@Param("occupation") String occupation,@Param("city") String city);
	
	
}
