import java.util.Random;

public class JankenHand {
    int hand;
    public JankenHand(int hand) {
        assert 0 <= hand && hand < 3 : "Invalid Hand specification";
        this.hand = hand;
    }
    public JankenHand() {
        Random rand = new Random();
        this.hand = rand.next(3);
    }
    public String toString() {
        switch (hand) {
        case 0:
            return "ぐー";
        case 1:
            return "ちょき";
        case 2:
            return "ぱー";
        }
    }
    public int compareTo(JankenHand other) {
        int a = this.hand;
        int b = other.hand;
        if (a == b) {
            return 0;
        } else if (a == 0 && b == 1 || a == 1 && b == 2 || a == 2 && b == 0) {
            return -1;
        } else {
            return 1;
        }
    }
}