package study.projects.exemgenerator.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class ApplicationUser extends AbstractEntity {

    @NotEmpty(message = "The username can't be empty")
    @Column(unique = true)
    private String username;

    @NotEmpty(message = "The password can't be empty")
    private String password;

    @OneToOne
    private Professor professor;
}
