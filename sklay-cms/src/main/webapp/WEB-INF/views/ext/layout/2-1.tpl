<div class="row-fluid">
	<div class="column span8" id="row0">
		<#if containerMap['row0']?exists>
			<#list containerMap['row0'] as w>
				${w.content}
			</#list>
		</#if>
	</div>
	<div class="column span4" id="row1">
		<#if containerMap['row1']?exists>
			<#list containerMap['row1'] as w>
				${w.content}
			</#list>
		</#if>
	</div>
</div>