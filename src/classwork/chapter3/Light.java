package classwork.chapter3;

public class Light {
    public static void main(String[] args) {
//        lightspeed это скорость света
        int lightspeed = 186000;
        long days = 1000;
        long seconds;
        long distance;
        // приблизительная скорость света, миль в секунду
        seconds = days * 24 * 60 * 60;
// преобразовать в секунды
        distance = lightspeed * seconds;
// вычислить расстояние
        System.out.println("Зa " + days + " " + " дней свет пройдет около " + " " + distance + "миль.");


    }
}
