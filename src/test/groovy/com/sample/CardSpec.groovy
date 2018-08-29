import com.sample.Card
import spock.lang.Specification

class CardSpec extends Specification {

    private Card instance;

    def "スートが設定した値であること"(){
        setup:
        def card = new Card("♠", "3");

        expect:
        card.getSuit() == suit

        where:
        card                | suit
        new Card("♠", "3") | "♠"
        new Card("♥", "J") | "♥"

    }
}