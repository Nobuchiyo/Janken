import java.util.Scanner;
import java.util.Random;

public class Janken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] hands = {"グー", "チョキ", "パー"};

        System.out.println("じゃんけんゲームを始めます。");
        System.out.println("1: グー、2: チョキ、3: パー のいずれかの番号を入力してください。");

        int userHandIndex = scanner.nextInt() - 1; // ユーザーの入力を1減らすことで、配列のインデックスと一致させる

        if (userHandIndex < 0 || userHandIndex > 2) {
            System.out.println("入力が正しくありません。");
            return;
        }

        String userHand = hands[userHandIndex];
        System.out.println("あなたの手: " + userHand);

        int computerHandIndex = random.nextInt(3);
        String computerHand = hands[computerHandIndex];
        System.out.println("コンピュータの手: " + computerHand);

        if (userHandIndex == computerHandIndex) {
            System.out.println("あいこです。");
        } else if ((userHandIndex + 1) % 3 == computerHandIndex) {
            System.out.println("あなたの勝ちです！");
        } else {
            System.out.println("あなたの負けです...");
        }
    }
}
