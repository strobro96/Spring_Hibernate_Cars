package hiber.model;

import javax.persistence.*;

@Entity
@Table (name="cars")

public class Car {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "car_Id")
    private int Id;
    @Column (name = "model")
    private String model;
    @Column (name = "series")
    private int series;

    public Car() {
    }
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + Id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
