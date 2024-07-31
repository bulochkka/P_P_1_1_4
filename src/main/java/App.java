import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean2 = (Cat) applicationContext.getBean("cat");
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        boolean f = bean.equals(bean1);
        System.out.println(f);
        boolean v = bean2.equals(bean3);
        System.out.println(v);
    }
}