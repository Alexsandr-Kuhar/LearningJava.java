package main.java.path_8.api.Task_35;

public enum Seasons {
    WINTER("Зимма-белая,холдная,ветрянная",92),
    SPRING("Весна- зеленая,сонечная цветущая",86),
    SUMMER("Лето- жаркое, солнечное,ягодное фруктовое",93),
   AUTUMN("Осень - желтая,дождливая, пасмурная",78);
   private String description;
   private int countOfDays;

    Seasons(String description,int countOfDays) {
        this.description = description;
        this.countOfDays=countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

}
