package web.dvd.service;

import org.springframework.transaction.annotation.Transactional;
import web.dvd.models.Dvd;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class DvdServiceImplementation implements DvdService {
    private DvdService dvdService;

    public void setDvdService(DvdService dvdService) {
        this.dvdService = dvdService;
    }

    @Override
    @Transactional
    public void addDvd(Dvd dvd) {
        this.dvdService.addDvd(dvd);
    }

    @Override
    @Transactional
    public void removeDvd(int id) {
        this.dvdService.removeDvd(id);
    }

    @Override
    @Transactional
    public void updateDvd(Dvd dvd){
        this.dvdService.updateDvd(dvd);
    }

    @Override
    @Transactional
    public Dvd getByid(int id) {
        return this.dvdService.getByid(id);
    }

    @Override
    @Transactional
    public List<Dvd> listDvd() {
        return this.dvdService.listDvd();
    }
}
