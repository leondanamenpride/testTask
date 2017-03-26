package dvd.dao;

import dvd.model.Dvd;

import java.util.List;

public interface DvdInterface {
     void addDvd(Dvd dvd);
     void updateDvd(Dvd dvd);
     void removeDvd(int id);
     Dvd getDvdByid(int id);
     List<Dvd> listDvd();
}
