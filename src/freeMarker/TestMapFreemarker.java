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
		//����ftl����Ŀ¼
		cfg.setDirectoryForTemplateLoading(
		        new File("templates"));
		//�������ݵ�ץȡģʽ
		cfg.setObjectWrapper(new DefaultObjectWrapper()); 
		
		Map latest = new HashMap();
		//��������
		latest.put("id1", "5");
		latest.put("id2", "2");
		latest.put("id3", "3");
		
		Map root = new HashMap();
		root.put("myid", latest);
		
		
		//ʵ����ģ�����
		Template temp = cfg.getTemplate("map.ftl");
		//����html  �����Ŀ��
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 
	}
}
