package freeMarker;

import java.io.File;
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

public class TestMapFreemarker {
	public static void main(String[] args) throws IOException, TemplateException {
		Configuration cfg = new Configuration();
		//配置ftl查找目录
		cfg.setDirectoryForTemplateLoading(
		        new File("templates"));
		//设置数据的抓取模式
		cfg.setObjectWrapper(new DefaultObjectWrapper()); 
		
		Map latest = new HashMap();
		//构建数据
		latest.put("id1", "5");
		latest.put("id2", "2");
		latest.put("id3", "3");
		
		Map root = new HashMap();
		root.put("myid", latest);
		
		
		//实例化模板对象
		Template temp = cfg.getTemplate("map.ftl");
		//生成html  输出到目标
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 
	}
}
