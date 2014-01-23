package com.sklay.group.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sklay.group.model.GroupAccess;

public interface GroupAccessDao extends JpaRepository<GroupAccess, Long> {

	List<GroupAccess> findByGroupId(Long groupId);

}
