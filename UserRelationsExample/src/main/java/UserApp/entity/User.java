package UserApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//все отлично
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    @OneToOne
    @JoinColumn(name="avatar_id")//foreign key
    private Avatar avatar;

    @ManyToMany
    @JoinTable(
            name = "user_subscriptions",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "subscription_id")
    )
    //можешь new ArrayList<> сделать по умолчанию, чтобы потом с null не ходить
    private List<Subscription> subscriptions;
    @OneToMany(mappedBy = "user")
    private List<Comment> comments;
}
