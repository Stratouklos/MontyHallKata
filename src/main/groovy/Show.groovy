
class Show{

    final Random random

    List<String> doors

    String selection

    def Show(long seed) {
        random = new Random(seed)
        reset()
    }

    def reset() {
        doors = ["goat", "goat", "goat"]
        hidePrize()
    }


    def pick(int door) {
        selection = doors.remove(door)
    }

    def showGoat() {
        doors.remove("goat")
    }

    def flip() {
        selection = doors.first()
    }

    def result() {
        return selection
    }

    private void hidePrize() {
        doors[random.nextInt(doors.size())] = "car"
    }
}
