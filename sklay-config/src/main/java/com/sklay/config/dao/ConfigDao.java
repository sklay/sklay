/**
 * Project name : sklay-config
 * File name : ConfigDao.java
 * Package name : com.sklay.config.dao
 * Date : 2013-11-27
 * Copyright : 2013 , sklay.COM All Rights Reserved
 * Author : stormning@163.com
 */
package com.sklay.config.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sklay.config.model.Config;
import com.sklay.config.model.ConfigPK;


public interface ConfigDao extends JpaRepository<Config, ConfigPK>,JpaSpecificationExecutor<Config> {

	
}
