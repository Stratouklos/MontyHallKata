import spock.lang.*

class ShowSpec extends Specification {

    def show = new Show(42)

    def "the game show should be arranging the prizes randomly" () {
        show.pick(2)
        def previous = show.result()
        show.reset()
        show.pick(2)

        expect:
        show.result() != previous
    }

    def "the player should be allowed to pick the game" () {
        show.pick(1)

        expect:
        show.result() == "goat"
    }

    def "the player should be able to win the game" () {
        show.pick(2)

        expect:
        show.result() == "car"
    }

    def "The player should be able to switch doors"() {
        show.pick(1)
        show.showGoat()
        show.flip()

        expect:
        show.result() == "car"
    }
}