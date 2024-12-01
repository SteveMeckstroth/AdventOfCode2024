package fun.steveisawesome.adventofcode2024;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI defineOpenApi() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Advent Of Code 2024");

        Contact myContact = new Contact();
        myContact.setName("Steve Meckstroth");
        myContact.setEmail("meckstss@gmail.com");

        Info information = new Info()
                .title("AdventofCode.com coding challenges")
                .version("2024.12")
                .description("This API provides the resulting solutions to each of the daiy challenges.")
                .contact(myContact);
        return new OpenAPI().info(information).servers(List.of(server));
    }
}
