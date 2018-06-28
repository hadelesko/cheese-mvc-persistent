package org.launchcode.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by LaunchCode
 */
@Entity  // for the database declaration
public class Cheese {

    @Id
    @GeneratedValue //key value are auto generatad
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

    //
    //private String type;
    //

    @ManyToOne
    private Category category;

    @ManyToMany(mappedBy="cheeses")
    private List<Menu> menus;

    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Cheese() { } // required no argument empty constructor

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


  /*  public CheeseType getType() {
        return type;
    }

    public void setType(CheeseType category) {
        this.category = category;
    }*/

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    /**public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }*/
}
