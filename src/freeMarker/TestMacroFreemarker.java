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

public class TestMacroFreemarker {
	public static void main(String[] args) throws TemplateException, IOException {
		Configuration cfg = new Configuration();
		//����ftl����Ŀ¼
		cfg.setDirectoryForTemplateLoading(
		        new File("templates"));
		//�������ݵ�ץȡģʽ
		cfg.setObjectWrapper(new DefaultObjectWrapper()); 
		
		Map root = new HashMap();
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
				
		
		
		//ʵ����ģ�����
		Template temp = cfg.getTemplate("macro.ftl");
		//����html  �����Ŀ��
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 
	}
}
