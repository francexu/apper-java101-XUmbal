public class TopicInterface {
    private static Blueberry blueberry = new Blueberry();

    public static void main(String[] args) {
        if (blueberry instanceof  Cake) {
            blueberry.slice();
        }
    }
}
