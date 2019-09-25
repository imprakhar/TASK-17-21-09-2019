package wp.javaconfig;

import java.beans.PropertyVetoException;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "wp.javaconfig")
public class ProjectConfig {
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setSuffix(".jsp");
		vr.setPrefix("/WEB-INF/views/");
		return vr;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory= new LocalSessionFactoryBean();
		sessionFactory.setDataSource(myDataSource());
		sessionFactory.setPackagesToScan("wp.javaconfig");
		Properties props= new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");
		return sessionFactory;
	}
	
	@Bean
	public ComboPooledDataSource myDataSource() {
		ComboPooledDataSource ob= 	new ComboPooledDataSource();
		try {
			ob.setDriverClass("oracle.jdbc.driver.OracleDriver");
		}catch(PropertyVetoException e){
			e.printStackTrace();
		}
		ob.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ob.setUser("system");
		ob.setPassword("abcd1234");
		return ob;
	}
}
