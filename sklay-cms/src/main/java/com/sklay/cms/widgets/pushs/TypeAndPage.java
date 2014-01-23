package com.sklay.cms.widgets.pushs;

import com.sklay.cms.core.model.Page;
import com.sklay.group.model.Group;

public class TypeAndPage {

	private Group type;
	private Page page;
	private Page detailPage;

	public Group getType() {
		return type;
	}

	public void setType(Group type) {
		this.type = type;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Page getDetailPage() {
		return detailPage;
	}

	public void setDetailPage(Page detailPage) {
		this.detailPage = detailPage;
	}

	@Override
	public String toString() {
		return "TypeAndPage [type=" + type + ", page=" + page + ", detailPage="
				+ detailPage + "]";
	}
}
