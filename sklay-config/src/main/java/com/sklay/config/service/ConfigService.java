/**
 * Project name : sklay-config
 * File name : ConfigService.java
 * Package name : com.sklay.config.service
 * Date : 2013-11-27
 * Copyright : 2013 , sklay.COM All Rights Reserved
 * Author : stormning@163.com
 */
package com.sklay.config.service;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.sklay.config.model.Config;
import com.sklay.config.model.ConfigPK;

public interface ConfigService {

	Config findOne(ConfigPK cpk);

	<T> T findData(ConfigPK cpk, Class<T> clazz);

	@Transactional
	void save(Config config);

	@Transactional
	void save(ConfigPK cpk, Object data);

	List<Config> findAll(List<ConfigPK> cpks);

	Page<Config> findByBiz(Pageable pageable, final String biz,
			Set<Integer> status);

}
