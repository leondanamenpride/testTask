package web.dvd.dao;


import web.dvd.models.Dvd;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class DvdImplement implements DvdInterface {
    private static final Logger logger = LoggerFactory.getLogger(DvdImplement.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addDvd(Dvd dvd) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(dvd);
        logger.info("DVD successfully add. more info: " + dvd);
    }

    @Override
    public void removeDvd(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Dvd dvd = (Dvd) session.load(Dvd.class, new Integer(id));

        if (dvd != null){
            session.delete(dvd);
        }
        logger.info("DVD with id: " + id + "successfully remove");

    }

    @Override
    public Dvd getByid(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Dvd dvd = (Dvd) session.load(Dvd.class, new Integer(id));
        logger.info("DVD successfully loaded. More info: " + dvd);
        return dvd;
    }

    @Override
    @SuppressWarnings("uncheked")
    public List<Dvd> listDvd() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Dvd> dvdList = session.createQuery("from Dvd").list();
        for (Dvd dvd : dvdList){
            logger.info("dvd: " + dvd);
        }
        return dvdList;
    }
}
