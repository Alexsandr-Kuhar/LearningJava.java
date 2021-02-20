package main.java.path_10;

public class Task_44 {
    public static void main(String[] args) {
        int i = 33,k=0;
        try {
            if (k == 0) {
                throw new Exception("Деление на 0");
            }
            if (k<0){
                throw new Exception("Отрицательное число");
            }
            i = i/k;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
          System.out.println("Работаем не зависимо, если что, что нибудь закрываем");
        }
    }
}
