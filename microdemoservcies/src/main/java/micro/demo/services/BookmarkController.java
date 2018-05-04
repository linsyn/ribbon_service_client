package micro.demo.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by linsyn on 2018/4/23.
 */
@Controller
public class BookmarkController {
    @RequestMapping("/list")
    @ResponseBody
    public String list() {
        User findOne = new User();
        return "list test";
    }
}
