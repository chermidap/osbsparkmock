package json;

import spark.ResponseTransformer;
import utils.ParserToJson;

public class JsonTransformer implements ResponseTransformer {

    @Override
    public String render(Object model) throws Exception {
        ParserToJson parser = new ParserToJson();
        return parser.dataToJson(model);

    }
}
