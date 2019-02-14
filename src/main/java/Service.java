import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.*;
import utils.AbonosTempMock;
import utils.ParserToJson;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

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
                purchaseTicketsResponse= AbonosTempMock.mockPreAltaAbono(purchaseTicketsRequest);


            } catch (JsonParseException e){
                // Hey, you did not send a valid request!
            }
            response.status(200);
            response.type("application/json");
            return parser.dataToJson(purchaseTicketsResponse);

        });
        post("/datosCompletos",(request, response) -> {

            try {
                ObjectMapper mapper = new ObjectMapper();
                // mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                PurchaseDataTicketRequest purchaseTicketsRequest = mapper.readValue(request.body(), PurchaseDataTicketRequest.class);
                purchaseTicketsRequest.getP_iban();
                purchaseTicketsRequest.getP_cod_aparca();
                purchaseTicketsRequest.getP_loc_venta();
                purchaseTicketsRequest.getP_marca();
                purchaseTicketsRequest.getP_matricula();
                purchaseTicketsRequest.getP_modelo();

            } catch (JsonParseException e){
                // Hey, you did not send a valid request!
            }
            response.status(200);
            response.type("application/json");

            return "ok";
        });

        post("/getConsultaImpagosCliente",(request, response) -> {
        	NonPaymentResponse nonPaymentResponse  =null;
            try {
                ObjectMapper mapper = new ObjectMapper();
                // mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                NonPaymentRequest nonPaymentRequest = mapper.readValue(request.body(), NonPaymentRequest.class);
                nonPaymentResponse = AbonosTempMock.mockConsultaImpagosCliente(nonPaymentRequest);

            } catch (JsonParseException e){
                // Hey, you did not send a valid request!
            }
            response.status(200);
            response.type("application/json");
            return parser.dataToJson(nonPaymentResponse);
        });

        post("/SetDetailsUsuarioRS",(request, response) -> {
            UserResponse userResponse  =null;
            try {
                ObjectMapper mapper = new ObjectMapper();
                // mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                UserRequest userRequest = mapper.readValue(request.body(), UserRequest.class);
                userResponse = AbonosTempMock.mockSetUserDetail(userRequest);

            } catch (JsonParseException e){
                // Hey, you did not send a valid request!
            }
            response.status(200);
            response.type("application/json");
            return parser.dataToJson(userResponse);
        });

        post("/GetDetailsUsuarioRS",(request, response) -> {

            UserResponse userResponse  =null;
            try {
                ObjectMapper mapper = new ObjectMapper();
                // mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                UserRequest userRequest = mapper.readValue(request.body(), UserRequest.class);
                userResponse = AbonosTempMock.mockGetUserDetatil(userRequest);

            } catch (JsonParseException e){
                // Hey, you did not send a valid request!
            }
            response.status(200);
            response.type("application/json");
            return parser.dataToJson(userResponse);

        });


        post("/GetListUserIdCompraRS",(request, response) -> {

            FindPurchasesByUserResponse findPurchasesByUserResponse  = null;
            try {
                ObjectMapper mapper = new ObjectMapper();
                // mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                FindPurchasesByUserRequest findPurchasesByUserRequest = mapper.readValue(request.body(), FindPurchasesByUserRequest.class);
                findPurchasesByUserResponse = AbonosTempMock.mockGetListUserIdCompra(findPurchasesByUserRequest);

            } catch (JsonParseException e){
                // Hey, you did not send a valid request!
            }
            response.status(200);
            response.type("application/json");
            return parser.dataToJson(findPurchasesByUserResponse);

        });
        

        get("/transformer", "application/json", (request, response) -> {
            return new Ticket("6860","097",100.0);
        }, new JsonTransformer());


        get("/transformer2", (request, response) ->  new Ticket("6860","097",100.0), parser::dataToJson);
    }


}
