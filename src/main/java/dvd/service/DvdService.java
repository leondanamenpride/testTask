package dvd.service;

import dvd.model.Dvd;

import java.util.List;

public interface DvdService {
     void addDvd(Dvd dvd);
     void removeDvd(int id);
     void updateDvd(Dvd dvd);
     Dvd getDvdById(int id);
     List<Dvd> listDvd();
}
