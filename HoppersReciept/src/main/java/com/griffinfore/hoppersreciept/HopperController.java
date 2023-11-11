package com.griffinfore.hoppersreciept;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HopperController {
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Griffin Fore";
        String itemName = "Light bulbs";
        double price = 50.75;
        String description = "Stage lights";
        String vendor = "Stage supply co.";
        
        model.addAttribute("name",name);
        model.addAttribute("itemName",itemName);
        model.addAttribute("price",price);
        model.addAttribute("description",description);
        model.addAttribute("vendor",vendor);
        
        return "index.jsp";
    }
}
