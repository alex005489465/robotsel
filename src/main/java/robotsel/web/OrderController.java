package robotsel.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import robotsel.Orderprocess;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@GetMapping
    public String OrderControl() {
        return "order";
    }
	
	@PostMapping
	public String Processinput(@RequestParam String name, @RequestParam String number) {
		
		Orderprocess qq = new Orderprocess();
		
		qq.datasave(name, number);		
		
		return "redirect:/";
	}
}
