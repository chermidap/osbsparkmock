import static spark.Spark.get;

public class Service {

    public static void main( String[] args) {
        get("/posts", (req, res) -> {
            return "Hello Sparkingly World!";
        });
    }
}
