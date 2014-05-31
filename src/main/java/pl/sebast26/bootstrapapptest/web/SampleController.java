package pl.sebast26.bootstrapapptest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sebast26.bootstrapapptest.service.SampleService;

/**
 *
 * @author Sebastian Górecki <sebast26@man.poznan.pl>
 */
@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message", sampleService.getHelloMessage());
        return "index";
    }
}
