package cdcipipeline;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@ResponseBody
@RequiredArgsConstructor
@RequestMapping("/")
public class TestController {

    @GetMapping
    public String imHealthy(){
        return "Im healthy";
    }
}