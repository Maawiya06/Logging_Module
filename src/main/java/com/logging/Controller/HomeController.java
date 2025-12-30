package com.logging.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/home")
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping
    public String home(@RequestParam(defaultValue = "Default Value", required = false) String value){
        logger.error("this is private API {}", value);
        logger.warn("this is private API {}", value);
        logger.info("this is private API {}", value);
        logger.debug("this is private API {}", value);
        logger.trace("this is private API {}", value);

        return "This is my controller";
    }
}
