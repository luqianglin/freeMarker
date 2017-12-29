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
		//����ftl����Ŀ¼
		cfg.setDirectoryForTemplateLoading(
		        new File("templates"));
		//�������ݵ�ץȡģʽ
		cfg.setObjectWrapper(new DefaultObjectWrapper()); 
		
		Map root = new HashMap();
		//ʵ����ģ�����
		Template temp = cfg.getTemplate("testinclude.ftl");
		//����html  �����Ŀ��
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush(); 
	}
}
