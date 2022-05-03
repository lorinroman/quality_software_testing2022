package clase;

public class AutobuzHandler extends Handler {

    public AutobuzHandler(Handler nextHandler, int prag) {
        super(nextHandler, prag);
    }

    @Override
    public void afiseazaCuCeSaMearga(int distanta) {
        if(distanta < prag){
            System.out.println("Se deplaseaza cu autobuzul.");
        }else{
            nextHandler.afiseazaCuCeSaMearga(distanta);
        }
    }

}
