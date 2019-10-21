package com.in28Minutes.learning.restfulWebService.restfulwebservice;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class MultipleSyncMethodsDemo {
	
	public static void main (String[] args)  {
		BillPughSingleton.getInstance();

	}
	
	
	

//	public static void main (String[] args) throws InterruptedException {
//        MultipleSyncMethodsDemo demo = new MultipleSyncMethodsDemo();
//        Thread thread1 = new Thread(() -> {
//            System.out.println("thread1 before call "+ LocalDateTime.now());
//            demo.syncMethod1("from thread1");
//            System.out.println("thread1 after call "+LocalDateTime.now());
//        });
//        Thread thread2 = new Thread(() -> {
//            System.out.println("thread2 before call "+LocalDateTime.now());
//            demo.syncMethod2("from thread2");
//            System.out.println("thread2 after call "+LocalDateTime.now());
//        });
//
//        thread1.start();
//        thread2.start();
//    }
//
//    private synchronized void syncMethod1 (String msg) {
//        System.out.println("in the syncMethod1 "+msg+" "+LocalDateTime.now());
//        try {
//            TimeUnit.SECONDS.sleep(5);
//            syncMethod2("from thread1");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private  void syncMethod2 (String msg) {
//        System.out.println("in the NonsyncMethod2 "+msg+" "+LocalDateTime.now());
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}

//class A
//{
//	static void print() 
//	{ 
//		System.out.println("print in superclass."); 
//	} 
//}
//
//class B extends A
//{
//	static void print() 
//	{ 
//		System.out.println("print in subclass."); 
//	} 
//}


//@Profile("!test")
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "au.com.myblog.dao", entityManagerFactoryRef = "secondaryMySqlEntityManager", transactionManagerRef = "secondaryTransactionManager")
//public class SecondaryMysqlDBConfiguration {
//      @Bean
//      @ConfigurationProperties(prefix = "secondary.datasource.mysql")
//       public DataSource mysqlDataSource() {
//            return DataSourceBuilder.create().build();
//       }
//      @PersistenceContext(unitName = "secondary")
//      @Bean(name = "secondaryMySqlEntityManager")
//      public LocalContainerEntityManagerFactoryBean mySqlEntityManagerFactory(EntityManagerFactoryBuilder builder) {
//           return  builder.dataSource(mysqlDataSource()).properties(jpaProperties()).persistenceUnit("secondary").packages("au.com.myblog.domain").build();
//       }
//      @Bean(name = "secondaryTransactionManager")
//       public PlatformTransactionManager transactionManager(EntityManagerFactoryBuilder builder) {
//             JpaTransactionManager tm = new JpaTransactionManager();
//             tm.setEntityManagerFactory(mySqlEntityManagerFactory(builder).getObject());
//             tm.setDataSource(mysqlDataSource());
//             return tm;
//       }
//       private Map<String, Object> jpaProperties() {
//             Map<String, Object> props = new HashMap<>();
//            // naming strategy to put underscores instead of camel case
//            // as per auto JPA Configuration
//            props.put("hibernate.ejb.naming_strategy", new SpringNamingStrategy());
//            props.put("hibernate.hbm2ddl.auto", "update");
//            return props;
//       }




class BillPughSingleton {

    private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
