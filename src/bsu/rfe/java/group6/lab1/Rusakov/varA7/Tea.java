package bsu.rfe.java.group6.lab1.Rusakov.varA7;

public class Tea extends Food {

    private String color;

    public Tea(String color) {
// Вызвать конструктор предка, передав ему имя класса
        super("Чай");

        this.color = color;
    }
    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " выпит");
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getColor() {
        return color;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setColor(String color) {
        this.color = color;
    }

    // Переопределѐнная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Tea)) return false; // Шаг 2
            return color.equals(((Tea)arg0).color); // Шаг 3
        } else
            return false;
    }
    // Переопределѐнная версия метода toString(), возвращающая не только
// название продукта, но и его размер
    public String toString() {
        return super.toString() + " разновидности '" + color.toUpperCase() + "'";
    }
}
