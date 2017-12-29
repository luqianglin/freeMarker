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

public class TestIncludeFreemarker {
	public static void main(String[] args) throws IOException, TemplateException {
		Configuration cfg = new Configuration();
		//配置ftl查找目录
		cfg.setDirectoryForTemplateLoading(
		        new File("templates"));
		//设置数据的抓取模式
		cfg.setObjectWrapper(new DefaultObjectWrapper()); 
		
		Map root = new HashMap();
		//实例化模板对象
		Template temp = cfg.getTemplate("testinclude.ftl");
		//生成html  输出到目标
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 
	}
}
