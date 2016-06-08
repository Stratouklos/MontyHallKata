import spock.lang.Specification

class SimulationTest extends Specification {

    def simulation = new Simulation()

    def "Should be able to simulate a game"() {
        simulation.play(1)

        expect:
        !simulation.getResults().isEmpty()
    }

    def "Should be able to simulate multiple games"() {
        simulation.play(100)

        expect:
        simulation.getResults().size() == 100
    }

    def "Should be actually playing the game"() {
        simulation.play(100)
        def wins = simulation.results().findAll {it == "car"}

        expect:
        wins.size() > 0
        wins.size() < 100
    }

    def "Should be able to simulate flipping always"() {
        def simulation = new Simulation({it.flip()})
        simulation.play(100)

        expect:
        simulation.getResults().size() == 100
    }


}
