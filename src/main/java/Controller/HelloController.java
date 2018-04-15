package Controller;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        return "welcome";
    }
}
