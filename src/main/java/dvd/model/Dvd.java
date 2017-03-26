package dvd.model;

import javax.persistence.*;

@Entity
@Table(name = "DVD")
public class Dvd{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "busy")
    private boolean busy;

    @Column(name = "title")
    private String title;

    @OneToOne
    @JoinTable( name = "user",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "dvd_id"))
    private String owner;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

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

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "dvd{" +
                "id=" + id +
                ", busy=" + busy +
                ", name='" + title
                 +
                '}';
    }
}
