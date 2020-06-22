package org.wecancodeit.librarydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.librarydemo.repositories.ActorRepository;

import javax.annotation.Resource;

@Controller
public class ActorController {

    @Resource
    private ActorRepository actorRepo;

    @RequestMapping("/actors")
    public String displayCampuses(Model model){
        model.addAttribute("actors", actorRepo.findAll());
        return "actorsView";
    }
}
