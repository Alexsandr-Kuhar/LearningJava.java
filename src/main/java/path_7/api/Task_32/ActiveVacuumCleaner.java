package main.java.path_7.api.Task_32;

public class ActiveVacuumCleaner extends WhiteGoods implements VacuumCleaner {
    public ActiveVacuumCleaner(int width,int height, int  lenght)
    {
        this.width=width;
        this.height=height;
        this.lenght=lenght;
    }
    @Override
    public void ReplaceBag() {
    if (this.status=false)
    {
        System.out.println("Меням мешок");
    }
      else {System.out.println("Немогу поменять мешок - выключи пылесос");}
    }

    @Override
    public void on() {
        System.out.println("Пылесос вкл");
    }

    @Override
    public void off() {
        System.out.println("Пылесос выкл");
    }

    @Override
    public void Output() {
        System.out.println(width+height+lenght);
    }
}
