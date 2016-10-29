package com.brightworks.sg.ims.entities.model.order;

import com.brightworks.sg.ims.entities.model.user.User;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kyel on 10/25/2016.
 */
@Entity
@Table(name = "CARTS")
public class Cart {

    @Id
    private Long id;

    @OneToOne
    private User user;

    @Enumerated
    private State state;

    @OneToMany
    private List<CartItem> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }
}
