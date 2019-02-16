package xmlstrategy;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class test {

	public static void main(String[] args) {
		
    	Member m_simple = new Member();
		m_simple.setName("hadi0");
		m_simple.setFamily("rahjoo0");
		System.out.println(m_simple.toString());
		
		
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Member m1 = (Member) factory.getBean("memberid");
		
		m1.setName("hadi1");
		m1.setFamily("rahjoo1");
		System.out.println(m1.toString());
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext ("spring.xml");
		Member m2 = (Member) ctx.getBean("memberid");
		
		m2.setName("hadi2");
		m2.setFamily("rahjoo2");
		System.out.println(m2.toString());

	}

}
