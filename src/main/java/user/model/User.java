package user.model;



import dvd.model.Dvd;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="USER")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String userName;

    @Column(name = "password")
    private String userPassword;

    private Set<Dvd> dvdSet;

    //Get&Set DvdSeter
    @OneToMany
    public void setDvdSet(Set<Dvd> dvdSet) {
        this.dvdSet = dvdSet;
    }
    public Set<Dvd> getDvdSet() {
        return dvdSet;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserPassword() {
        return userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
