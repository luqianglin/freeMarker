package freeMarker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class TestFreemarker {
	public static void main(String[] args) throws IOException, TemplateException {
		
		Configuration cfg = new Configuration();
		//配置ftl查找目录
		cfg.setDirectoryForTemplateLoading(
		        new File("templates"));
		//设置数据的抓取模式
		cfg.setObjectWrapper(new DefaultObjectWrapper()); 
		
		Map latest = new HashMap();
		//构建数据
		latest.put("url", "products/greenmouse.html");
		latest.put("name", "green mouse"); 
		Map root = new HashMap();
		root.put("latestProduct", latest);
		root.put("user", "Big Joe");
		root.put("sex", "1");
		String [] str = new String[]{"1","2","3","4","5"};
		root.put("arr", str);
		
		List list = new ArrayList<>();
		User user = new User();
		user.setId("1");
		user.setName("wangwu");
		list.add(user);
		
		User user1 = new User();
		user1.setId("2");
		user1.setName("xiaohong");
		list.add(user1);
		root.put("userList", list);
		
		
		//实例化模板对象
		Template temp = cfg.getTemplate("helloworld.ftl");
		FileOutputStream fos = new FileOutputStream("F:\\html\\hello.html");
		//生成html  输出到目标
		Writer out = new OutputStreamWriter(fos);
		temp.process(root, out);
		out.flush(); 
	}
}
