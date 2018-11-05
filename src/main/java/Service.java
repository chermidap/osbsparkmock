import static spark.Spark.get;
import static spark.Spark.post;

public class Service {

    public static void main( String[] args) {
        get("/posts", (req, res) -> {
            return "Hello Sparkingly World!";
        });

        post("/getPrecioAbono",(request, response) -> {
            return "getPrecioAbono!";
        });
        post("/costeAltaAbono",(request, response) -> {
            return "costeAltaAbono!";
        });
        post("/preAltaAbono",(request, response) -> {
            return "preAltaAbono!";
        });
        post("/datosCompletos",(request, response) -> {
            return "datosCompletos!";
        });
    }
}
