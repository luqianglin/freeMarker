<#macro mymacro p1 p2>
�����:${p1*p2}
</#macro>
<@mymacro p1=100 p2=2/>
<@mymacro p1=10 p2=10/>

<#assign str=" welcome how are you " >
${str?length}
---${str?trim}---
${str?upper_case}
${str?lower_case}
${userList?size}
<#if ab?exists><#--�жϱ����Ƿ����-->
${ab}
</#if>

<#--�������-->  
<#assign id=1 name='zs' sex='boy' ifSuc=true>  