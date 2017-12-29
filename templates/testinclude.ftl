<#--include不能定义别名，只能覆盖-->
<#include "include1.ftl">
<#include "include.ftl">
${age}
<#--import可以定义别名-->
<#import "include1.ftl"as c>
<#import "include.ftl"as c1>
${c.age}--${c1.age}



