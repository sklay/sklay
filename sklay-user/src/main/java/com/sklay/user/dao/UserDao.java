package com.sklay.user.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.QueryHint;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import com.sklay.user.model.User;

/**
 * .
 * <p/>
 * 
 * @author <a href="mailto:stormning@163.com">stormning</a>
 * @version V1.0, 2012-12-7
 */
public interface UserDao extends JpaRepository<User, Long> {

	/**
	 * @param email
	 * @return
	 */
	@QueryHints({ @QueryHint(name = org.hibernate.annotations.QueryHints.CACHEABLE, value = "true") })
	User findByEmail(String email);

	@Query("select count(u) from User u where u.email=?1")
	@QueryHints(@QueryHint(name = org.hibernate.annotations.QueryHints.CACHEABLE, value = "true"))
	long countByEmail(String eamil);

	@Query("select u from User u")
	List<User> listUsers(Pageable pageable);

	@Query("select u from User u order by u.createAt desc")
	List<User> findAllOrderByCreateAt(Pageable olr);

	/**
	 * @param fake
	 * @return
	 */
	@Query("select count(u) from User u where u.fake=?1")
	@QueryHints({ @QueryHint(name = org.hibernate.annotations.QueryHints.CACHEABLE, value = "true") })
	long countByFake(boolean fake);

	@Query("select u from User u where u.fake=?1")
	@QueryHints({ @QueryHint(name = org.hibernate.annotations.QueryHints.CACHEABLE, value = "true") })
	Page<User> findByFake(Pageable pageable, boolean fake);

	/**
	 * @param userIds
	 * @return
	 */
	List<User> findByIdIn(Set<Long> userIds);
}
