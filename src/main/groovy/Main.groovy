import static Simulation.getWins

class Main {

    Simulation flipping = new Simulation({it.flip()})
    Simulation notFlipping = new Simulation({})

    static void main(String[] args) {
        int times = Integer.valueOf(args[0])
        Main main = new Main()

        main.simulate(times)
    }

    def simulate(int times) {
        flipping.play(times)
        notFlipping.play(times)

        def flippedWinCount = getWins(flipping.getResults()).size()
        def notFlippedWinCount = getWins(notFlipping.getResults()).size()

        println "We flipped and won $flippedWinCount times out of $times"
        println "We didn't flip and won $notFlippedWinCount times out of $times"

    }

}
