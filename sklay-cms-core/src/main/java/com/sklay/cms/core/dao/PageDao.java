package com.sklay.cms.core.dao;

import java.util.List;



import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import com.sklay.cms.core.model.Page;

public interface PageDao extends JpaRepository<Page, Long> {

	@QueryHints(@QueryHint(name=org.hibernate.annotations.QueryHints.CACHEABLE,value="true"))
	Page findByAlias(String alias);

	@QueryHints(@QueryHint(name=org.hibernate.annotations.QueryHints.CACHEABLE,value="true"))
	List<Page> findAll();

	@QueryHints(@QueryHint(name=org.hibernate.annotations.QueryHints.CACHEABLE,value="true"))
	List<Page> findByParentIdAndShowOrderByRankDesc(Long parentId,boolean show);

	@Query("select p from Page p,Widget w where p.id = w.pageId and w.name=?1")
	Page findByWidgetName(String widgetName);
}
