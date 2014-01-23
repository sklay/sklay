package com.sklay.user.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sklay.user.model.User;
import com.sklay.user.util.UserQuery;

public interface UserExtDao {

	Page<User> pageUsers(Pageable pageable, UserQuery query);

}
