package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @Column(length = 50, name = "first_name", nullable = false)
    private String first_name;

    @Column(length = 50, name = "last_name", nullable = false)
    private String last_name;

    @Column(length = 50, name = "email", nullable = false)
    private String email;

    @Column(length = 15, name = "phone_number", nullable = false)
    private String phone_number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number(){
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString(){
        return "Member{" +
                "id=" + id +
                ", first name='" + first_name + "\'" +
                ", last name='" + last_name + "\'" +
                ", email=" + email + "\'" +
                ", phone number=" + phone_number + "\'" +
                '}';

    }



}
