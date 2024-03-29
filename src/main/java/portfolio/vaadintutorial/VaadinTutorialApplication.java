package portfolio.vaadintutorial;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Theme(value = "dochi")
public class VaadinTutorialApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(VaadinTutorialApplication.class, args);
    }

}
