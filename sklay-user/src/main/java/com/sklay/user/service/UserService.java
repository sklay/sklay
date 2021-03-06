package com.sklay.user.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sklay.user.model.User;
import com.sklay.user.util.UserQuery;
import com.sklay.group.model.Group;

/**
 * .
 * <p/>
 *
 * @author <a href="mailto:stormning@163.com">stormning</a>
 * @version V1.0, 2012-12-8
 */
public interface UserService {

	void regist(User user);
	
	void update(User user);
	
	boolean exist(String eamil);
	
	User getUser(Long userId);

	Page<User> pageUsers(Pageable pageable, UserQuery query);
	
	List<Group> getUserGroups(Long userId);
	
	List<Group> getUserGroups(Long userId,String biz,String owner);
	
	Map<Long,List<Group>> getUsersGroups(Set<Long> userIds);
	
	Map<Long,List<Group>> getUsersGroups(Set<Long> userIds,String biz,String owner);

	void toggleStatus(Long userId);

	List<User> recentRegist(int fetchSize);
	
	long countRealUser();
	
	User randomFakeUser();
	
	User generateFakeUser(String password);

	User findFakeUser();
	
	Map<Long,User> getUsersByIds(Set<Long> userIds);
}
