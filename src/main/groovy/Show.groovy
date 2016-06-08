
class Show{

    final Random random

    String[] doors

    int selection

    def Show(long seed) {
        random = new Random(seed)
        reset()
    }

    def reset() {
        doors = ["goat", "goat", "goat"]
        doors[random.nextInt(doors.size())] = "car"
    }

    def pick(int door) {
        selection = door
    }

    def result() {
        return doors[selection]
    }
}