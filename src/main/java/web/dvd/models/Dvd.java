package web.dvd.models;

import javax.persistence.*;


@Entity
@Table(name = "DVD")
public class Dvd{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "busy")
    private boolean busy;

    @Column(name = "name")
    private String name;

    @Column(name = "autor")
    private String autor;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "dvd{" +
                "id=" + id +
                ", busy=" + busy +
                ", name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
