import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class weatherController {
    private RestTemplate restTemplate;
    @GetMapping()
    public String getWeather() {}
}
