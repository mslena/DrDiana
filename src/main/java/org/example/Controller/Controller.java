package org.example.Controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.example.Service.PriceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@AllArgsConstructor
public class Controller {

    private final PriceService priceService;

    @GetMapping("/price")
    public ModelAndView price(@PathParam(value = "ID") String ID) {
        if (ID == null) {
            ID = "1";
        }
        return new ModelAndView("price").addObject("price", priceService.getPriceForID(ID));
    }

    @GetMapping("/about")
    public ModelAndView about() {
        return new ModelAndView("about");
    }

    @GetMapping("/contact")
    public ModelAndView contact() {
        return new ModelAndView("contact");
    }

    @GetMapping("/lol")
    public ModelAndView lol() {
        return new ModelAndView("lol");
    }
}
