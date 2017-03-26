package dvd.service;

import org.springframework.transaction.annotation.Transactional;
import dvd.model.Dvd;
import org.springframework.stereotype.Service;
import java.util.List;
import dvd.dao.*;


@Service
public class DvdServiceImplementation implements DvdService {
    private DvdInterface dvdInterface ;

    public void setDvdInterface(DvdInterface dvdInterface) {
        this.dvdInterface = dvdInterface;
    }

    @Override
    @Transactional
    public void addDvd(Dvd dvd) {
        this.dvdInterface.addDvd(dvd);
    }

    @Override
    @Transactional
    public void removeDvd(int id) {
        this.dvdInterface.removeDvd(id);
    }

    @Override
    @Transactional
    public void updateDvd(Dvd dvd){
        this.dvdInterface.updateDvd(dvd);
    }

    @Override
    @Transactional
    public Dvd getDvdById(int id) {
        return this.dvdInterface.getDvdByid(id);
    }

    @Override
    @Transactional
    public List<Dvd> listDvd() {
        return this.dvdInterface.listDvd();
    }
}
