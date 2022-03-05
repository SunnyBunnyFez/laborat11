package bsu.rfe.java.group6.lab1.Rusakov.varA7;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];

// Анализ аргументов командной строки и создание для них
// экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else
            if (parts[0].equals("Tea")) {
// У чая – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Tea(parts[1]);
            } else
            if (parts[0].equals("IceCream"))
                breakfast[itemsSoFar] = new IceCream(parts[1]);
// ... Продолжается анализ других продуктов для завтрака
            itemsSoFar++;
        }
// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
                break;

        printFoods(breakfast);
        System.out.println("Всего хорошего!");
    }

    static Integer countFoods(Food[] breakfast, Food food) {
        Integer count = 0;
        for(int i = 0; i < breakfast.length; i++) {
            if(food.equals(breakfast[i]))
            {
                count++;
            }
        }
        return count;
    }

    static void printFoods(Food[] food) {
        int c = 0;
        int p = 0;
        int s = 0;
        int jkl = 0;
        for (int i = 0; i < food.length; i++) {
            if (food[i] instanceof Apple) {
                s++;
            } else if (food[i] instanceof Cheese) {
                c++;
            } else if (food[i] instanceof Tea) {
                p++;
            } else if (food[i] instanceof IceCream){
                jkl++;
            }
        }
        System.out.println("ЯБЛОКО - " + s);
        System.out.println("CЫР - " + c);
        System.out.println("ЧАЙ - " + p);
        System.out.println("Мороженное - " + jkl);

    }

}

