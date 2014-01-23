package com.sklay.cms.widgets.content;

import com.sklay.cms.core.annotation.Setting;
import com.sklay.cms.core.annotation.Widget;
import com.sklay.cms.core.annotation.Widgets;
import com.sklay.cms.core.enums.InputType;

@Widgets("content")
public class ContentWidgets {

	@Widget(settings={@Setting(key="content",value="",name="内容",inputType=InputType.TEXTAREA)})
	public String simple(){
		return "simple.tpl";
	}
}
