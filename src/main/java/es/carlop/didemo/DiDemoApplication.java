package es.carlop.didemo;

import es.carlop.didemo.controllers.ConstructorInjectedController;
import es.carlop.didemo.controllers.MyController;
import es.carlop.didemo.controllers.PropertyInjectedController;
import es.carlop.didemo.controllers.SetterInjectedController;
import es.carlop.didemo.examplebeans.FakeDataSource;
import es.carlop.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController)ctx.getBean("myController");

//        System.out.println(controller.hello());
//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getUsersername());
    }
}
