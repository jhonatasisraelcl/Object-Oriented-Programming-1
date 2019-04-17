public class Relogio {
    private int segundos;
    private int minutos;
    private int horas;
    public Relogio ()
    {
        segundos = 0;
        minutos = 0;
        horas = 0;
    }

    public void addSegundo()
    {
        segundos++;
        if (segundos == 60)
        {
            segundos=0;
            this.addMinuto();
        }
    }

    public void addMinuto()
    {
        minutos++;
        if (minutos == 60)
        {
            minutos=0;
            this.addHora();
        }
    }

    public void addHora()
    {
        horas++;
    }

    public void comecar()
    {

        while (true)
        {
            //dorme um segundo
            try {Thread.sleep(1000);} 
            catch (InterruptedException e) {}
            //adiciona um segundo ao contador
            this.addSegundo();
            //imprime a hora
            System.out.println(horas+":"+minutos+":"+segundos);			
        }
    }

    public static void main (String[] args)
    {
        (new Relogio()).comecar();
    }
}