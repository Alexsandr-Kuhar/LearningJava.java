package main.java.path_7.api.Task_32;

public class ActiveFridge extends WhiteGoods implements Fridge  {
    public ActiveFridge(int width, int height, int  lenght)
    {
        this.width=width;
        this.height=height;
        this.lenght=lenght;
    }

    @Override
    public void on() {
        System.out.println("Вкл холодильник");
        this.status=true;
    }

    @Override
    public void off() {
       System.out.println("Выкл холодильник");
        this.status=false;
    }

    @Override
    public void Output() { System.out.println(width+height+lenght);
    }

    @Override
    public void Freeze() {
        if (status)
        { System.out.println("Марозим");}
        else{System.out.println("Не Марозим");}
    }

}
