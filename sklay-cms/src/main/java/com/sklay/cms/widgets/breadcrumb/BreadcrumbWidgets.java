package com.sklay.cms.widgets.breadcrumb;

import com.sklay.cms.core.annotation.Widget;
import com.sklay.cms.core.annotation.Widgets;


@Widgets(value = "breadcrumb")
public class BreadcrumbWidgets {

	@Widget
	public String line() {
		return "line.tpl";
	}
}
