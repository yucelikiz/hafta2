public class Game {
    Boxer b1;
    Boxer b2;
    int minWeight;
    int maxWeight;

    Game(Boxer b1, Boxer b2,int minWeight, int maxWeight) {
        this.b1 = b1;
        this.b2 = b2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    //%50 ihtimali bu metotla veriyoruz, sayı 50'nin üzerinde olduğunda "true", altında olursa false olacak.
    boolean firstFist(){
        double randomStarter = Math.random()*100;
        return randomStarter > 50;
    }

    public void execute() {
        if (isCheck()) {
            while (this.b1.health > 0 && this.b2.health >0) {
                System.out.println("======YENİ ROUND======");

                //Değişken true ise b2, değilse b1 oyuna başlayacak.
                if (firstFist()) {
                    this.b2.health = this.b1.hit(this.b2);
                    if (isWin()) {
                        break;
                    }
                }  else {

                    this.b1.health = this.b2.hit(this.b1);
                    if (isWin()) {
                        break;
                    }
                }
                System.out.println(this.b1.name+ " Sağlık :"+ this.b1.health);
                System.out.println(this.b2.name+ " Sağlık :"+ this.b2.health);
            }
        }else {
            System.out.println("Sporcuların sikletleri uygun değildir!");
        }
    }
    boolean isCheck() {
        return (this.b1.weight >= minWeight && this.b1.weight <= maxWeight) && (this.b2.weight >= minWeight && this.b2.weight <= maxWeight);
    }

    boolean isWin () {
        if (this.b1.health == 0){
            System.out.println(b2.name+" kazandı!");
            return true;
        }

        if (this.b2.health == 0){
            System.out.println(b1.name+" kazandı!");
        }
        return false;
    }
}
