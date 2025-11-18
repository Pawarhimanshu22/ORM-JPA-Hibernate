package org.example;


import javax.persistence.*;

@Entity
@Table(name = "pokemon_name_table")
public class Pokemon {


    // @Column always not mendetory to Write Because JPA is smart they Automatically detect that this should be a coloum
    @Column(name = "Pokemon_Name")
    @Id
    private String name ;

    @Column(nullable = false)
    private String type ;

    @Column
    private int power ;

//    private  String color;
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }


    @Enumerated(EnumType.STRING)
    private  Color color;


    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    /**

    Encapsulation

    private int age;
    public int getAge()
    {
        try
        {
            if (age < 0)
            {
                throw  new Exception("Not Vailid Age");
            }
            return age;
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }

    }

    public void setAge(int age) {
        this.age = age;
    }

**/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString()
{
    return this.getName() + " " + this.getType() + " " + this.getPower();
}


}
