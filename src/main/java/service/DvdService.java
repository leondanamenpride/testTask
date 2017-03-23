package service;

import models.Dvd;

import java.util.List;

public interface DvdService {
    public void addDvd(Dvd dvd);
    public void removeDvd(int id);
    public Dvd getByid(int id);
    public List<Dvd> listDvd();
}
