package az.iktlab.si.iktlabspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person", schema = "iktlab_default")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "clmn_name",
            unique = true,
            nullable = false)
    private String name;

    @Column(name = "clmn_surname",
    nullable = true)
    private String surname;

    @Column(name = "clmn_age", nullable = false)
    private int age;
}
