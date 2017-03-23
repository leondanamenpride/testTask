package cio;

import models.Dvd;

import java.util.List;

interface DvdInterface {
    public void addDvd(Dvd dvd);
    public void removeDvd(int id);
    public Dvd getByid(int id);
    public List<Dvd> listDvd();
}
