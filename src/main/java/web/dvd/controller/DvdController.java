package web.dvd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.dvd.models.Dvd;
import web.dvd.service.DvdService;

@Controller
public class DvdController {
    private DvdService dvdService;

    @Autowired(required = true)
    @Qualifier(value = "dvdService")
    public void setDvdService(DvdService dvdService) {
        this.dvdService = dvdService;
    }

    @RequestMapping(value = "dvds",method = RequestMethod.GET)
    public String listDvds(Model model){
            model.addAttribute("dvd",new Dvd());
            model.addAttribute("listDvds", this.dvdService.listDvd());
        return "books"
    }

    @RequestMapping(value = "dvds/add", method = RequestMethod.POST)
    public String addDvd(@ModelAttribute("dvd") Dvd dvd){
        if (dvd.getId()==0){
            this.dvdService.addDvd(dvd);
        }
        else {
            this.dvdService.update
        }
    }
}
