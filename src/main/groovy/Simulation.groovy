class Simulation {

    List<String> results = []

    def show = new Show(33l)

    def random = new Random()

    def action = {}

    def Simulation(){}

    def Simulation(Closure action) {
        this.action = action
    }

    def play(int iterations) {
        for (int i in 1..iterations) {
            show.pick(random.nextInt(3))
            show.showGoat()
            action(show)
            results.add(show.result())
            show.reset()
        }
    }

    def results() {
        return results
    }

    static List<String> getWins(List<String> results) {
        return results.findAll({it == "car"})
    }

}
