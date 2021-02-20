package main.java.path_8.api.Task_37;

public enum Seasons {
    WINTER("Зимма-белая,холдная,ветрянная", 92),
    SPRING("Весна- зеленая,сонечная цветущая", 86),
    SUMMER("Лето- жаркое, солнечное,ягодное фруктовое", 93),
    AUTUMN("Осень - желтая,дождливая, пасмурная", 78);
    private String description;
    private int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }
    public String Out(String s) {
        switch (Seasons.valueOf(s)) {
            case WINTER:
                System.out.println(WINTER.countOfDays);
                break;
            case AUTUMN:
                System.out.println(AUTUMN.countOfDays);
                break;
            case SPRING:
                System.out.println(SPRING.countOfDays);
                break;
            case SUMMER:
                System.out.println(SUMMER.countOfDays);
                break;
        }
        return s;
    }
}