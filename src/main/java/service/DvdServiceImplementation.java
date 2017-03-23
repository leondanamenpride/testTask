package service;

import models.Dvd;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class DvdServiceImplementation implements DvdService {
    private DvdService dvdService;

    public void setDvdService(DvdService dvdService) {
        this.dvdService = dvdService;
    }

    public void addDvd(Dvd dvd) {
        this.dvdService.addDvd(dvd);
    }

    public void removeDvd(int id) {
        this.dvdService.removeDvd(id);
    }

    public Dvd getByid(int id) {
        return this.dvdService.getByid(id);
    }

    public List<Dvd> listDvd() {
        return this.dvdService.listDvd();
    }
}
