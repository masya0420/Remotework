/*
練習問題8章1~4
基本文法~クラスとインスタンス復習
*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
	    // 聖職者インスタンス生成
	    Cleric cleric = new Cleric();
	    cleric.name = "聖職者";
	    cleric.hp -= 30;
	    
	    // 聖職者のhp全回復
	    cleric.selfAid();
	    // 聖職者のmp回復
	    cleric.pray(3);
	    
	}
}

class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP =50;
    int mp = 10;
    final int MAX_MP = 10;
    
    /*hp全回復呪文*/
    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！！");
        this.hp = this.MAX_HP;
        this.mp -= 5;
        System.out.println("HPが最大まで回復した！");
    }
    
    /*祈った秒数(sec)+0~2ポイント回復*/
    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒天に祈った！");
        
        // 回復量を乱数を用いて決定
        int recover = new Random().nextInt(3) + sec;
        
        // 実際の回復量を計算
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
        
        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した！");
        return recoverActual;
    }
}

