package springbootdemo.entity.domain;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Columns;

import javax.naming.Name;
import javax.persistence.*;

@ToString
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "sex")
    private Boolean sex;


}

