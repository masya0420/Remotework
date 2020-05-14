/*
練習問題15章1~2
例外処理対応
*/
public class Main {
	public static void main(String[] args) {
	    try {
		    String s = null;
		    // ヌルポ
		    System.out.println(s.length());
	    } catch(NullPointerException e) {
	        System.out.println("NullPointerException例外をキャッチ");
	        System.out.println("--スタックトレース--");
	        e.printStackTrace();
	        System.out.println("--スタックトレースここまで--");
	    }
	}
}
