/**
 * Project name : sklay-tag
 * File name : TagServiceImpl.java
 * Package name : com.sklay.tag.service.impl
 * Date : 2013-11-27
 * Copyright : 2013 , sklay.COM All Rights Reserved
 * Author : stormning@163.com
 */
package com.sklay.tag.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sklay.tag.dao.TagDao;
import com.sklay.tag.model.Tag;
import com.sklay.tag.service.TagService;

@Service
public class TagServiceImpl implements TagService {

	@Autowired
	private TagDao tagDao;
	
	@Override
	public List<Tag> listOrderByUsed(int fetchSize) {
		Pageable pageable = new PageRequest(0, fetchSize);
		return tagDao.listTags(pageable);
	}

	@Override
	public Page<Tag> findAll(Pageable pageable) {
		return tagDao.findAll(pageable);
	}

	@Override
	public void save(Tag tag) {
		tagDao.save(tag);
	}

	@Override
	public Tag findOne(Long id) {
		return tagDao.findOne(id);
	}

}
