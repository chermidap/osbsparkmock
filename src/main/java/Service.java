import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.*;
import utils.AbonosTempMock;
import utils.ParserToJson;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.post;


public class Service {

    public static void main( String[] args) {
        ParserToJson parser = new ParserToJson();
        get("/posts", (req, res) -> {
            return "Hello Sparkingly World!";
        });

        post("/getPrecioAbono",(request, response) -> {
            TicketPricesResp resp = new TicketPricesResp();
            try {
                ObjectMapper mapper = new ObjectMapper();
                TicketPricesReq ticketPricesReq = mapper.readValue(request.body(), TicketPricesReq.class);
                List<String> codAbonosRecommend = new ArrayList<String>();
                for(TicketReq abono: ticketPricesReq.getP_SABALIST_ABONOS()){
                   String codsicas =  abono.getProductCode();
                    codAbonosRecommend.add(codsicas);
                }

                List<Ticket> listaPrecioAbonos= AbonosTempMock.mockListPricesAbonos(codAbonosRecommend , "097", ticketPricesReq.getP_ORG_ID());

                resp.setPRICECOLLECTION(listaPrecioAbonos);
                resp.setS_cod_error("");


            } catch (JsonParseException e){
                // Hey, you did not send a valid request!
            }
            //int id = model.createPost(creation.getTitle(), creation.getContent(), creation.getCategories());
            response.status(200);
            response.type("application/json");
            return parser.dataToJson(resp);

        });
        post("/costeAltaAbono",(request, response) -> {
            TicketPricesResp resp = new TicketPricesResp();
            try {
                ObjectMapper mapper = new ObjectMapper();
                // mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                TicketPricesReq ticketPricesReq = mapper.readValue(request.body(), TicketPricesReq.class);
                List<String> codAbonosRecommend = new ArrayList<String>();
                for(TicketReq abono: ticketPricesReq.getP_SABALIST_ABONOS()){
                    String codsicas =  abono.getProductCode();
                    codAbonosRecommend.add(codsicas);
                }

                List<Ticket> listaPrecioAbonos= AbonosTempMock.mockCosteAltaAbono();

                resp.setPRICECOLLECTION(listaPrecioAbonos);
                resp.setS_cod_error("");


            } catch (JsonParseException e){
                // Hey, you did not send a valid request!
            }
            //int id = model.createPost(creation.getTitle(), creation.getContent(), creation.getCategories());
            response.status(200);
            response.type("application/json");
            return parser.dataToJson(resp);


            //return "costeAltaAbono!";
        });
        post("/preAltaAbono",(request, response) -> {
            return "preAltaAbono!";
        });
        post("/datosCompletos",(request, response) -> {
            return "datosCompletos!";
        });

        get("/transfomer", "application/json", (request, response) -> {
            return new Ticket("6860","097",100.0);
        }, new JsonTransformer());


        get("/transformer2", (request, response) ->  new Ticket("6860","097",100.0), parser::dataToJson);
    }


}
