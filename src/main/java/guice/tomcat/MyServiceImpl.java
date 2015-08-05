package guice.tomcat;

public class MyServiceImpl implements MyService {
    @Override
    public String hello(String name) {
        return "Hello, " + name;
    }
}
