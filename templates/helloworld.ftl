<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${user?default('')}!</h1>
  <p>Our latest product:
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
  
  我的性别是:
  <#--if判断   键等于值，然后输出-->
  <#if sex='2'>
  	男
  <#else>
  	女
  </#if>
  <br/>
  <#--list循环标记 数组或者集合as 临时变量
  	临时变量_index 获取当前的索引从0开始
  	break 标记用于突出循环
  -->
  输出结果:
  <#--for循环  先把集合放在前面 ,然后再 as 变量名 最后输出-->
  <#list arr as temp>
  	<#if temp_index=2>
  		<#break>
  	</#if>
  	<#if (temp_index+1)%2==0>
  		<font color=green>${temp}---${temp_index+1}</font><br/>
  	<#else>
  		<font color=yellow>${temp}---${temp_index+1}</font><br/>
  	</#if>
  </#list>
 输出集合list
 	<#list userList as userTmp>
 		${userTmp.id}---${userTmp.name}
 	</#list>
 <#--jsp和模板引擎的根本不同之处-->
</body>
</html> 