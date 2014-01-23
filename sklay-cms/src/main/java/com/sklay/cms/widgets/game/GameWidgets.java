package com.sklay.cms.widgets.game;

import com.sklay.cms.core.annotation.Widget;
import com.sklay.cms.core.annotation.Widgets;

@Widgets("game")
public class GameWidgets {

	@Widget
	public String chess() {
		return "chess.tpl";
	}
	
}
