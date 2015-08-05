package guice.tomcat;

import com.google.inject.Module;
import com.google.inject.servlet.ServletModule;
import com.squarespace.jersey2.guice.JerseyGuiceServletContextListener;

import java.util.Collections;
import java.util.List;

public class MyJerseyGuiceServletContextListener extends JerseyGuiceServletContextListener {
    @Override
    protected List<? extends Module> modules() {
        return Collections.singletonList(new ServletModule() {
            @Override
            protected void configureServlets() {
                bind(MyService.class).to(MyServiceImpl.class);
            }
        });
    }
}
