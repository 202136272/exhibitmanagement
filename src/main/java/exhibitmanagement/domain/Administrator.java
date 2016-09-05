package exhibitmanagement.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Bonga on 4/2/2016.
 */
@Entity
@Table(name = "administrator")
public class Administrator implements Serializable {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="PERSAL_NUMBER")
    private  String persalNumber;
    @Column(name="NAME")
    private  String name;
    @Column(name="SURNAME")
    private String surname;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPersalNumber() {
        return persalNumber;
    }

    public Administrator()
    {

    }

    public Administrator(Builder builder) {
        id = builder.id;
        name = builder.name;
        surname = builder.surname;
        persalNumber = builder.persalNumber;

    }
    public static class Builder {
        //Equivalent to setters
        private long id;
        private String name;
        private String surname;
        private String persalNumber;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name; //compulsary
            return this;
        }
        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder persalNumber(String persalNumber) {
            this.persalNumber = persalNumber;
            return this;
        }

        public Builder copy(Administrator administrator){
            this.id = administrator.getId();
            this.name = administrator.getName();
            this.surname = administrator.getSurname();
            this.persalNumber = administrator.getPersalNumber();

            return this;
        }
        public Administrator build() {
            return new Administrator(this);
        }
    }

    public String toString()
    {
        return String.format("Id : %d\nName :%s\nSurname :%s\nPersalNumber :%s",id,name,surname,persalNumber);
    }
}
