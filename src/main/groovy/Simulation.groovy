class Simulation {

    List<String> results = []

    def show = new Show(33l)

    def random = new Random()

    def action = {}

    def Simulation(){}

    def Simulation(Closure action) {
        this.action = action
    }

    def play(int times) {
        for (int i in 1..times) {
            show.pick(random.nextInt(3))
            results.add(show.result())
            action(show)
            show.reset()
        }
    }

    def results() {
        return results
    }

}
