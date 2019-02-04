import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.*;
import utils.AbonosTempMock;
import utils.ParserToJson;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;


public class Service {

    public static void main( String[] args) {
        ParserToJson parser = new ParserToJson();
        port(4568);
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
            response.status(200);
            response.type("application/json");
            return parser.dataToJson(resp);

        });
        post("/preAltaAbono",(request, response) -> {
            PurchaseTicketsResponse purchaseTicketsResponse  =null;
            try {
                ObjectMapper mapper = new ObjectMapper();
                // mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                PurchaseTicketsRequest purchaseTicketsRequest = mapper.readValue(request.body(), PurchaseTicketsRequest.class);


                purchaseTicketsResponse= AbonosTempMock.mockPreAltaAbono();



            } catch (JsonParseException e){
                // Hey, you did not send a valid request!
            }
            response.status(200);
            response.type("application/json");
            return parser.dataToJson(purchaseTicketsResponse);

        });
        post("/datosCompletos",(request, response) -> {
            return "datosCompletos!";
        });

        post("/getConsultaImpagosCliente",(request, response) -> {
            return "getConsultaImpagosCliente!";
        });



        get("/transformer", "application/json", (request, response) -> {
            return new Ticket("6860","097",100.0);
        }, new JsonTransformer());


        get("/transformer2", (request, response) ->  new Ticket("6860","097",100.0), parser::dataToJson);
    }


}
