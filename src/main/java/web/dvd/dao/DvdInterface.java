package web.dvd.dao;

import web.dvd.models.Dvd;

import java.util.List;

interface DvdInterface {
    public void addDvd(Dvd dvd);
    public void removeDvd(int id);
    public void updateDvd(Dvd dvd);
    public Dvd getByid(int id);
    public List<Dvd> listDvd();
}
