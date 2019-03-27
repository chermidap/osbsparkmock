package utils;

import json.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AbonosTempMock {

    private static final Map<String, UserResponse> usuarios = initMap();

    private static Map<String, UserResponse> initMap() {
        Map<String, UserResponse> map = new HashMap<>();
        UserResponse userResponseVerified = new UserResponse();
        UserResponse userResponseVerified2 = new UserResponse();
        UserResponse userResponseNoVerified = new UserResponse();

        userResponseVerified.setBirthDate("04/02/1980");
        userResponseVerified.setEmail("usuario.verified@intelygenz.com");
        userResponseVerified.setId("2444");
        userResponseVerified.setLanguage("CAST");
        userResponseVerified.setName("Usuario pruebas mock-osb");
        userResponseVerified.setNewsletter(true);
        userResponseVerified.setPassword("12345678");
        userResponseVerified.setSurname("dfesewgf");
        userResponseVerified.setS_cod_cli("180444");
        userResponseVerified.setCommunications(true);

        userResponseNoVerified.setEmail("usuario.noverified@intelygenz.com");
        userResponseNoVerified.setId("2445");
        userResponseNoVerified.setLanguage("CAST");
        userResponseNoVerified.setName("Usuario");
        userResponseNoVerified.setNewsletter(true);
        userResponseNoVerified.setPassword("12345678");
        userResponseNoVerified.setSurname("NoVerified");
        userResponseNoVerified.setBirthDate("04/02/1979");
        userResponseNoVerified.setS_cod_cli(null);
        userResponseNoVerified.setCommunications(false);
        
        userResponseVerified2.setBirthDate("18/07/1980");
        userResponseVerified2.setEmail("usuario.verified.sin.imp@intelygenz.com");
        userResponseVerified2.setId("2446");
        userResponseVerified2.setLanguage("CAST");
        userResponseVerified2.setName("Usuario verificado");
        userResponseVerified2.setNewsletter(true);
        userResponseVerified2.setPassword("12345678");
        userResponseVerified2.setSurname("Sin impagos");
        userResponseVerified2.setS_cod_cli("180444");
        userResponseVerified2.setCommunications(false);

        map.put(userResponseVerified.getEmail(),userResponseVerified);
        map.put(userResponseVerified2.getEmail(),userResponseVerified2);
        map.put(userResponseNoVerified.getEmail(),userResponseNoVerified);

        return Collections.unmodifiableMap(map);
    }


    public static  List<Ticket>  mockCosteAltaAbono(){


        Ticket productPriceES = new Ticket();
        Ticket productPriceES2 = new Ticket();
        Ticket productPriceES3 = new Ticket();
        Ticket productPriceES4 = new Ticket();
        Ticket productPriceES5 = new Ticket();
        Ticket productPriceES6 = new Ticket();
        Ticket productPriceES7 = new Ticket();
        Ticket productPriceES8 = new Ticket();
        Ticket productPriceES9 = new Ticket();

        List<Ticket> resultado = new ArrayList<Ticket>();


        productPriceES2.setProductCode("2900");//cp026
        productPriceES2.setParkingCode("097");
        productPriceES2.setPriceWithDiscount(152.67);
        productPriceES2.setPriceWithoutDiscount(169.63);
        productPriceES2.setPriceWithDiscount_sin_iva(126.17);
        productPriceES2.setIva_percent(21.0);
        productPriceES2.setDiscount(10.0);
        productPriceES2.setAmount_iva_price_with_dto(26.5);
        productPriceES2.setAmount_iva_price_withow_dto(29.44);
        productPriceES2.setPriceWithowDiscount_sin_iva(140.19);

        productPriceES2.setManageAmount( 170.0);
        productPriceES2.setEnd_date( "2019/12/31");
        productPriceES2.setRegistration_fee( 10.0);
        productPriceES2.setTotal_amount(63.6+170+10);




        productPriceES.setProductCode("6748");//cp037
        productPriceES.setParkingCode("097");
        productPriceES.setPriceWithDiscount(229.0);
        productPriceES.setPriceWithoutDiscount(254.45);
        productPriceES.setPriceWithDiscount_sin_iva(189.26);
        productPriceES.setAmount_iva_price_with_dto(39.74);
        productPriceES.setAmount_iva_price_withow_dto(44.16);
        productPriceES.setPriceWithowDiscount_sin_iva(210.29);
        productPriceES.setIva_percent(21.0);
        productPriceES.setDiscount(10.0);

        productPriceES.setManageAmount( 160.0);//gastos de emision de tarjeta
        productPriceES.setEnd_date("2019/12/31");
        productPriceES.setRegistration_fee( 10.0);//cuota de alta
        productPriceES.setTotal_amount(160+10+50.6);
        // productPriceES.setSub_total_amount(170+10));


            productPriceES3.setProductCode("2903");//cp029
            productPriceES3.setParkingCode("097");
            productPriceES3.setPriceWithDiscount(85.6);
            productPriceES3.setPriceWithoutDiscount(200.6);
            productPriceES3.setPriceWithDiscount_sin_iva(52.56);
           // productPriceES3.setTaxesAmount(11.04));
            productPriceES3.setIva_percent(21.0);
           // productPriceES3.setUnits(1);
            productPriceES3.setDiscount(20.0);

            productPriceES3.setManageAmount( 180.0);
            productPriceES3.setEnd_date("2019/12/31");
            productPriceES3.setRegistration_fee( 20.0);
            productPriceES3.setTotal_amount(180+20+85.6);
           // productPriceES3.setSub_total_amount(180+20));

            productPriceES4.setProductCode("2904");//cp031
            productPriceES4.setParkingCode("097");
            productPriceES4.setPriceWithDiscount(45.6);
            productPriceES4.setPriceWithoutDiscount(200.6);
            productPriceES4.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES4.setTaxesAmount(11.04));
            productPriceES4.setIva_percent(21.0);
          //  productPriceES4.setUnits(1);
            productPriceES4.setDiscount(20.0);

            productPriceES4.setManageAmount( 180.0);
            productPriceES4.setEnd_date("2019/12/31");
            productPriceES4.setRegistration_fee( 20.0);
            productPriceES4.setTotal_amount(180+20+45.6);
           // productPriceES4.setSub_total_amount(170+10));


            productPriceES5.setProductCode("2902");//cp038
            productPriceES5.setParkingCode("097");
            productPriceES5.setPriceWithDiscount(34.6);
            productPriceES5.setPriceWithoutDiscount(200.6);
            productPriceES5.setPriceWithDiscount_sin_iva(52.56);
         //   productPriceES5.setTaxesAmount(11.04));
            productPriceES5.setIva_percent(21.0);
         //   productPriceES5.setUnits(1);
            productPriceES5.setDiscount(20.0);

            productPriceES5.setManageAmount( 180.0);
            productPriceES5.setEnd_date( "2019/12/31");
            productPriceES5.setRegistration_fee( 20.0);
            productPriceES5.setTotal_amount(180+20+34.6);
          //  productPriceES5.setSub_total_amount(170+10));


            productPriceES6.setProductCode("2905");//cp039(2905)
            productPriceES6.setParkingCode("097");
            productPriceES6.setPriceWithDiscount(100.0);
            productPriceES6.setPriceWithoutDiscount(200.6);
            productPriceES6.setPriceWithDiscount_sin_iva(52.56);
           // productPriceES6.setTaxesAmount(11.04));
            productPriceES6.setIva_percent(21.0);
          //  productPriceES6.setUnits(1);
            productPriceES6.setDiscount(20.0);

            productPriceES6.setManageAmount( 180.0);
            productPriceES6.setEnd_date("2019/12/31");
            productPriceES6.setRegistration_fee( 20.0);
            productPriceES6.setTotal_amount(180+20+100.0);
          //  productPriceES6.setSub_total_amount(170+10));



            productPriceES7.setProductCode("4763");//cp041(4763)
            productPriceES7.setParkingCode("097");
            productPriceES7.setPriceWithDiscount(115.0);
            productPriceES7.setPriceWithoutDiscount(200.6);
            productPriceES7.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES7.setTaxesAmount(11.04));
            productPriceES7.setIva_percent(21.0);
          //  productPriceES7.setUnits(1);
            productPriceES7.setDiscount(20.0);

            productPriceES7.setManageAmount( 180.0);
            productPriceES7.setEnd_date("2019/12/31");
            productPriceES7.setRegistration_fee( 20.0);
            productPriceES7.setTotal_amount(180+20.0);
        //  productPriceES7.setSub_total_amount(170+10));


            productPriceES8.setProductCode("6068");//cp034(6068)
            productPriceES8.setParkingCode("097");
            productPriceES8.setPriceWithDiscount(90.6);
            productPriceES8.setPriceWithoutDiscount(200.6);
            productPriceES8.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES8.setTaxesAmount(11.04));
            productPriceES8.setIva_percent(21.0);
          //  productPriceES8.setUnits(1);
            productPriceES8.setDiscount(20.0);

            productPriceES8.setManageAmount( 180.0);
            productPriceES8.setEnd_date("2019/12/31");
            productPriceES8.setRegistration_fee( 20.0);
            productPriceES8.setTotal_amount(180+20.0);
          // productPriceES8.setSub_total_amount(170+10+90.6));


            productPriceES9.setProductCode("2906");//cp035(2906)
            productPriceES9.setParkingCode("097");
            productPriceES9.setPriceWithDiscount(88.6);
            productPriceES9.setPriceWithoutDiscount(200.6);
            productPriceES9.setPriceWithDiscount_sin_iva(52.56);
         //   productPriceES9.setTaxesAmount(11.04));
            productPriceES9.setIva_percent(21.0);
          //  productPriceES9.setUnits(1);
            productPriceES9.setDiscount(20.0);

            productPriceES9.setManageAmount( 180.0);
            productPriceES9.setEnd_date("2019/12/31");
            productPriceES9.setRegistration_fee( 20.0);
            productPriceES9.setTotal_amount(180+20+88.6);
          //  productPriceES9.setSub_total_amount(170+10));


            resultado.add(productPriceES);
            resultado.add(productPriceES2);
            resultado.add(productPriceES3);
            resultado.add(productPriceES4);
            resultado.add(productPriceES5);
            resultado.add(productPriceES6);
            resultado.add(productPriceES7);
            resultado.add(productPriceES8);
            resultado.add(productPriceES9);

        return resultado;
    }

 /*   public static  List<ProductSICASPrice>  mockPriceAbono(String codsicas){
        Map<String,ProductSICASPrice> productSICASPriceMapEs = new HashMap<String, ProductSICASPrice>();
        List<ProductSICASPrice> resultado = new ArrayList<ProductSICASPrice>();
        ProductSICASPrice productPrice = new ProductSICASPrice();
        ProductSICASPrice productPriceES8 = new ProductSICASPrice();
        ProductSICASPrice productPriceES9 = new ProductSICASPrice();

        productPrice.setProductSICASCode("6748");//cp037
        productPrice.setParkingCode("097");
        productPrice.setPrice(50.6));
        productPrice.setPriceWithoutDiscount(200.6));
        productPrice.setPriceWithDiscount_sin_iva(52.56));
        productPrice.setTaxesAmount(11.04));
        productPrice.setIva_percent(21));
        productPrice.setUnits(1);
        productPrice.setDiscount(20.0);
        productPrice.setSub_total_amount(170+10));
        productPrice.setTotal_amount(170+10+50.6));

        productPriceES8.setProductSICASCode("6068");//cp034(6068)
        productPriceES8.setParkingCode("097");
        productPriceES8.setPrice(90.6));
        productPriceES8.setPriceWithoutDiscount(200.6));
        productPriceES8.setPriceWithDiscount_sin_iva(52.56));
        productPriceES8.setTaxesAmount(11.04));
        productPriceES8.setIva_percent(21));
        productPriceES8.setUnits(1);
        productPriceES8.setDiscount(20.0);

        productPriceES8.setEmission_amount( 180));
        productPriceES8.setEnd_date( new Date());
        productPriceES8.setRegistration_fee( 20));
        productPriceES8.setTotal_amount(180+20));
        productPriceES8.setSub_total_amount(170+10+90.6));

        productPriceES9.setProductSICASCode("2906");//cp035(2906)
        productPriceES9.setParkingCode("097");
        productPriceES9.setPrice(88.6));
        productPriceES9.setPriceWithoutDiscount(200.6));
        productPriceES9.setPriceWithDiscount_sin_iva(52.56));
        productPriceES9.setTaxesAmount(11.04));
        productPriceES9.setIva_percent(21));
        productPriceES9.setUnits(1);
        productPriceES9.setDiscount(20.0);

        productPriceES9.setEmission_amount( 180));
        productPriceES9.setEndate( new Date());
        productPriceES9.setRegistration_fee( 20));
        productPriceES9.setTotal_amount(180+20+88.6));
        productPriceES9.setSub_total_amount(170+10));

        productSICASPriceMapEs.put("2906",productPriceES9);
        productSICASPriceMapEs.put("6068",productPriceES8);
        productSICASPriceMapEs.put("6748",productPrice);

        ProductSICASPrice productSICASPriceSelected = productSICASPriceMapEs.get(codsicas);
        resultado.add(productSICASPriceSelected);

        return resultado;

    }*/
    public static List<Ticket> mockListPricesAbonos(List<String> codAbonosRecommend , String parkingcode, String countrycode){

        Map<String,Ticket> productSICASPriceMapIt = new HashMap<String, Ticket>();
        Map<String,Ticket> productSICASPriceMapEs = new HashMap<String, Ticket>();
        Map<String,ProductSICASPrice> productSICASPriceMapPt = new HashMap<String, ProductSICASPrice>();
        Map<String,ProductSICASPrice> productSICASPriceMapCl = new HashMap<String, ProductSICASPrice>();

//parkings it
        //RM01 -- CP218(1222),CP220(1223),CP221(0807),CP224(1224),CP227(1239),CP232(0793)
        //VE01 -- CP222(1644),CP228(1393),CP231(0512)
        //PG02 -- CP231(0637)
        //MI01 -- CP222(1263),CP224(1266),CP231(1265)
        //PS01 -- CP222(0068),CP224(0067),CP231(1330),CP232(0071)
        //PGPP -- CP220(1531),CP224(1532),CP231(1541)

//parkings es
        //097 -- cp026(2900),cp037(6748),cp029(2903),cp031(2904), cp037(1222),cp038(2902),cp039(2905),cp041(4763),cp034(6068),cp035(2906)
        //613 -- cp026(0966),cp029(1780),cp038(1779),cp031(0977),cp039(0970),cp040(4500),cp041(4502),cp034(0969)
        //331 --  cp026(1855),cp028(3354),cp037,(3052),cp029(1671),cp038(1670),cp031(0051),cp039(0042),cp032(1672),cp040(1673),cp033(3100),cp041(2934),cp034(0048),cp035(0063),cp042(6858),cp043(6859)
        //038 -- cp026(2846),cp027(4585),cp038(3019),cp030(1901),cp031(0422),cp039(0415),cp040(1902),cp034(0423)
        //751 -- cp028(4224),cp039(5996),cp034,(4225)



        List<Ticket> mockListAbonos = new ArrayList<Ticket>();
        Ticket productPrice = new Ticket();
        ProductSICASPrice productPrice2 = new ProductSICASPrice();
        ProductSICASPrice productPrice3 = new ProductSICASPrice();
        ProductSICASPrice productPrice4 = new ProductSICASPrice();
        ProductSICASPrice productPrice5 = new ProductSICASPrice();
        ProductSICASPrice productPrice6 = new ProductSICASPrice();

        Ticket productPriceES = new Ticket();
        Ticket productPriceES2 = new Ticket();
        Ticket productPriceES3 = new Ticket();
        Ticket productPriceES4 = new Ticket();
        Ticket productPriceES5 = new Ticket();
        Ticket productPriceES6 = new Ticket();
        Ticket productPriceES7 = new Ticket();
        Ticket productPriceES8 = new Ticket();
        Ticket productPriceES9 = new Ticket();

        if(parkingcode.equals("097")){
            //097 -- cp026(2900),cp037(6748),cp029(2903),cp031(2904),cp038(2902),cp039(2905),cp041(4763),cp034(6068),cp035(2906)



            productPriceES.setProductCode("2900");//cp026
            productPriceES.setParkingCode("097");
            productPriceES.setPriceWithDiscount(152.67);
            productPriceES.setPriceWithoutDiscount(169.63);
            productPriceES.setPriceWithDiscount_sin_iva(126.17);
            productPriceES.setDiscount(10.0);
            productPriceES.setIva_percent(21.0);
            productPriceES.setAmount_iva_price_with_dto(26.5);
            productPriceES.setAmount_iva_price_withow_dto(29.44);
            productPriceES.setPriceWithowDiscount_sin_iva(140.19);


            productPriceES2.setProductCode("6748");//cp037
            productPriceES2.setParkingCode("097");
            productPriceES2.setPriceWithDiscount(229.0);
            productPriceES2.setPriceWithoutDiscount(254.45);
            productPriceES2.setPriceWithDiscount_sin_iva(189.26);
            productPriceES2.setAmount_iva_price_with_dto(39.74);
            productPriceES2.setAmount_iva_price_withow_dto(44.16);
            productPriceES2.setPriceWithowDiscount_sin_iva(210.29);
            productPriceES2.setIva_percent(21.0);
            productPriceES2.setDiscount(10.0);

            productPriceES3.setProductCode("2903");//cp029
            productPriceES3.setParkingCode("097");
            productPriceES3.setPriceWithDiscount(85.6);
            productPriceES3.setPriceWithoutDiscount(200.6);
            productPriceES3.setPriceWithDiscount_sin_iva(52.56);
           // productPriceES3.setTaxesAmount(11.04);
            productPriceES3.setIva_percent(21.0);
            //productPriceES3.setUnits(1);
            productPriceES3.setDiscount(20.0);

            productPriceES4.setProductCode("2904");//cp031
            productPriceES4.setParkingCode("097");
            productPriceES4.setPriceWithDiscount(45.6);
            productPriceES4.setPriceWithoutDiscount(200.6);
            productPriceES4.setPriceWithDiscount_sin_iva(52.56);
           // productPriceES4.setTaxesAmount(11.04);
            productPriceES4.setIva_percent(21.0);
            //productPriceES4.setUnits(1);
            productPriceES4.setDiscount(20.0);

            productPriceES5.setProductCode("2902");//cp038
            productPriceES5.setParkingCode("097");
            productPriceES5.setPriceWithDiscount(34.6);
            productPriceES5.setPriceWithoutDiscount(200.6);
            productPriceES5.setPriceWithDiscount_sin_iva(52.56);
           // productPriceES5.setTaxesAmount(11.04);
            productPriceES5.setIva_percent(21.0);
           // productPriceES5.setUnits(1);
            productPriceES5.setDiscount(20.0);

            productPriceES6.setProductCode("2905");//cp039(2905)
            productPriceES6.setParkingCode("097");
            productPriceES6.setPriceWithDiscount(100.0);
            productPriceES6.setPriceWithoutDiscount(200.6);
            productPriceES6.setPriceWithDiscount_sin_iva(52.56);
           // productPriceES6.setTaxesAmount(11.04);
            productPriceES6.setIva_percent(21.0);
           // productPriceES6.setUnits(1);
            productPriceES6.setDiscount(20.0);

            productPriceES7.setProductCode("4763");//cp041(4763)
            productPriceES7.setParkingCode("097");
            productPriceES7.setPriceWithDiscount(115.0);
            productPriceES7.setPriceWithoutDiscount(200.6);
            productPriceES7.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES7.setTaxesAmount(11.04);
            productPriceES7.setIva_percent(21.0);
         //   productPriceES7.setUnits(1);
            productPriceES7.setDiscount(20.0);

            productPriceES8.setProductCode("6068");//cp034(6068)
            productPriceES8.setParkingCode("097");
            productPriceES8.setPriceWithDiscount(90.6);
            productPriceES8.setPriceWithoutDiscount(200.6);
            productPriceES8.setPriceWithDiscount_sin_iva(52.56);
         //   productPriceES8.setTaxesAmount(11.04);
            productPriceES8.setIva_percent(21.0);
           // productPriceES8.setUnits(1);
            productPriceES8.setDiscount(20.0);

            productPriceES9.setProductCode("2906");//cp035(2906)
            productPriceES9.setParkingCode("097");
            productPriceES9.setPriceWithDiscount(88.6);
            productPriceES9.setPriceWithoutDiscount(200.6);
            productPriceES9.setPriceWithDiscount_sin_iva(52.56);
            // productPriceES9.setTaxesAmount(11.04);
            productPriceES9.setIva_percent(21.0);
           // productPriceES9.setUnits(1);
            productPriceES9.setDiscount(20.0);

            productSICASPriceMapEs.put("2900",productPriceES);
            productSICASPriceMapEs.put("6748",productPriceES2);
            productSICASPriceMapEs.put("cp029",productPriceES3);
            productSICASPriceMapEs.put("cp031",productPriceES4);
            productSICASPriceMapEs.put("cp038",productPriceES5);
            productSICASPriceMapEs.put("cp039",productPriceES6);
            productSICASPriceMapEs.put("cp041",productPriceES7);
            productSICASPriceMapEs.put("6068",productPriceES8);
            productSICASPriceMapEs.put("cp035",productPriceES9);



        }else if(parkingcode.equals("613")){
            //613 -- cp026(0966),cp029(1780),cp038(1779),cp031(0977),cp039(0970),cp040(4500),cp041(4502),cp034(0969)

            productPriceES.setProductCode("0966");//cp026
            productPriceES.setParkingCode("613");
            productPriceES.setPriceWithDiscount(63.6);
            productPriceES.setPriceWithoutDiscount(200.6);
            productPriceES.setPriceWithDiscount_sin_iva(52.56);
           // productPriceES.setTaxesAmount(11.04);
            productPriceES.setIva_percent(21.0);
          //  productPriceES.setUnits(1);
            productPriceES.setDiscount(20.0);

            productPriceES2.setProductCode("1780");//cp029
            productPriceES2.setParkingCode("613");
            productPriceES2.setPriceWithDiscount(54.6);
            productPriceES2.setPriceWithoutDiscount(200.6);
            productPriceES2.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES2.setTaxesAmount(11.04);
            productPriceES2.setIva_percent(21.0);
          //  productPriceES2.setUnits(1);
            productPriceES2.setDiscount(20.0);

            productPriceES3.setProductCode("1779");//cp038
            productPriceES3.setParkingCode("613");
            productPriceES3.setPriceWithDiscount(78.6);
            productPriceES3.setPriceWithoutDiscount(200.6);
            productPriceES3.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES3.setTaxesAmount(11.04);
            productPriceES3.setIva_percent(21.0);
          //  productPriceES3.setUnits(1);
            productPriceES3.setDiscount(20.0);

            productPriceES4.setProductCode("0977");//cp031(0977)
            productPriceES4.setParkingCode("613");
            productPriceES4.setPriceWithDiscount(90.6);
            productPriceES4.setPriceWithoutDiscount(200.6);
            productPriceES4.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES4.setTaxesAmount(11.04);
            productPriceES4.setIva_percent(21.0);
         //   productPriceES4.setUnits(1);
            productPriceES4.setDiscount(20.0);

            productPriceES5.setProductCode("0970");//cp039(0970)
            productPriceES5.setParkingCode("613");
            productPriceES5.setPriceWithDiscount(44.0);
            productPriceES5.setPriceWithoutDiscount(200.6);
            productPriceES5.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES5.setTaxesAmount(11.04);
            productPriceES5.setIva_percent(21.0);
         //   productPriceES5.setUnits(1);
            productPriceES5.setDiscount(20.0);

            productPriceES6.setProductCode("4500");//cp040(4500)
            productPriceES6.setParkingCode("613");
            productPriceES6.setPriceWithDiscount(35.6);
            productPriceES6.setPriceWithoutDiscount(200.6);
            productPriceES6.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES6.setTaxesAmount(11.04);
            productPriceES6.setIva_percent(21.0);
         //   productPriceES6.setUnits(1);
            productPriceES6.setDiscount(20.0);

            productPriceES7.setProductCode("4502");//cp041(4502)
            productPriceES7.setParkingCode("613");
            productPriceES7.setPriceWithDiscount(115.0);
            productPriceES7.setPriceWithoutDiscount(200.6);
            productPriceES7.setPriceWithDiscount_sin_iva(52.56);
         //   productPriceES7.setTaxesAmount(11.04);
            productPriceES7.setIva_percent(21.0);
         //   productPriceES7.setUnits(1);
            productPriceES7.setDiscount(20.0);

            productPriceES8.setProductCode("0969");//cp034(0969)
            productPriceES8.setParkingCode("613");
            productPriceES8.setPriceWithDiscount(25.0);
            productPriceES8.setPriceWithoutDiscount(200.6);
            productPriceES8.setPriceWithDiscount_sin_iva(52.56);
         //   productPriceES8.setTaxesAmount(11.04);
            productPriceES8.setIva_percent(21.0);
          //  productPriceES8.setUnits(1);
            productPriceES8.setDiscount(20.0);

            productSICASPriceMapEs.put("cp026",productPriceES);
            productSICASPriceMapEs.put("cp029",productPriceES2);
            productSICASPriceMapEs.put("cp038",productPriceES3);
            productSICASPriceMapEs.put("cp031",productPriceES4);
            productSICASPriceMapEs.put("cp039",productPriceES5);
            productSICASPriceMapEs.put("cp040",productPriceES6);
            productSICASPriceMapEs.put("cp041",productPriceES7);
            productSICASPriceMapEs.put("cp034",productPriceES8);


        }else if(parkingcode.equals("331")){
            //331 --  cp026(1855),cp028(3354),cp037,(3052),cp029(1671),cp038(1670),cp031(0051),cp039(0042),cp032(1672),cp040(1673),cp033(3100),cp041(2934),cp034(0048),cp035(0063),cp042(6858),cp043(6859)

        }else if (parkingcode.equals("038")){
            //038 -- cp026(2846),cp027(4585),cp038(3019),cp030(1901),cp031(0422),cp039(0415),cp040(1902),cp034(0423)
            productPriceES.setProductCode("2846");// cp026(2846)
            productPriceES.setParkingCode("038");
            productPriceES.setPriceWithDiscount(63.6);
            productPriceES.setPriceWithoutDiscount(200.6);
            productPriceES.setPriceWithDiscount_sin_iva(52.56);
           // productPriceES.setTaxesAmount(11.04);
            productPriceES.setIva_percent(21.0);
          //  productPriceES.setUnits(1);
            productPriceES.setDiscount(20.0);

            productPriceES2.setProductCode("4585");//cp027(4585)
            productPriceES2.setParkingCode("038");
            productPriceES2.setPriceWithDiscount(79.0);
            productPriceES2.setPriceWithoutDiscount(200.6);
            productPriceES2.setPriceWithDiscount_sin_iva(52.56);
         //   productPriceES2.setTaxesAmount(11.04);
            productPriceES2.setIva_percent(21.0);
          //  productPriceES2.setUnits(1);
            productPriceES2.setDiscount(20.0);

            productPriceES3.setProductCode("3019");//cp038(3019)
            productPriceES3.setParkingCode("038");
            productPriceES3.setPriceWithDiscount(82.5);
            productPriceES3.setPriceWithoutDiscount(200.6);
            productPriceES3.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES3.setTaxesAmount(11.04);
            productPriceES3.setIva_percent(21.0);
          //  productPriceES3.setUnits(1);
            productPriceES3.setDiscount(20.0);

            productPriceES4.setProductCode("1901");//cp030(1901)
            productPriceES4.setParkingCode("038");
            productPriceES4.setPriceWithDiscount(34.0);
            productPriceES4.setPriceWithoutDiscount(200.6);
            productPriceES4.setPriceWithDiscount_sin_iva(52.56);
         //   productPriceES4.setTaxesAmount(11.04);
            productPriceES4.setIva_percent(21.0);
         //   productPriceES4.setUnits(1);
            productPriceES4.setDiscount(20.0);

            productPriceES5.setProductCode("0422");//cp031(0422)
            productPriceES5.setParkingCode("038");
            productPriceES5.setPriceWithDiscount(57.6);
            productPriceES5.setPriceWithoutDiscount(200.6);
            productPriceES5.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES5.setTaxesAmount(11.04);
            productPriceES5.setIva_percent(21.0);
         //   productPriceES5.setUnits(1);
            productPriceES5.setDiscount(20.0);

            productPriceES6.setProductCode("0415");//cp039(0415)
            productPriceES6.setParkingCode("038");
            productPriceES6.setPriceWithDiscount(88.6);
            productPriceES6.setPriceWithoutDiscount(200.6);
            productPriceES6.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES6.setTaxesAmount(11.04);
            productPriceES6.setIva_percent(21.0);
            //productPriceES6.setUnits(1);
            productPriceES6.setDiscount(20.0);

            productPriceES7.setProductCode("1902");//cp040(1902)
            productPriceES7.setParkingCode("038");
            productPriceES7.setPriceWithDiscount(72.6);
            productPriceES7.setPriceWithoutDiscount(200.6);
            productPriceES7.setPriceWithDiscount_sin_iva(52.56);
         //   productPriceES7.setTaxesAmount(11.04);
            productPriceES7.setIva_percent(21.0);
        //    productPriceES7.setUnits(1);
            productPriceES7.setDiscount(20.0);

            productPriceES8.setProductCode("0423");//cp034(0423)
            productPriceES8.setParkingCode("038");
            productPriceES8.setPriceWithDiscount(115.6);
            productPriceES8.setPriceWithoutDiscount(200.6);
            productPriceES8.setPriceWithDiscount_sin_iva(52.56);
       //     productPriceES8.setTaxesAmount(11.04);
            productPriceES8.setIva_percent(21.0);
       //     productPriceES8.setUnits(1);
            productPriceES8.setDiscount(20.0);

            productSICASPriceMapEs.put("cp026",productPriceES);
            productSICASPriceMapEs.put("cp027",productPriceES2);
            productSICASPriceMapEs.put("cp038",productPriceES3);
            productSICASPriceMapEs.put("cp030",productPriceES4);
            productSICASPriceMapEs.put("cp031",productPriceES5);
            productSICASPriceMapEs.put("cp039",productPriceES6);
            productSICASPriceMapEs.put("cp040",productPriceES7);
            productSICASPriceMapEs.put("cp034",productPriceES8);

        }else if (parkingcode.equals("751")){
            //751 -- cp028(4224),cp039(5996),cp034,(4225)
            productPriceES.setProductCode("4224");// cp028(4224)
            productPriceES.setParkingCode("751");
            productPriceES.setPriceWithDiscount(63.6);
            productPriceES.setPriceWithoutDiscount(200.6);
            productPriceES.setPriceWithDiscount_sin_iva(52.56);
          //  productPriceES.setTaxesAmount(11.04);
            productPriceES.setIva_percent(21.0);
         //   productPriceES.setUnits(1);
            productPriceES.setDiscount(20.0);

            productPriceES2.setProductCode("5996");//cp039(5996)
            productPriceES2.setParkingCode("751");
            productPriceES2.setPriceWithDiscount(90.9);
            productPriceES2.setPriceWithoutDiscount(200.6);
            productPriceES2.setPriceWithDiscount_sin_iva(52.56);
         //   productPriceES2.setTaxesAmount(11.04);
            productPriceES2.setIva_percent(21.0);
         //   productPriceES2.setUnits(1);
            productPriceES2.setDiscount(20.0);

            productPriceES3.setProductCode("4225");//cp034,(4225)
            productPriceES3.setParkingCode("751");
            productPriceES3.setPriceWithDiscount(103.0);
            productPriceES3.setPriceWithoutDiscount(200.6);
            productPriceES3.setPriceWithDiscount_sin_iva(52.56);
         //   productPriceES3.setTaxesAmount(11.04);
            productPriceES3.setIva_percent(21.0);
         //   productPriceES3.setUnits(1);
            productPriceES3.setDiscount(20.0);

            productSICASPriceMapEs.put("cp028",productPriceES);
            productSICASPriceMapEs.put("cp039",productPriceES2);
            productSICASPriceMapEs.put("cp034",productPriceES3);


        }


        for(String codprod:codAbonosRecommend){
            if(countrycode.equals("81")){
                if( productSICASPriceMapEs.get(codprod)!=null){
                    mockListAbonos.add( productSICASPriceMapEs.get(codprod));
                }
            }


        }

        return mockListAbonos;
    }

    public static PurchaseTicketsResponse mockPreAltaAbono(PurchaseTicketsRequest request){

        List<PurchasePrePayTicketRequest> lisadoProd = request.getP_sabalist_loc_producto();
        for(PurchasePrePayTicketRequest prePayTicketRequest:lisadoProd){
            prePayTicketRequest.getP_cod_aparca();
            prePayTicketRequest.getP_cod_producto();
            prePayTicketRequest.getP_importeiva();
            prePayTicketRequest.getP_prop_estadolocalizador();
        }

        PurchaseTicketsResponse purchaseTicketsResponse  =new PurchaseTicketsResponse();
        purchaseTicketsResponse.setS_cod_error(null);
        purchaseTicketsResponse.setS_cod_localizador("");//como se crea el localizador???
        purchaseTicketsResponse.setS_cod_qr("");// como se crea el qr??'

        return purchaseTicketsResponse;
    }

    public static UserResponse mockSetUserDetail(UserRequest request){
        return usuarios.get(request.getP_TXT_EMAIL());
    }


    public static UserResponse mockGetUserDetatil(UserRequest request){

        return usuarios.get(request.getP_TXT_MAIL());
    }
    
	public static FindPurchasesByUserResponse mockGetListUserIdCompra(FindPurchasesByUserRequest request) {

		FindPurchasesByUserResponse findPurchasesByUserResponse = new FindPurchasesByUserResponse();
		//if (request.getP_abono().equalsIgnoreCase("S")) {
			List<ProdAbono> listaAbonos = new ArrayList<ProdAbono>();
			ProdAbono prodAbono1 = new ProdAbono();
			ProdAbono prodAbono2 = new ProdAbono();
			ProdAbono prodAbono3 = new ProdAbono();
            ProdAbono prodAbono4 = new ProdAbono();
			// Completamos abono 1
			prodAbono1.setColor("GRIS");
			prodAbono1.setMatricula("7537HGL");
			prodAbono1.setMarca("RENAULT");
			prodAbono1.setModelo("MEGANE");
			prodAbono1.setIban("**** **** **** 2560");
			prodAbono1.setFechaCompra("12/01/2018");
			prodAbono1.setCuotaConDescuento("123.4");
			prodAbono1.setDescuento("12");
			prodAbono1.setEstado("Tramites pendientes");
			prodAbono1.setParking("Parking Madrid");
            prodAbono1.setCodAparca("097");
			prodAbono1.setFechaHoraVenta("2018/06/05 13:44:25");
			prodAbono1.setFechaInicio("12/01/2018");
			prodAbono1.setLocalizadorVenta("190000OM0083");
			prodAbono1.setTipoAbono("Abono mes");
			prodAbono1.setViaT("4524-2222-2222-1212");
			prodAbono1.setProductDescription("Descripcion abono 1");

			// Completamos abono 2
			prodAbono2.setColor("ROJO");
			prodAbono2.setMatricula("7537JGL");
			prodAbono2.setMarca("OPEL");
			prodAbono2.setModelo("CORSA");
			prodAbono2.setIban("**** **** **** 3440");
			prodAbono2.setFechaCompra("2018/06/05 13:44:25");
			prodAbono2.setCuotaConDescuento("83.4");
			prodAbono2.setDescuento("17");
			prodAbono2.setEstado("Tramites pendientes");
			prodAbono2.setParking("Parking Saba Passeig de Gracia-Consell de Cent");
            prodAbono2.setCodAparca("331");
			prodAbono2.setFechaHoraVenta("2018/06/05 13:44:25");
			prodAbono2.setFechaInicio("14/01/2018");
			prodAbono2.setLocalizadorVenta("190000OM0028");
			prodAbono2.setTipoAbono("Abono mes");
			prodAbono2.setViaT("4524-3333-4455-4455");
			prodAbono2.setProductDescription("Descripcion abono 2");

			// Completamos abono 3
			prodAbono3.setColor("NEGRO");
			prodAbono3.setMatricula("7537HHL");
			prodAbono3.setMarca("PEUGEOT");
			prodAbono3.setModelo("308");
			prodAbono3.setIban("**** **** **** 1230");
			prodAbono3.setFechaCompra("10/06/2018");
			prodAbono3.setCuotaConDescuento("21.4");
			prodAbono3.setDescuento("45");
			prodAbono3.setEstado("Activo");
			prodAbono3.setParking("Parque de estacionamento Saba Catedral");
            prodAbono3.setCodAparca("029");
			prodAbono3.setFechaHoraVenta("2018/06/05 13:44:25");
			prodAbono3.setFechaInicio("10/06/2018");
			prodAbono3.setLocalizadorVenta("902202122");
			prodAbono3.setTipoAbono("Abono mes");
			prodAbono3.setViaT("3233-4344-6565-7676");
			prodAbono3.setProductDescription("Descripcion abono 3");


            // Completamos abono 3
            prodAbono4.setColor("AZUL");
            prodAbono4.setMatricula("7537GGS");
            prodAbono4.setMarca("MAZDA");
            prodAbono4.setModelo("3");
            prodAbono4.setIban("**** **** **** 224");
            prodAbono4.setFechaCompra("10/06/2018");
            prodAbono4.setCuotaConDescuento("21.4");
            prodAbono4.setDescuento("60");
            prodAbono4.setEstado("Activo");
            prodAbono4.setParking("Parking Saba Estación Tren Pontevedra");
            prodAbono4.setCodAparca("830");
            prodAbono4.setFechaHoraVenta("2018/06/05 13:44:25");
            prodAbono4.setFechaInicio("10/06/2018");
            prodAbono4.setLocalizadorVenta("9022021444");
            prodAbono4.setTipoAbono("Saba Abono 24h Silver");
            prodAbono4.setViaT("3233-4344-6565-8888");
            prodAbono4.setProductDescription("Descripcion abono 3");

			//Si buscamos con tramites pendientes
			if (request.getP_solo_tramite().equalsIgnoreCase("S")) {
				listaAbonos.add(prodAbono1);
				listaAbonos.add(prodAbono2);
			} else {
				listaAbonos.add(prodAbono1);
				listaAbonos.add(prodAbono2);
				listaAbonos.add(prodAbono3);
                listaAbonos.add(prodAbono4);
			}

			findPurchasesByUserResponse.setS_sabalist_prodsAbono(listaAbonos);
			findPurchasesByUserResponse.setS_cod_error(null);
		/*}else {
            //{"P_SABALIST_PRODUCTOS":[{"p_org_id":"81","p_cod_prod_venta":"2910","p_cod_aparca":"097","p_num_unidades":1}],"P_DAT_FECHAINICIO":"03122018","P_DAT_FECHAFIN":"06122018","P_COD_IDIOMA":"CAST","P_ORG_ID":"81"}
			List<Purchase> listaProductos = new ArrayList<Purchase>();
			Purchase purchase = new Purchase();
	        purchase.setId("3232");
	        purchase.setPurchaseDate("10/06/2018");
	        purchase.setExpirationDate("10/08/2018");
	        purchase.setProductLocalizator("201856454");
	        purchase.setProductSICASCode("2910");
	        purchase.setParkingCode("097");
	        purchase.setUserCode("2443");
	        purchase.setProductTotalPrice("122.32");
	        purchase.setProductTotalPriceWithoutTaxes("122.32");
	        purchase.setProductTaxesAmount("122.32");
	        purchase.setProductTaxesRate("122.32");
	        purchase.setProductDiscountPrice("122.32");
	        purchase.setPurchaseTotalPrice("122.32");
	        purchase.setInvoiceRequired("true");
	        purchase.setCardToken("3232"); //Token de la tarjeta de crédito previamente creado con sipay
	        purchase.setTransactionId("32232");
	        purchase.setParkingCode("097");
            purchase.setEndString("21/12/2018");
            purchase.setStartString("06/12/2018");
            purchase.setParkingDescription("Parking Saba Santa Caterina");
            purchase.setProductDescription("Saba Multidía");


            Purchase purchase2 = new Purchase();
            purchase2.setId("3233");
            purchase2.setPurchaseDate("20/08/2018");
            purchase2.setExpirationDate("10/08/2018");
            purchase2.setProductLocalizator("201856454");
            purchase2.setProductSICASCode("1436");
            purchase2.setParkingCode("103");
            purchase2.setUserCode("2443");
            purchase2.setProductTotalPrice("70.32");
            purchase2.setProductTotalPriceWithoutTaxes("122.32");
            purchase2.setProductTaxesAmount("70.32");
            purchase2.setProductTaxesRate("122.32");
            purchase2.setProductDiscountPrice("122.32");
            purchase2.setPurchaseTotalPrice("70.32");
            purchase2.setInvoiceRequired("true");
            purchase2.setCardToken("3232"); //Token de la tarjeta de crédito previamente creado con sipay
            purchase2.setTransactionId("32232");
            purchase2.setEndString("18/12/2018");
            purchase2.setStartString("06/12/2018");
            purchase2.setParkingDescription("Parking Saba Plaza Mostenses");
            purchase2.setProductDescription("Saba Tempo 12h");

            Purchase purchase3 = new Purchase();
            purchase3.setId("3234");
            purchase3.setPurchaseDate("21/09/2018");
            purchase3.setExpirationDate("10/08/2018");
            purchase3.setProductLocalizator("201856454");
            purchase3.setProductSICASCode("4953");
            purchase3.setParkingCode("331");
            purchase3.setUserCode("2443");
            purchase3.setProductTotalPrice("50.32");
            purchase3.setProductTotalPriceWithoutTaxes("122.32");
            purchase3.setProductTaxesAmount("122.32");
            purchase3.setProductTaxesRate("121.32");
            purchase3.setProductDiscountPrice("121.32");
            purchase3.setPurchaseTotalPrice("50.32");
            purchase3.setInvoiceRequired("true");
            purchase3.setCardToken("3232"); //Token de la tarjeta de crédito previamente creado con sipay
            purchase3.setTransactionId("32232");
            purchase3.setEndString("21/12/2018");
            purchase3.setStartString("12/12/2018");
            purchase3.setParkingDescription("Parking Saba Passeig de Gracia-Consell de Cent");
            purchase3.setProductDescription("Saba Tempo 10h Gold");

            Purchase purchase4 = new Purchase();
            purchase4.setId("3235");
            purchase4.setPurchaseDate("22/12/2018");
            purchase4.setExpirationDate("10/08/2018");
            purchase4.setProductLocalizator("201856454");
            purchase4.setProductSICASCode("5713");
            purchase4.setParkingCode("825");
            purchase4.setUserCode("2443");
            purchase4.setProductTotalPrice("110.5");
            purchase4.setProductTotalPriceWithoutTaxes("122.32");
            purchase4.setProductTaxesAmount("120.32");
            purchase4.setProductTaxesRate("120.32");
            purchase4.setProductDiscountPrice("122.32");
            purchase4.setPurchaseTotalPrice("110.5");
            purchase4.setInvoiceRequired("true");
            purchase4.setCardToken("3232"); //Token de la tarjeta de crédito previamente creado con sipay
            purchase4.setTransactionId("32232");
            purchase4.setEndString("16  /12/2018");
            purchase4.setStartString("14/12/2018");
            purchase4.setParkingDescription("Parking Saba Estación Tren Madrid - Atocha");
            purchase4.setProductDescription("Saba Weekend");

            Purchase purchase5 = new Purchase();
            purchase5.setId("3236");
            purchase5.setPurchaseDate("31/01/2019");
            purchase5.setExpirationDate("10/03/2019");
            purchase5.setProductLocalizator("201856454");
            purchase5.setProductSICASCode("4750");
            purchase5.setParkingCode("826");
            purchase5.setUserCode("2443");
            purchase5.setProductTotalPrice("125.5");
            purchase5.setProductTotalPriceWithoutTaxes("230.32");
            purchase5.setProductTaxesAmount("50.32");
            purchase5.setProductTaxesRate("21");
            purchase5.setProductDiscountPrice("250.32");
            purchase5.setPurchaseTotalPrice("125.5");
            purchase5.setInvoiceRequired("true");
            purchase5.setCardToken("3232"); //Token de la tarjeta de crédito previamente creado con sipay
            purchase5.setTransactionId("32235");
            purchase5.setEndString("16/01/2019");
            purchase5.setStartString("14/01/2019");
            purchase5.setParkingDescription("Parking Saba Estación Tren Málaga");
            purchase5.setProductDescription("Saba Multidia");

            Purchase purchase6 = new Purchase();
            purchase6.setId("3237");
            purchase6.setPurchaseDate("22/12/2018");
            purchase6.setExpirationDate("10/08/2018");
            purchase6.setProductLocalizator("201856454");
            purchase6.setProductSICASCode("4719");
            purchase6.setParkingCode("830");
            purchase6.setUserCode("2443");
            purchase6.setProductTotalPrice("110.5");
            purchase6.setProductTotalPriceWithoutTaxes("122.32");
            purchase6.setProductTaxesAmount("122.32");
            purchase6.setProductTaxesRate("122.32");
            purchase6.setProductDiscountPrice("122.32");
            purchase6.setPurchaseTotalPrice("110.5");
            purchase6.setInvoiceRequired("true");
            purchase6.setCardToken("3232"); //Token de la tarjeta de crédito previamente creado con sipay
            purchase6.setTransactionId("32232");
            purchase6.setEndString("16/12/2018");
            purchase6.setStartString("14/12/2018");
            purchase6.setParkingDescription("Parking Saba Estación Tren Pontevedra");
            purchase6.setProductDescription("Saba Tempo 1h");

	        listaProductos.add(purchase);
            listaProductos.add(purchase2);
            listaProductos.add(purchase3);
            listaProductos.add(purchase4);
            listaProductos.add(purchase5);
            listaProductos.add(purchase6);
	        //findPurchasesByUserResponse.setS_sabalist_prodsVenta(listaProductos);
		}*/
		findPurchasesByUserResponse.setS_cod_error(null);
		return findPurchasesByUserResponse;
	}
    
    
    
    public static NonPaymentResponse mockConsultaImpagosCliente(NonPaymentRequest request){

    	NonPaymentResponse response = new NonPaymentResponse();
    	NonPayment nonPayment = new NonPayment();
    	NonPayment nonPayment2 = new NonPayment();
    	
    	if(request.getP_cod_cli()==null && request.getP_txt_nif()==null && request.getP_email()==null) {
    		response.setS_cod_error("1212");
    		response.setS_impago(null);
    		response.setS_importe_total(null);
    		response.setS_lista_impagos(null);
    	}else {
			if (request.getP_email().equalsIgnoreCase("usuario.verified@intelygenz.com")) {
				nonPayment.setS_fecha_emision("2018/12/02");
				nonPayment.setS_num_factura("12121");
				nonPayment.setS_importe("1204.4");

				nonPayment2.setS_fecha_emision("2018/10/02");
				nonPayment2.setS_num_factura("12161");
				nonPayment2.setS_importe("30.0");

				response.setS_cod_error(null);
				response.setS_impago("S");
				response.setS_importe_total("1234.4");
				List<NonPayment> lista_impagos = new ArrayList<NonPayment>();
				lista_impagos.add(nonPayment);
				lista_impagos.add(nonPayment2);

				response.setS_lista_impagos(lista_impagos);
			} else {
				response.setS_impago("N");
				response.setS_lista_impagos(null);
			}
    	}
    	return response;
    }

    public static AddCustomerResponse mockAddCustomer(AddCustomerRequest request){

        AddCustomerResponse addCustomerResponse = new AddCustomerResponse();

        addCustomerResponse.setS_cod_cli("180444");
        addCustomerResponse.setS_cod_error(null);

        return addCustomerResponse;

    }
    public static GetCustomerResponse mockGetCustomer(GetCustomerRequest request){
        CustomerS customerS = new CustomerS();
        GetCustomerResponse getCustomerResponse = new GetCustomerResponse();

        customerS.setS_apellido_1("Verificado");
        customerS.setS_apellido_2("Verificado2");
        customerS.setS_cod_cli("180444");
        customerS.setS_cod_postal("28080");
        customerS.setS_direccion_fiscal("Gran Vía 30");
        customerS.setS_nacionalidad("ES");
        customerS.setS_partita_iva(null);
        customerS.setS_pec(null);
        customerS.setS_poblacion("MADRID");
        customerS.setS_telefono(910000000);
        customerS.setS_nombre("Usuario");
        customerS.setS_txt_nombreCompleto("Usuario Verificado Verificado");
        customerS.setS_txt_nif("00000001T");
        customerS.setStreetType("AV");
        customerS.setStreet("Ciudad Real");
        customerS.setStreetNumber("13");
        customerS.setProvince("TOLEDO");
        
        
        getCustomerResponse.setS_cod_error(null);
        getCustomerResponse.setS_datos_cliente(customerS);


        return getCustomerResponse;

    }
    
	public static VincultaAbnViaTResponse mockGetVincultaAbnViaT(VincultaAbnViaTRequest request) {

		VincultaAbnViaTResponse vincultaAbnViaTResponse = new VincultaAbnViaTResponse();

		if (request.getP_org_id() != null && request.getP_cod_idioma() != null && request.getP_cod_usu() != null
				&& request.getP_cod_cli() != null && request.getP_cod_viat() != null
				&& request.getP_loc_venta() != null) {
			vincultaAbnViaTResponse.setS_cod_error(null);
		} else {
			vincultaAbnViaTResponse.setS_cod_error("SVD-002");
		}
		return vincultaAbnViaTResponse;
	}
    
	public static UserChangeEmailResponse mockGetChangeEmail(UserChangeEmailRequest request) {

		UserChangeEmailResponse userChangeEmailResponse = new UserChangeEmailResponse();

		userChangeEmailResponse.setS_cod_error(null);
		
		return userChangeEmailResponse;
	}

    public static SetDetailCustomerResponse mockGetChangePhone(SetDetailCustomerRequest request) {

        SetDetailCustomerResponse detailCustomerResponse = new SetDetailCustomerResponse();

        detailCustomerResponse.setS_cod_error(null);

        return detailCustomerResponse;
    }
 
    public static GetObtenerFacturasClienteResponse mockGetObtenerFacturasCliente(
		GetObtenerFacturasClienteRequest request) {

		GetObtenerFacturasClienteResponse getObtenerFacturasClienteResponse = new GetObtenerFacturasClienteResponse();

		Bill bill1 = new Bill();
		bill1.setS_num_factura("10000");
		bill1.setS_fec_factura("10/02/2018");
		bill1.setS_producto("Producto1");
		bill1.setS_tipo_factura("Tipo de factura 1");
		bill1.setS_parking("Parking toledo");
		bill1.setS_importe("126.2");
		bill1.setS_estado("Pagado");
		bill1.setS_num_prefactura("5454");

		Bill bill2 = new Bill();
		bill2.setS_num_factura("10032");
		bill2.setS_fec_factura("01/08/2015");
		bill2.setS_producto("Abono1");
		bill2.setS_tipo_factura("Tipo de factura 3");
		bill2.setS_parking("Parking madrid");
		bill2.setS_importe("546.2");
		bill2.setS_estado("Pendiente");
		bill2.setS_num_prefactura("43242");

		Bill bill3 = new Bill();
		bill3.setS_num_factura("98732");
		bill3.setS_fec_factura("02/12/2017");
		bill3.setS_producto("Abono3");
		bill3.setS_tipo_factura("Tipo de factura 23");
		bill3.setS_parking("Parking bilbao");
		bill3.setS_importe("53.2");
		bill3.setS_estado("Pendiente");
		bill3.setS_num_prefactura("98768");
		
		Bill bill4 = new Bill();
		bill4.setS_num_factura("9873455");
		bill4.setS_fec_factura("02/10/2017");
		bill4.setS_producto("Abono4");
		bill4.setS_tipo_factura("Tipo de factura 4");
		bill4.setS_parking("Parking bilbao");
		bill4.setS_importe("553.2");
		bill4.setS_estado("Pendiente");
		bill4.setS_num_prefactura("9875468");
		
		Bill bill5 = new Bill();
		bill5.setS_num_factura("95422");
		bill5.setS_fec_factura("06/09/2017");
		bill5.setS_producto("Abono5");
		bill5.setS_tipo_factura("Tipo de factura 5");
		bill5.setS_parking("Parking gerona");
		bill5.setS_importe("23.2");
		bill5.setS_estado("Pendiente");
		bill5.setS_num_prefactura("2168");
		
		Bill bill6 = new Bill();
		bill6.setS_num_factura("24343");
		bill6.setS_fec_factura("12/05/2017");
		bill6.setS_producto("Abono6");
		bill6.setS_tipo_factura("Tipo de factura 6");
		bill6.setS_parking("Parking leon");
		bill6.setS_importe("32.2");
		bill6.setS_estado("Pendiente");
		bill6.setS_num_prefactura("7435");
		
		Bill bill7 = new Bill();
		bill7.setS_num_factura("34334");
		bill7.setS_fec_factura("02/09/2016");
		bill7.setS_producto("Abono7");
		bill7.setS_tipo_factura("Tipo de factura7");
		bill7.setS_parking("Parking barcelona");
		bill7.setS_importe("87.2");
		bill7.setS_estado("Pendiente");
		bill7.setS_num_prefactura("956568");

		List<Bill> billList = new ArrayList<Bill>();
		billList.add(bill2);
		billList.add(bill7);
		billList.add(bill6);
		billList.add(bill5);
		billList.add(bill4);
		billList.add(bill3);
		billList.add(bill1);

		getObtenerFacturasClienteResponse.setS_cod_error(null);
		getObtenerFacturasClienteResponse.setS_sabalist_facturas(billList);

		return getObtenerFacturasClienteResponse;
	}

	public static GetPdfFacturaClienteResponse mockGetPdfFacturaCliente(
			GetPdfFacturaClienteRequest request) {
		
		GetPdfFacturaClienteResponse getPdfFacturaClienteResponse = new GetPdfFacturaClienteResponse();
		
		byte[] data;
		String example = "example";
		data = example.getBytes();
//		Path pdfPath = Paths.get("src/file.pdf");
//		try {
//			data = Files.readAllBytes(pdfPath);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		/*
		String pdf_prueba = "JVBERi0xLjUNJeLjz9MNCjcgMCBvYmoNPDwvTGluZWFyaXplZCAxL0wgNzc0Mi9PIDkvRSAzNTE2\n" + 
				"L04gMS9UIDc0NTcvSCBbIDQ0NyAxMzZdPj4NZW5kb2JqDSAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"IA0xMyAwIG9iag08PC9EZWNvZGVQYXJtczw8L0NvbHVtbnMgNC9QcmVkaWN0b3IgMTI+Pi9GaWx0\n" + 
				"ZXIvRmxhdGVEZWNvZGUvSURbPDREQzkxQTE4NzVBNkQ3MDdBRUMyMDNCQjAyMUM5M0EwPjwzMjUy\n" + 
				"QkJGODg3MEI0QzYzOEZBMkVENTNFMjgxNzAwQj5dL0luZGV4WzcgMjFdL0luZm8gNiAwIFIvTGVu\n" + 
				"Z3RoIDUzL1ByZXYgNzQ1OC9Sb290IDggMCBSL1NpemUgMjgvVHlwZS9YUmVmL1dbMSAyIDFdPj5z\n" + 
				"dHJlYW0NCmjeYmJkEGBgYmAyBxIMNkCCsQFIMKcACTYHIPHlLAMTI8M0kCwDI7nEf8atXwACDABM\n" + 
				"EAbsDWVuZHN0cmVhbQ1lbmRvYmoNc3RhcnR4cmVmDTANJSVFT0YNICAgICAgICANMjcgMCBvYmoN\n" + 
				"PDwvRmlsdGVyL0ZsYXRlRGVjb2RlL0kgNjkvTGVuZ3RoIDU4L1MgMzg+PnN0cmVhbQ0KaN5iYGBg\n" + 
				"YWBg/M0ABNyWDKiAkQEky9GALMYCxQwMDQzcDNyTHnAGgDjMDAwy8hAtjMwAAQYAstgEfg1lbmRz\n" + 
				"dHJlYW0NZW5kb2JqDTggMCBvYmoNPDwvTWV0YWRhdGEgMSAwIFIvUGFnZXMgNSAwIFIvVHlwZS9D\n" + 
				"YXRhbG9nPj4NZW5kb2JqDTkgMCBvYmoNPDwvQ29udGVudHMgMTEgMCBSL0Nyb3BCb3hbMCAwIDU5\n" + 
				"NSA4NDJdL01lZGlhQm94WzAgMCA1OTUgODQyXS9QYXJlbnQgNSAwIFIvUmVzb3VyY2VzIDE0IDAg\n" + 
				"Ui9Sb3RhdGUgMC9UeXBlL1BhZ2U+Pg1lbmRvYmoNMTAgMCBvYmoNPDwvRmlsdGVyL0ZsYXRlRGVj\n" + 
				"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\n" + 
				"3QXtEelReBHnc6uh4Ff67sSBP3abvwcArRiH3QoNZW5kc3RyZWFtDWVuZG9iag0xMiAwIG9iag08\n" + 
				"PC9GaWx0ZXIvRmxhdGVEZWNvZGUvTGVuZ3RoIDIwOD4+c3RyZWFtDQpIiVSQvQ7CMAyE9z6FRxBD\n" + 
				"2s5VF1g68CMK7GniVpGIE7np0LcnKQXEEEv25dOdLfbNoSETQFzYqRYD9IY04+gmVggdDoagKEEb\n" + 
				"FdZuqcpKDyLC7TwGtA31DqoqE9cojoFn2LSz7dxzl29BnFkjGxpgcyvujzhoJ++faJEC5FDXoLHP\n" + 
				"xP4o/UlajPKKLvNiNXQaRy8VsqQBocqL+l2Q9L/2Ibr+3f6+VmVelnUWiY+W4LTJ11tNzDHWsu6S\n" + 
				"KGUwhN+LeOeTZXrZS4ABAEPIaT8KDWVuZHN0cmVhbQ1lbmRvYmoNMSAwIG9iag08PC9MZW5ndGgg\n" + 
				"MzQ2OC9TdWJ0eXBlL1hNTC9UeXBlL01ldGFkYXRhPj5zdHJlYW0NCjw/eHBhY2tldCBiZWdpbj0i\n" + 
				"77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+Cjx4OnhtcG1ldGEgeG1sbnM6eD0i\n" + 
				"YWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDE2IDkxLjE2MzYx\n" + 
				"NiwgMjAxOC8xMC8yOS0xNjo1ODo0OSAgICAgICAgIj4KICAgPHJkZjpSREYgeG1sbnM6cmRmPSJo\n" + 
				"dHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4KICAgICAgPHJkZjpE\n" + 
				"ZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIKICAgICAgICAgICAgeG1sbnM6ZGM9Imh0dHA6Ly9wdXJs\n" + 
				"Lm9yZy9kYy9lbGVtZW50cy8xLjEvIgogICAgICAgICAgICB4bWxuczp4bXA9Imh0dHA6Ly9ucy5h\n" + 
				"ZG9iZS5jb20veGFwLzEuMC8iCiAgICAgICAgICAgIHhtbG5zOnBkZj0iaHR0cDovL25zLmFkb2Jl\n" + 
				"LmNvbS9wZGYvMS4zLyIKICAgICAgICAgICAgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5j\n" + 
				"b20veGFwLzEuMC9tbS8iPgogICAgICAgICA8ZGM6Zm9ybWF0PmFwcGxpY2F0aW9uL3BkZjwvZGM6\n" + 
				"Zm9ybWF0PgogICAgICAgICA8ZGM6Y3JlYXRvcj4KICAgICAgICAgICAgPHJkZjpTZXE+CiAgICAg\n" + 
				"ICAgICAgICAgIDxyZGY6bGk+Y2RhaWx5PC9yZGY6bGk+CiAgICAgICAgICAgIDwvcmRmOlNlcT4K\n" + 
				"ICAgICAgICAgPC9kYzpjcmVhdG9yPgogICAgICAgICA8ZGM6dGl0bGU+CiAgICAgICAgICAgIDxy\n" + 
				"ZGY6QWx0PgogICAgICAgICAgICAgICA8cmRmOmxpIHhtbDpsYW5nPSJ4LWRlZmF1bHQiPlRoaXMg\n" + 
				"aXMgYSB0ZXN0IFBERiBmaWxlPC9yZGY6bGk+CiAgICAgICAgICAgIDwvcmRmOkFsdD4KICAgICAg\n" + 
				"ICAgPC9kYzp0aXRsZT4KICAgICAgICAgPHhtcDpDcmVhdGVEYXRlPjIwMDAtMDYtMjlUMTA6MjE6\n" + 
				"MDgrMTE6MDA8L3htcDpDcmVhdGVEYXRlPgogICAgICAgICA8eG1wOkNyZWF0b3JUb29sPk1pY3Jv\n" + 
				"c29mdCBXb3JkIDguMDwveG1wOkNyZWF0b3JUb29sPgogICAgICAgICA8eG1wOk1vZGlmeURhdGU+\n" + 
				"MjAxOS0wMy0yMVQxNjo1Mzo0MCswMTowMDwveG1wOk1vZGlmeURhdGU+CiAgICAgICAgIDx4bXA6\n" + 
				"TWV0YWRhdGFEYXRlPjIwMTktMDMtMjFUMTY6NTM6NDArMDE6MDA8L3htcDpNZXRhZGF0YURhdGU+\n" + 
				"CiAgICAgICAgIDxwZGY6UHJvZHVjZXI+QWNyb2JhdCBEaXN0aWxsZXIgNC4wIGZvciBXaW5kb3dz\n" + 
				"PC9wZGY6UHJvZHVjZXI+CiAgICAgICAgIDx4bXBNTTpEb2N1bWVudElEPnV1aWQ6MDgwNWUyMjEt\n" + 
				"ODBhOC00NTllLWE1MjItNjM1ZWQ1YzFlMmU2PC94bXBNTTpEb2N1bWVudElEPgogICAgICAgICA8\n" + 
				"eG1wTU06SW5zdGFuY2VJRD51dWlkOmFlYmY5MDJhLWM2NzEtZDY0MS05MWVkLWFhNWQwYjUwYWJl\n" + 
				"ZDwveG1wTU06SW5zdGFuY2VJRD4KICAgICAgPC9yZGY6RGVzY3JpcHRpb24+CiAgIDwvcmRmOlJE\n" + 
				"Rj4KPC94OnhtcG1ldGE+CiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAK\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAg\n" + 
				"ICAgICAgICAgICAKPD94cGFja2V0IGVuZD0idyI/Pg1lbmRzdHJlYW0NZW5kb2JqDTIgMCBvYmoN\n" + 
				"PDwvRmlsdGVyL0ZsYXRlRGVjb2RlL0ZpcnN0IDQvTGVuZ3RoIDQ4L04gMS9UeXBlL09ialN0bT4+\n" + 
				"c3RyZWFtDQpo3jJVMFCwsdF3zi/NK1Ew1PfOTCmOtgSKBcXqh1QWpOoHJKanFtvZAQQYANZ3C4AN\n" + 
				"ZW5kc3RyZWFtDWVuZG9iag0zIDAgb2JqDTw8L0ZpbHRlci9GbGF0ZURlY29kZS9GaXJzdCA0L0xl\n" + 
				"bmd0aCAxNjcvTiAxL1R5cGUvT2JqU3RtPj5zdHJlYW0NCmjePMvBCsIwEEXRX5mdDYKdtFqslEIx\n" + 
				"uBNcFLqOTYoDwYFkivj3ZlF83OU7DSB0XTms8uJYzM5S+KryGr0V4rex4gtzqTCvqVqNlcbzXusd\n" + 
				"4m57ZXWnOXLiRWDi6OB8QFXe2f2xbrGutG5O9RH3uOFHZLfOPhZDxk8rYCgJheAjHA8IC0eY6O34\n" + 
				"k1Q5kgRfjC9KkLMgPgk8zA0WCl71/U+AAQBnSztjDWVuZHN0cmVhbQ1lbmRvYmoNNCAwIG9iag08\n" + 
				"PC9EZWNvZGVQYXJtczw8L0NvbHVtbnMgMy9QcmVkaWN0b3IgMTI+Pi9GaWx0ZXIvRmxhdGVEZWNv\n" + 
				"ZGUvSURbPDREQzkxQTE4NzVBNkQ3MDdBRUMyMDNCQjAyMUM5M0EwPjwzMjUyQkJGODg3MEI0QzYz\n" + 
				"OEZBMkVENTNFMjgxNzAwQj5dL0luZm8gNiAwIFIvTGVuZ3RoIDM3L1Jvb3QgOCAwIFIvU2l6ZSA3\n" + 
				"L1R5cGUvWFJlZi9XWzEgMiAwXT4+c3RyZWFtDQpo3mJiYGBgYuTdw8TAd4OJgbEbiJmZGB8/YGJg\n" + 
				"YAQIMAAx7QQUDWVuZHN0cmVhbQ1lbmRvYmoNc3RhcnR4cmVmDTExNg0lJUVPRg0=";
		String pdf_prueba = "\\\"JVBERi0xLjQNCjUgMCBvYmoNCjw8DQovVHlwZSAvWE9iamVjdA0KL1N1YnR5cGUg&#xd;&#xa;L0ltYWdlDQovRmlsdGVyIC9GbGF0ZURlY29kZQ0KL0xlbmd0aCAyNjkNCi9XaWR0&#xd;&#xa;aCAyOA0KL0hlaWdodCA0Ng0KL0JpdHNQZXJDb21wb25lbnQgOA0KL0NvbG9yU3Bh&#xd;&#xa;Y2UgL0RldmljZVJHQg0KPj4NCnN0cmVhbQ0KeJztlrENhDAQBGmQPiiCEqjADZCT&#xd;&#xa;E5OSEhKS0YF/9da/Tpg/rw8IXvKEiFtuvZxt7wuFQuFZlmUZhqHrurquqw9t2zrn&#xd;&#xa;5nnOVUNJ0zSVCl7gBdGYrhZAt4zatm3Sps40TYxm0q9k3/ekILzEhX3fIylpZBxH&#xd;&#xa;eGEWc13XgxoK8fD0ZXTIGI9zQUvJKgV8N7Z8RRDAiGH9T4E7PmWJEhDmzqaJwl+a&#xd;&#xa;WX+jhIkvrrIt5h9p2nLXp9KWuxK6t+ZOzmw8RxeH3T8z7wAn1+2tYuM9aCr7Z4Dx&#xd;&#xa;cnq04aHc5/1790b04dhiuuUPuACjmXVukprKIlzU9Nw9BI6yNAPf+5KUwl+HxA33&#xd;&#xa;pUIuL4kMbG5lbmRzdHJlYW0NCmVuZG9iag0KNiAwIG9iag0KPDwNCi9UeXBlIC9Y&#xd;&#xa;T2JqZWN0DQovU3VidHlwZSAvSW1hZ2UNCi9GaWx0ZXIgL0RDVERlY29kZQ0KL0xl&#xd;&#xa;bmd0aCAxNTUxMQ0KL1dpZHRoIDQyNw0KL0hlaWdodCAyNDMNCi9CaXRzUGVyQ29t&#xd;&#xa;cG9uZW50IDgNCi9Db2xvclNwYWNlIC9EZXZpY2VSR0INCj4+DQpzdHJlYW0NCv/Y&#xd;&#xa;/+AAEEpGSUYAAQEBAGAAYAAA/+0ALFBob3Rvc2hvcCAzLjAAOEJJTQPtAAAAAAAQ&#xd;&#xa;AEgAAAABAAEASAAAAAEAAf/hAEpFeGlmAABJSSoACAAAAAMAGgEFAAEAAAAyAAAA&#xd;&#xa;GwEFAAEAAAA6AAAAKAEDAAEAAAACAD8AAAAAAAAASAAAAAEAAABIAAAAAQD/2wBD&#xd;&#xa;AAgGBgcGBQgHBwcJCQgKDBQNDAsLDBkSEw8UHRofHh0aHBwgJC4nICIsIxwcKDcp&#xd;&#xa;LDAxNDQ0Hyc5PTgyPC4zNDL/2wBDAQkJCQwLDBgNDRgyIRwhMjIyMjIyMjIyMjIy&#xd;&#xa;MjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjL/wAARCADzAasD&#xd;&#xa;ASIAAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAA&#xd;&#xa;AgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAk&#xd;&#xa;M2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlq&#xd;&#xa;c3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXG&#xd;&#xa;x8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEAAwEBAQEBAQEB&#xd;&#xa;AQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx&#xd;&#xa;BhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5&#xd;&#xa;OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaX&#xd;&#xa;mJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq&#xd;&#xa;8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD3+iiigAooooAKKKKACiiigAooooAKKKKA&#xd;&#xa;CiiigAooooAKKKKACiiigAooooAKqajqVnpNobq+mEMIO3cQTz6YFW64/wCJX/Ir&#xd;&#xa;J/18p/JqqC5pJHPiqro0ZVI7pFPUPidYxZWws5bhv78h2L/Un9K5XUPHuvX+VS4W&#xd;&#xa;1jP8Nuu0/wDfRyf1rmKK7Y0oR6Hx1bM8VV3lZeWh9A6SzSaNYu7Fma3jJYnJJ2ir&#xd;&#xa;lUtG/wCQHp//AF7R/wDoIq7XC9z7al8C9AooopFhRRRQAUUUUAFFFFABRRRQAUUU&#xd;&#xa;UAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUU&#xd;&#xa;UAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFcf8Sv+RWT/r5T+TV2Fcf8Sv8AkVk/&#xd;&#xa;6+U/k1XT+NHHmP8AutT0PIqKKK9E+DPoDRv+QHp//XtH/wCgirtUtG/5Aen/APXt&#xd;&#xa;H/6CKu15j3P0Wl8EfQKKKKRYUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFF&#xd;&#xa;FABRRRQAUUUUAFFFFABRRRQAUUUUAFFUNS1rTtIj3313HDkZCk5Y/RRya5O8+J9h&#xd;&#xa;ExWzsZ58fxOwjB/maqMJS2Ry1sbQoaVJJP8AH7ju6K8uk+KN+W/dafbKP9pmb/Cm&#xd;&#xa;/wDC0NU/58bP/wAe/wAa09hM5HnWE7v7mep0V5vb/FNt2LrSxj+9FL0/Aj+tdHpv&#xd;&#xa;jrQtRIQ3JtpD/DcDb/490/WpdKa3RvSzLC1XaM1fz0/M6WikVgyhlIIIyCO9LWZ3&#xd;&#xa;BRRRQAUVHNPDbRNNPKkUa9XdgoH4muW1D4iaHZlkhaW7ccfulwufqcfpmqjFy2Rj&#xd;&#xa;WxFKir1JJHW0V5pP8U5yT9n0uNR2Mkpb+QFVv+Foap/z42f/AI9/jV+wn2OF5zg1&#xd;&#xa;9r8GeqUV5fH8Ub4H97p1sw/2WZf8a1rL4n6dKwW8sp7fP8SMJAP5H9KHRmuhUM2w&#xd;&#xa;k3bnt6pndUVR07WNP1aLzLG7jmAGSFPzD6g8j8avVk1bc9CMozXNF3QUUUUFBXH/&#xd;&#xa;ABK/5FZP+vlP5NXYVx/xK/5FZP8Ar5T+TVdP40ceY/7rU9DyKiiivRPgz6A0b/kB&#xd;&#xa;6f8A9e0f/oIq7XHw+N9D0zR7OJ7lp5kt41aOBdxBCjucD9aybn4p/MRa6Xkdmll/&#xd;&#xa;oB/WvP8AZTb0R9v/AGjhaUEpTV7dNfyPRqK8s/4WhqeeLGzx/wAC/wAacnxR1AN+&#xd;&#xa;80+1Yeilh/U1XsJmf9tYTu/uZ6jRXAWnxRtXIF5p00Q7tE4f9Diur0vxFpWsjFle&#xd;&#xa;I7/882+V/wAjz+VRKnKO6OqjjsPWdqc03935mpRRRUHWFFFFABRRWHqfi3RdJLJc&#xd;&#xa;XivKOsUPztn0OOB+OKaTexnUqwprmm0l5m5RXnt18UoVYiz0yRx2aaQL+gB/nWe3&#xd;&#xa;xQ1Ld8thaAehLH+taKjN9DglnGEi7c1/kz1KivLF+KGpBhusLQj0G4f1q9bfFNCQ&#xd;&#xa;LrS2A7tFLn9CP60OjPsEc4wcnbmt8mei0VgaX4y0TVnWOK68qZukU42E/Q9D+Brf&#xd;&#xa;rNprc76dWnVXNTd15BRRRSNAooooAKKKz9T1rT9IjDXtysZIyqdWb6Ac1M5xguaT&#xd;&#xa;sioQlOXLBXZoUVwd58SolYrZaezj+/M+39Bn+dUk+JN8G+ewt2X0VmB/PmuCWa4V&#xd;&#xa;O3N+DPTjkuNkr8lvmj0miub0Pxnp+syrbsrW1y33Y3OQ3sG7n8q6SuylWp1o81N3&#xd;&#xa;RwVqFShLkqqzCuD8X+OjYSvp2lMpuVyss/URn0Hqf5fy2/GWttomgSSQttuZj5UR&#xd;&#xa;7gkct+Az+OK8UJJJJOSepNdtGmpe8z5vOMxlR/c0nZvd9h808tzM008rySucs7tk&#xd;&#xa;k/Wo6K0tL0DU9ZbFjaPIoODIeFH/AAI8V1tpLU+YjCdSVoq7Zm0V28Hwx1ZwDNdW&#xd;&#xa;kWewZmI/SpH+F2ogfu7+1Y/7QYf0NR7WHc61lmLavyM4Siupu/h94gtQSkEVwB/z&#xd;&#xa;xkH8jg1zt1ZXVjL5V3bywP8A3ZEKn9apSi9mc9XD1qX8SLRo6N4m1TQ3H2S4Jhzk&#xd;&#xa;wyfMh/Dt+GK9n0e9l1LSLW9mg8h5ow/l7s4B6c+4wfxrw/RdObVtZtLFc/vZAGI7&#xd;&#xa;L1Y/kDXviIsaKiKFVQAAOwrmxFtO59DkLqyjJt+6tEvP+vzHVh+K9audB0Vry2t1&#xd;&#xa;mfeEJYnCZ/iIHXnA7da3Kp6pYJqml3NlJjbNGVyex7H8Dg1zxtfU9yvGcqclTdnb&#xd;&#xa;Q8M1PWL/AFifzr65eU54UnCr9B0FUakmhkt55IZV2yRsUYehBwasWOl3+pvssrSa&#xd;&#xa;c9CUUkD6noK9HRI+AftKk9buX4lOiuvtfhvrs6gy/Zrf2kkyf/HQRV5fhdf7fm1G&#xd;&#xa;2B9ArGpdWC6nVHLcXJXVNnBUV2Vz8NNahUtDLaz4/hVypP5gD9a5e+0680y4MF7b&#xd;&#xa;yQSDs46j1B7j6U4zjLZmNbC1qOtSLRHbXU9ncLPbTPFKhyrocEV6r4O8aLrO2wvy&#xd;&#xa;qX4HyMBgTAfyPtXklPilkgmSaJykiMGVgeQR0IpTpqaNcFjamFneO3VH0VRWR4a1&#xd;&#xa;ldd0OC84Ev3JlHZx1/ofxrXrgas7M+4p1I1IKcdmFcf8Sv8AkVk/6+U/k1dhXH/E&#xd;&#xa;r/kVk/6+U/k1VT+NHNmP+61PQ8iooor0T4MKKntbO6vpfKtbeWeT+7GhY/pXRWnw&#xd;&#xa;+8QXQBeCK3B6GaQfyGTUuSW7NqWHrVf4cWzlqK7tPhdqJH7y/tVP+yGP9BUU/wAM&#xd;&#xa;tXjUmG5tJcdtzKT+Yx+tT7WHc6HlmLSvyM4mnI7RuHRirKchlOCDVzUtH1DSJhFf&#xd;&#xa;2skJPQnlW+hHBqjVpp7HHKMoStJWZ6R4P8dvLKmnaxKCzYWK5bufRv8AH8/WvRa+&#xd;&#xa;cq9j8Ca82saN5M77rq1wjk9WX+Fv6fhXLWpJe8j6bJ8xlUfsKru+j/Q6qkOQDgZN&#xd;&#xa;LRXMfQHjPiHxjrGqTy2zMbOBWKNBGcHjqGbqf5e1cxXWfEHSv7P8RtcIuIrxfNHH&#xd;&#xa;G7ow/PB/GuWjikmkEcUbO7HAVBkn8K9GnblTR8Fjfa+3lGq22mMorpbLwJ4gvVDf&#xd;&#xa;ZBboe87hf06/pWrH8L9TI/e31ov+7ub+gpOpBdRwy/FTV4wf5fmcLRXcy/C/U1H7&#xd;&#xa;q+tHOP4ty/0Nc/qvhXWNGQyXdo3kjrLGd6j646fjTVSL2ZNXA4mkrzg7GNXX+FvH&#xd;&#xa;F1pMqWt+7z2B4yTlovceo9vyrkKKcoqSszOhiKlCfPTdmfRMM0dxCk0Lh45FDKyn&#xd;&#xa;gg9DUleb/DbXm8x9FnclSDJbknp/eX+v516RXBOHJKx9xg8THE0VUXz9QoormvGW&#xd;&#xa;vto2mCK3bF3cZVCOqDu3+H/1q561WNGDqS2R6FChOvUVKG7KPirxmNOZ7DTSr3Q4&#xd;&#xa;kl6iP2Hqf5V5vPPLczPNPI0kjnLO5yTTAGd8AFmY/Uk16T4Y8EQ2saXmqxiW4Iys&#xd;&#xa;DcrH9fU/oK+YviMyq6bL7l/wT7K2Fymhd6t/e/8Agf1ucTp/hzVtUUPa2UjRnpI2&#xd;&#xa;FU/Qnr+FWNQ8I6zpts1xNbBolGWaNw20epHWvYgMcCo7mSKG1mknx5KIWfPTaBzX&#xd;&#xa;o/2LRUNZO/c8j/WHEOorQVu2t/v/AOAeDAlWDKSCDkEdq9a0LxNBc6JayXkh+0bd&#xd;&#xa;r8dSCRn8cZryQ9eOldhonh26vtIguYwdr7sfgxH9K8zLatWnUapq+h7Ob0KNSlF1&#xd;&#xa;Xaz3F+KVwzX+n22flSJpPxJx/wCy1wFd38UIius2U2OHt9ufoxP/ALNXCV97R+BH&#xd;&#xa;4bmjbxc7/wBaGl4f00avr1nYsSElf58ddoBJ/QGvdra2hs7eO3t41jhjG1UUcAV4&#xd;&#xa;b4Z1GPSvEdjeTHESPhz6BgVJ/DNe6qyyIrowZWGQQcgj1rDEXuux7GQKHs5v7V/w&#xd;&#xa;/q46iiiuc+gCobq0t72Aw3UEc0R6pIoYfrU1FAmk1ZmBpfhHTNH1d9Qs1dGZCgjL&#xd;&#xa;ZVMnkjPPat+iim23uRTpQpLlgrIKKKKRoc7L4K0e51qfU7mJpnlYN5TH92Dgc4HX&#xd;&#xa;PXn1rfihigiWKGNI41GFRFwB9AKfRTcm9zKnRp023CKV9woorJ1HxNo2lbhdX8Qk&#xd;&#xa;XrGh3t+Q5FCTexU6kKa5puy8zWrP1jR7TW9Pe0u4wQQdj4+aNvUVxuo/FCFdy6bY&#xd;&#xa;u57STttH/fI/xFcnqHjTXtRyHvmhjP8ABb/IPzHP5mto0Z77Hk4nN8IouHxX+4yt&#xd;&#xa;RsJtM1GeyuBiWFyp9D6EexHP41VpWYsxZiSx5JJ60ldiPkZWbdtjvfhjqJi1K609&#xd;&#xa;j8k0fmKCf4l/xB/SvUK8N8IXJtPFmmuDjdMIz/wL5f617lXHXVpXPrsjqueG5X9l&#xd;&#xa;/wDBCuP+JX/IrJ/18p/Jq7CuP+JX/IrJ/wBfKfyas6fxo7cx/wB1qeh5FRRRXonw&#xd;&#xa;Z73oNvDb6FYrDEkYaBGIRQMkqMk+9aVUtG/5Aen/APXtH/6CKu15j3P0SkkqcUuw&#xd;&#xa;UUUUjQq3+n2up2clpdxCSFxyD29x6GvDtd0mTRNYnsZMkIcox/iU8g173XnHxSsg&#xd;&#xa;DYXyjk7oXP6r/wCzVvQk1Kx4ud4aM6HtUtY/kec103gPUTYeKYELYjuQYW+p+7+o&#xd;&#xa;H51zNTWtw1reQXCfeikVx9Qc11yV00fL4eq6VWNRdGfQ9FIrBlDDkEZFLXmn6EZG&#xd;&#xa;veHrPxDBBFdl1EMm8GM4JGMEZ9Dx+VWNN0bT9Ii8uxtI4eMFgMs31Y8mr9FPmdrG&#xd;&#xa;So01P2nKubuFFFVrzULPT4/MvLqGBfWRwufp60jRyUVdlmkZQylWAZSMEEcGuO1H&#xd;&#xa;4kaPa5W0Sa8cd1GxPzPP6Vyeo/EbWrvK23lWaHpsXc2Pqf6AVrGjNnm182wtLTmu&#xd;&#xa;/LX/AIAeO/DMei3qXlmm2zuCRsHSN/T6HqPoa5CrF1e3V9L5l3cyzv6yOWx+dV67&#xd;&#xa;YppWZ8jialOpVc6cbJ9C3pl8+m6nbXsf3oZFfHqAeR+I4r6AjdZY1kQ5RwGU+oNf&#xd;&#xa;Ole6eE7k3fhXTZSckQhCf935f6Vz4laJnt5BVfNOl8zZrx/xnete+J7oEnZARCg9&#xd;&#xa;Mdf1zXsFeLeJ7drbxNqCMCN0zSDPo3zf1r5zO3JUYpbXP0bh2MXiJN72/U2vh9pU&#xd;&#xa;d5qkt7KoZbUDYD/fOcH8AD+len15H4S8SpoFxMlxEz20+NxT7ykZwffrXZTfEDRI&#xd;&#xa;490ZnlbH3Vjx/PFTlmJw9LDpOST6/wBeg84wmLrYpuMW1pa39dzqq888b+KUmR9J&#xd;&#xa;sZNy5xcSKeDj+EH+f5etZeueN7/VUaC3H2S2bghDlmHuf6CuahhkuJkihjaSRzhV&#xd;&#xa;UZJPtXPj80VSPsqGz6/5HXlmTOjJVsRutl282S2FlNqN9DaQLullbaPb1J9h1r2+&#xd;&#xa;xtI7CxgtIvuQoEHvjvWB4S8LrokBuLnDX0q4bHIjH90e/qa6eu7K8E6EHOfxP8Ee&#xd;&#xa;bnOYLE1FCn8MfxZx/wARdJa/0FbqJS0tmxc4HOw/e/kD+FeRV9GMoZSrAMpGCCOD&#xd;&#xa;Xk3i/wAFTaXLJfadG0ti3zMi8mH/AOx9+3f1r36FRL3WfA51gZSl9Ypq/f8AzOMr&#xd;&#xa;f0Txhq2hqsUMomth0hmGQPoeo/lWBRXQ0mrM+fpVZ0pc1N2Z6nYfE7T5sLfWc1u3&#xd;&#xa;dkIkX+h/Q109h4g0nU8fZNQgkY9ELbW/75ODXgtFYyw8XsetRzzEQ0mlL8P6+4+j&#xd;&#xa;aK8L03xVrWlEC3vpGjH/ACzlO9fyPT8MV3Oi/Em0uSsOqw/ZZDx5seWjP1HUfrWM&#xd;&#xa;qEltqexh85w9V2l7r89vvO7opkUsc8SyxOrxuMqynII9QafWJ624UUUhIUEkgAdS&#xd;&#xa;aAFrkNe8f6dpbNBZj7bcjg7Gwin3bv8Ah+lcx4x8bS6hLJp+myFLNSVeVTzN9D/d&#xd;&#xa;/nXEV006F9ZHzmPzpxbp4f7/API29V8WazrBYT3bJCf+WMPyL9OOT+OaxKKlgt57&#xd;&#xa;qURW8Mk0h6JGpYn8BXSkktD56dSpVlebbZFRXVaf8PtdvcNLFHaRnvM3P5DJ/PFd&#xd;&#xa;Vp/wy06DDX1zNdN3Vf3a/wBT+oqJVoLqdlHK8VV2jZeen/BPK6K9B+IWjadpWl2A&#xd;&#xa;sbSKD96wJQcsMdz1P4159VQlzK6OfFYaWGqulJ3aLOnS+TqdrL/cmRvyIr6Er50j&#xd;&#xa;fy5FcDO0g19F1z4noe7w+9Ki9P1CuP8AiV/yKyf9fKfyauwrj/iV/wAisn/Xyn8m&#xd;&#xa;rGn8aPXzH/danoeRUUUV6J8GfQGjf8gPT/8Ar2j/APQRV2qWjf8AID0//r2j/wDQ&#xd;&#xa;RV2vMe5+i0vgj6BRRRSLCuO+JUQk8Lq/eO4Rv0I/rXY1y3xCUHwhcEjkPGR/30Ku&#xd;&#xa;n8aOTHq+FqejPG6KKK9E+CPoDR5PO0TT5f79tG35qKu1l+GmL+GNLJ/59Yx+SgVq&#xd;&#xa;V5kt2folF3pxfkgrK1nxDp2gw772bDkfJEnLt9B/U8VmeL/Fsfh+3+z2+2TUJVyq&#xd;&#xa;nkRj+8f6CvILq6nvbl7i5laWZzlnc5JranR5tXseVmObRw79nT1l+COr1f4iarfl&#xd;&#xa;o7ICyhPdOZCP97t+FclNPLcSmWaV5ZG6u7FifxNR0V1xio7Hy9bE1a7vUlcKK2tO&#xd;&#xa;8J63qeDBp8qxn/lpKNi49eev4V1en/C5zhtS1AL6x265/wDHj/hUyqRjuzWjl+Jr&#xd;&#xa;fBB2+78zzqivZW8G6Hp+lXZhslaXyHxLN85B2nkZ4B+mK8aohUU9h4zA1MJyqbWv&#xd;&#xa;YK9i+HcvmeEolz/q5XX9c/1rx2vXfhr/AMis/wD18v8AyWoxHwHXkbtivk/0Owrl&#xd;&#xa;/FnhUa6i3Nsypexjb83SRfQ+h9DXUUV5tajCtBwmtGfbYfEVMPUVSm7NHhl5pGoa&#xd;&#xa;e5S6s5oiO5Q4P0PQ1BDbT3BxBBJKfRELfyr3qivGeRxvpPT0PfXEk+XWmr+v/A/U&#xd;&#xa;8l0zwPrF+waaIWkR6tNw3/fPX88V6Dofhmw0JMwIZLgjDTv94+w9BWzRXfhsuoYd&#xd;&#xa;8yV33Z5mMzXEYpcsnaPZfqFFFFd55oUUUUAc5qvgjRNVLSG3NtMf+WluduT7jp+m&#xd;&#xa;a4/UPhlqEG5rC6huV7K/yN/UfqK9TorSNWcepwV8sw1bWUbPutDwK/0TU9LP+m2M&#xd;&#xa;0K/3yuV/76HFZ9fRhAIwRkVg6n4M0PVMtJZrBKf+Wlv8h/LofxFbRxH8yPIr5BJa&#xd;&#xa;0ZX8n/meI0V1XiTwPe6FE11DILqzB5cDDJ/vD09x+lcrXRGSkro8KtQqUJ8lRWZ0&#xd;&#xa;/hDxVNoV6kE7s2nyth0J/wBWT/EP6+teyqwZQykEEZBHevnOvbfBd6194Usnc5eN&#xd;&#xa;TE3/AAE4H6YrmxEF8SPoMixUpN0JPbVHQVxXxF1xrDSk06Bts13neQeRGOv59Ppm&#xd;&#xa;u1rxnx9dm68W3K5ysCrEvPtk/qTWdGPNM783rujhny7y0OYoorofBelJq3iW3imU&#xd;&#xa;NDCDNIp7heg+mSK7ZOyufH0aTq1FTju3Y2/C/wAP2voo77Vi0cDANHApwzj1J7D2&#xd;&#xa;6/SvR7HTrPTYBDZW0cEfoi4z9T3/ABq1RXBOpKb1PuMLgaOGjaC179QoooqDsOB+&#xd;&#xa;KX/IN0//AK7N/KvMK9P+KX/IN0//AK7N/KvMK7qHwHxec/75L5fkFfRtfOVfRtZ4&#xd;&#xa;noehw9/y8+X6hXH/ABK/5FZP+vlP5NXYVx/xK/5FZP8Ar5T+TVhT+NHsZj/utT0P&#xd;&#xa;IqKKK9E+DPoDRv8AkB6f/wBe0f8A6CKu1S0b/kB6f/17R/8AoIq7XmPc/RaXwR9A&#xd;&#xa;ooopFhXK/EN9vhGcY+9JGP1z/SuqrifibOE8PW8OfmkuQfwCt/8AWq6fxo48wly4&#xd;&#xa;Wo/I8oooor0T4M968OqF8M6WB0+yRH81BqzqN9FpunXF7N/q4ULkeuO349KXT4jB&#xd;&#xa;ptrCc5jhRDn2AFcr8SrsweG44FPNxOqsPVQCf5gV5yXNOx97VqfV8K59Ujy/UL6f&#xd;&#xa;U7+a8uW3SzNuY+noB7AcVVoor0Nj4OUnJtvc2/Dvhq88RXRSHEcCY82dhkL7D1Pt&#xd;&#xa;Xq2jeE9J0RVaC3Ek46zy/M2fb0/CrPh/S49G0S2s0UBlQNIf7zkfMfzrTrhqVXJ2&#xd;&#xa;Wx9ll+W08PBSkrz/AC9AooorI9Urah/yDbv/AK4v/wCgmvnuvoTUP+Qbd/8AXF//&#xd;&#xa;AEE18911YbZnzPEHxU/n+gV678Nf+RWf/r5f+S15FXrvw1/5FZ/+vl/5LV1/gOXI&#xd;&#xa;/wDevkzsKKKK4j7AKKKKACiiigAooooAKK5Xxv4jn0CythZsouppMjcuRsHXj6kf&#xd;&#xa;rWVpfxOtpAE1S0aFu8sPzL+R5H61oqcmuZHDUzHD06rozlZ/gd/RWdY69pOpAfZN&#xd;&#xa;Qt5Cf4N+G/75PNaNQ01udkJxmrxd0FFFRyzRQRmSaRI0HVnYAD8TSKbtuRX6Ryad&#xd;&#xa;dJLjy2iYPn0wc18916X4x8cWj2M2m6XKJpJQUlmX7qr3APcn16V5pXZQi0m2fJZ3&#xd;&#xa;iadWrGNN3t1CvXfhsSfCzZPS5f8AkteRV7T4Fs2s/CVpvGGm3SkexPH6Yp4j4Cci&#xd;&#xa;i3iW+yf6HSV4b4vGPFmpf9dj/IV7lXkHxFsTa+J2uMfJdRq4PuBtI/QH8axw7949&#xd;&#xa;TPYN4dSXRnI12nwykVPEs6NjL2rBT77lOP8APpXF1d0nUptI1SC+g5eJs7T0YdCD&#xd;&#xa;9RXVNc0Wj5rCVlRrxqPZM+gKKyNG8SabrkCta3CiUjLQOcOp+nf6itevPaa0Z97T&#xd;&#xa;qQqR5oO6CiiqN1rWl2QP2nULaI+jSjP5daSVxynGKvJ2OP8Ail/yDdP/AOuzfyrz&#xd;&#xa;Cu58e+JNM1q3tbewmaYxSFmbYQvTHGa4au+imoanxWa1IVMVKUHdafkFfRtfOVfR&#xd;&#xa;tZYnoenw9/y8+X6hXH/Er/kVk/6+U/k1dhXH/Er/AJFZP+vlP5NWFP40exmP+61P&#xd;&#xa;Q8iooor0T4M+gNG/5Aen/wDXtH/6CKu1yugeL9Dl020tmvkhmihRGWYbBkADqeP1&#xd;&#xa;rpoZ4rhA8MqSJ/eRgR+lebKLT1P0DD1qdSC5JJ6ElFFISAMk4FSdAteVfEzUluNY&#xd;&#xa;t7BGyLWMl8f3mwcfkB+ddZ4h8b6dpEDx20qXV7jCohyqn1Yj+XWvILi4lu7mS4nc&#xd;&#xa;vLIxZ2PcmumhTd+ZnzudY6Dp+wg7t7kVXdJtDf6xZ2gGfNmVT9Cef0qlXbfDbSzc&#xd;&#xa;63JqDr+6tUIU/wC23H8s/pXROXLFs8HCUXWrxprq/wAOp6vXAfFIN/Z+nnPy+awI&#xd;&#xa;98DH9a7+uT+Idi154WeVAS1tKsvHpyD/ADz+FcVJ2mj7LMoOeEml2/LU8epyMFkV&#xd;&#xa;iMgEHHrTaK7z4U+i0dZEV1OVYZB9RTq4PwX4ztJNPh0zUplgnhASOSQ4V1HQZ7Ed&#xd;&#xa;Ofau7VldQykFT0IPBrzpRcXZn6BhsTTxFNTg/wDgC0UVDPd21qu64uIoR6yOF/nU&#xd;&#xa;m7aWrGah/wAg27/64v8A+gmvnuvZdY8Z6DBZzwrfLPK8bKFhBfkjHXp+teNV14dN&#xd;&#xa;J3Pls9rU6k4KEk7X2CvXfhr/AMis/wD18v8AyWvIq9d+Gv8AyKz/APXy/wDJaqv8&#xd;&#xa;Bjkf+9fJnYUUUVxH2AUUUUAFFFFABRRRQB4v451T+0/E84VsxW37hPw+8fzzXNV6&#xd;&#xa;zrfw7sNQZ57CQ2k7HJU/NGx+nUfh+VcFqfhHW9KLGayeSIf8tYfnX9OR+IFd1OpB&#xd;&#xa;pJHxePwWKjVlUnG6b3Wph1Zhv7y3GIbueMdMJIV/karkYODSVqeYm1sXf7Y1T/oJ&#xd;&#xa;Xn/f9v8AGq0s807bppXkI7uxNR0UWQ3OT3YUU5VZ2CqpZjwABya6nRPAWrao6yXM&#xd;&#xa;ZsrbqXlHzn6L1/PFKUlHVl0aFStLlpxuzM8NaFNr+rR2ygiBTunkH8K/4noK9zjj&#xd;&#xa;SKNI41CogCqo6ADoKpaRo9nolktrZRbU6sx5Zz6k1friq1Od+R9lluAWEp66ye/+&#xd;&#xa;QVz3jDw//b+jlIgPtcBLwk9z3X8f5gV0NFZxbTujtrUo1oOnPZnzrJG8UjRyIyOp&#xd;&#xa;KsrDBBHY0yvZfE3gu017NzCwt77H+sA+V/Zh/X+deYar4a1bRmb7XZv5Y/5aoNyH&#xd;&#xa;8R0/HFd0KsZHxeMy2thm9Lx7/wCfYygcHIqwuoXqLtW8uAuMYErf41WorQ4E2tmT&#xd;&#xa;S3VxMMSzyuPRnJqGiigG29woqSGCa4kEcETyueiopYn8BXQ6f4E16/ILWotYz/Fc&#xd;&#xa;Hb/471/Sk5Jbs0pUKtV2pxbOar6NriNL+Gum2uH1CaS8cfwD5E/Tk/nXb1yVqina&#xd;&#xa;x9VlGCq4ZSdXS9vwv/mFcf8AEr/kVk/6+U/k1dhVLVNKs9YszaX0XmREhsBiCCOh&#xd;&#xa;BFZQfLJNno4qk61GVOO7R8/0V6LqfwwYZfS70Edo7gf+zD/CuSv/AArrenEm406Y&#xd;&#xa;oP44xvX81zj8a7o1Iy2Z8XXwGJo/HB277ox6fHI8Tbo3ZG9VODTSCCQRg0lWcZdX&#xd;&#xa;V9SUALqN2AOgEzf41FPfXdyuJ7ueUekkhb+dV6KLIpzm1ZsKKK3NI8J6vrDqYLVo&#xd;&#xa;4T1mmG1ce3r+FDaWrHTpTqS5YK7MqztJ7+7itbaMyTSNtVR3r3Hw9oseg6PDZIQz&#xd;&#xa;/elcfxOep/p9BVXw34UsvDsJaP8AfXbjEk7Dn6AdhW/XFVq8+i2Prcry36svaVPi&#xd;&#xa;f4BUc0MdxBJDKoaORSjqe4IwRUlFYnsNX0Z4V4k0Cfw/qj27gmBiWgkxwy/4jvWP&#xd;&#xa;Xv8Aquk2es2TWl7FvjPII4Kn1B7GvLtb+H+qaa7SWam9tuoMY/eAe69/wzXbTrKS&#xd;&#xa;s9z5DH5TUoyc6SvH8UcjU0V1cQAiGeWMeiORUbo0blHUqwOCrDBFNrY8dNplltQv&#xd;&#xa;HBD3c7Z65kJzVckkkk5J6k0lFANt7sKKK1rDwzrWpEfZtPnKn+N12L+ZwKG0tyoU&#xd;&#xa;51HaCu/Iya9d+Gv/ACKz/wDXy/8AJaxtM+GEjFX1S9CjvHbjJ/76P+Fd5pelWejW&#xd;&#xa;QtLKMpECWILEkk9Sc1zVqkZKyPospy+vRq+1qKyt8y7RRRXKfRhRRRQAUUUUAFFF&#xd;&#xa;FABRRRQBTu9J06/JN3Y20x/vSRAn86y5PBHhyVstpiD/AHZHX+RroKKpSktmYzw9&#xd;&#xa;Ges4p+qRy/8Awr7w7/z6Sf8Af5v8ami8DeHIiCNODEd3ldv0JxXRUUc8u5CwWGW1&#xd;&#xa;NfcipaaZYWA/0Szt4PeOMKT+NW6KKk6IxUVaKsFFFFAwooooAKKKKAMu68OaNekm&#xd;&#xa;40y2Zj1YRhT+Y5rOfwD4cc5Fgyf7sz/410tFUpyWzMJ4WhN3lBP5I5lPAHhtTzYs&#xd;&#xa;31nf+hq7B4T0C3OU0q2J/wCmi7//AELNbNFHPJ9RRwmHjtBfciOG3ht02QQxxL/d&#xd;&#xa;RQo/SpKKKk3SS0QUUUUDCiiigAooooAq3Wm2N7/x9WVvP7yRBv51lS+C/DsxJfS4&#xd;&#xa;x/uOy/yIrfopqTWzMp0KU/jin6pHMH4f+HCSRZuPYTP/AI0+PwH4bjwf7P3Ed2mc&#xd;&#xa;/wBa6Siq55dzJYLDL/l2vuRnWmhaTYkNbadbRsOjCMbvz61o0UVLbe50RhGCtFWC&#xd;&#xa;iiikUFFFFABRRRQBVu9Osr8Yu7OCfHTzYw2PzrIm8D+HJiSdNVSf7kjrj8AcV0NF&#xd;&#xa;NSa2ZlOhSqfHFP1SOX/4V/4cz/x6SH/ts/8AjVmLwT4dhOV0yM/77u38ya36KfPL&#xd;&#xa;uZrBYZbU19yKlrpen2WDa2NtCfWOJVP5gVbooqb3OiMVFWirBRRRQMKKKKACiiig&#xd;&#xa;AooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiig&#xd;&#xa;AooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiig&#xd;&#xa;AooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiig&#xd;&#xa;AooooAKKKKACiiigAooooAKKKKACiiigApGYKpZiAoGSTwAKWqupWpvtMurRX2NN&#xd;&#xa;E0Yb0JGKUm0m0VFJySbsjLt/GOiXV+tpFdHezbVZkIVj7Gt6vIrTwXrUmopBJatC&#xd;&#xa;gf5ptw2qPUHvXrtcOAr16yk60bW26Ho5nhsNQlFYefNda6p/l3Ciiiu88wKKKKAC&#xd;&#xa;iiigAoorm/F3iG50C2tzbRRO8xYZkyQuMdh9ayrVY0YOpPZG1ChOvUVKG7Okorn/&#xd;&#xa;AAfql3q+jPc3kgeTzmUYUAAADjj610FOlVVWCnHZir0ZUajpy3QUUUVoZBRRRQAU&#xd;&#xa;UUUAFFFFABRRRQAUUUUAFFFFAHM+Mtdv9Ds4Hs448TMVaVhnYeoAHTnn8q4ldQ8X&#xd;&#xa;Xg86N9TkVujRRttP/fIxXq1wlu8W65WJo4zvzKBhSO/PT61y+pfEDTLNmjtI3vHH&#xd;&#xa;dflT8zz+leRjqK5+erWcY9Ee7l1d+zVOjQU5dW/6/U5Sz8Ya7pN15d27zKp+eG5X&#xd;&#xa;Dfn1Br0/Tr+HU9PhvLckxyrkZ6g9wfcHivItf8RT+IJo3nghiEeQmwHOD2JPWuz+&#xd;&#xa;G9wX0m7tyciObcPYMP8A61c2W4qX1h0eZyi9rnXm2Cj9WWI5FGS3S2KHiTxtqdpq&#xd;&#xa;lzY2axQrC23zNu5j+fH6VipqHi28HmxPqkinvEjbf0GKh8R/8jhef9fA/pXsdKjS&#xd;&#xa;q4yrU5qjSi+nzHXrUcBQpOFJNyV7v0X+Z5Jb+K/EOkXQS6llfHLQ3SckfjyK9M0f&#xd;&#xa;VYNZ0yK9g4DcMhOSjDqKwviBYxz+HvtRUeZbSKQ3fBO0j9R+VZvw0uGMeoWxJ2qU&#xd;&#xa;kUe5yD/IVth5VcNi/q85c0WtL/15HPioUcXgXi4QUZRdnb+vNFjxl4l1XSr2Oys0&#xd;&#xa;SJZEDLNjczdsDPArmftfjCQeYDqxU85WN8foK9SvJLK1QXt4YUEIOJZAMrnsD7+3&#xd;&#xa;WuT1D4jWcRZLC1kuCOjyHYv5dT+lPGUoqbnWrNJ7IMvrylTUKGHUmt2/83/mYmke&#xd;&#xa;OtSsrpYtSY3EG7D7lw6e/v8AQ16fHIksayRsGRwGVh0INeIavqsus6g15PFDHIwA&#xd;&#xa;IiXAOPX1Nep+DLhrjwpZFySyBo8+wYgfpipyrFSnUlRcuZbpsvOsFCFKFeMVFvRp&#xd;&#xa;bHHal8QNUkmdLNIrVFJAO3e35nj9KqR6/wCLZkEkct26HkMtuCP/AEGqnh9Ffxda&#xd;&#xa;K6hlNwcgjIPWvZaxwlKvjFKcqrVnbQ2x1bDYBxpwoxd1fX/hmc9peq3Vp4U/tTW5&#xd;&#xa;CZAC5GwKcZwowMcn+tcPeeMdd1W68u0d4VY/JDbrlvz6k10vxHuCmkWtuDjzZtx9&#xd;&#xa;wo/+uKb8OLKJNMuL0qDNJKYw3cKADj8z+grav7WriI4SE2klq+rMcOqFHCyx06ab&#xd;&#xa;k9F0RzJ1HxdZDzpH1ONV6tLG23/x4YrtvBuu3+uWc73kceIWCrKoxvPUgjpxx+dd&#xd;&#xa;NUcUMUAYQxJGGbcwRQMn1OO9deHwVSjUUlUbXZnBisxpYik4uklLo0ec+IPFOvf2&#xd;&#xa;zcadag2/lSFFWFNzuOxz15GDxisx73xdboZpG1VEXks6PtH1yMV6ZqGoaZowe7u3&#xd;&#xa;iheTgkL88mPpya5G/wDiSoyun2JPpJO3/so/xrhxVKMJN1a7T6Jf5f8ADHpYKtOp&#xd;&#xa;BRoYZNdW+vfV/wDBDwv43uLm9isNUKuZTtjnAAO7sGA459a7LV75tN0m5vVQO0KF&#xd;&#xa;gpOM14nNcvNePdYWN2ffiMYCnOeB2r1vxBN9o8F3U/8Az0tg/Hvg1eX4ypOjUjJ3&#xd;&#xa;cVoyM0wFKniKUoxspOzXTdHBz+MvEOpS+XBMY93SO2j5/qf1qKTUvFlivnzy6nEi&#xd;&#xa;n70yMF/UYrU+G/8AyGbv/r3/APZhXpE0Uc8LwyoHjdSrKehBrLC4WriqXtXVdzbG&#xd;&#xa;42jgq3sI0YtK39bHlkvj3XJoEhjaGOToZEjyzH6HI/IVAb3xeyGYtquzGdwRwv8A&#xd;&#xa;LFVtHzp3jC1jB/1d4IiT6Ftp/Q17NU4OjVxik51WmtCsfiKGAlGNOjFqSueceGvG&#xd;&#xa;92L6Kz1WQSwyMEExADIe2cdRXo9eQ+NbRLPxRceWu1ZQsuAMckc/qDXqmmTm60qz&#xd;&#xa;uGOWlgRzn3UGu3La1TmnQqO7j1PPzehS5KeJpKymtUed6X4k1bUfFdpDcXj+SZ8e&#xd;&#xa;WnyqRz1x1/GvS5JEhieSRgqICzMegA6mvH/Dn/I4Wf8A18H+teh+NLhrfwrdlThp&#xd;&#xa;Nsf4Fhn9M1ll2IksPUqzd7N/ka5thoPFUqNNWTSWnmzjtY8d6leXTR6axtrfOE2q&#xd;&#xa;C7+/PT6CqT3/AIttY/tEsmqRxryXkR9o+uRitT4c2Mc+pXd26hmt0VUz2LZ5/IEf&#xd;&#xa;jXdahq+mWCMt9dwJkYKMckj/AHRyaxo0KuJpfWKtVxvt2OnEYmjhK31ajQUrWv1f&#xd;&#xa;5HO+D/F0urTGwv8Ab9pC7o5AMeZjqCPXvV7xd4huNAtrc20UbyTlhukzhcY7Dr1r&#xd;&#xa;zrTp4rTxXby2rEwLdgITxlC2P5V1vxL/AOPfTv8Afk/ktVSxlV4Kb5vej1+ZFbAU&#xd;&#xa;Y5jTSj7s9bfJ/wDAOe/4SLxPqrnyJ7p8fw20eMf98jNNfWPFWmFZbibUIQTgG4Q7&#xd;&#xa;T/30MV2/gD/kV0/66v8AzroL6zi1CxmtJlDRyoVOe3v+FOlgKtWkqvtXzNX/AK1J&#xd;&#xa;rZlRo13R9jHlTt/Whg+EvFH9vRPBcKqXkQydvR19R6e/1rJ+Jf8Ax76d/vyfyWua&#xd;&#xa;8HzPa+LLMcjczRsPXII/nj8q6X4l/wDHvp3+/J/Jan6xKvl03Pdafii/qkMNm1NU&#xd;&#xa;9nr+DOT0yPxC9qTpZ1D7PuOfs7OF3d+nfpXsVpvFnB5m7zPLXdu65xzmuZ+Hn/It&#xd;&#xa;N/18N/Ja2vEFw1r4fv5k4ZYGAI7EjGf1rqy+iqFD2127q9jizWu8RifYKKVna/e/&#xd;&#xa;c4nxB47upLqS20lxFAh2+dgFn9xnoP1rK+2eL2TzQ2rFPvbgj4/lipfAdhHe+Ig8&#xd;&#xa;yBlt4zKAem7IA/nn8K9Yrlw1CtjYutUqNa6JHbi8Th8ukqFOknZatnmWh+O762uk&#xd;&#xa;g1VvPtydrOVw8fvx1/nXpgIYBlIIPII715h8QrCO11qK4iQL9ojy+B1YHBP5YrtP&#xd;&#xa;DEz3vhCzYt85hMYJ/wBklR/KujAVasas8NUd+XY5MzoUZ0KeLpR5ebRr+vRnKeIP&#xd;&#xa;HV3JeSWuksI4Ubb5wUM0h9s9B+tZX2rxgR5mdX2nnPlvj+WKo6Hdx6L4ihnvYSVg&#xd;&#xa;dlkTGSpwRnHqD/KvWLHX9K1LAtb6F2PRCdrfkea48OpYxuVSq4u+x6GLccvjGNKg&#xd;&#xa;pRtrK1zk/CPifWL7Vl067Czrhi7su14wB7decDp3rvqjEEQnM4iTziu0ybRux6Z9&#xd;&#xa;Kkr3MNRnShyzlzeZ85jK9OvU56cOVdl3Ciiiug5QooooAKKKKAPO/iLq0v2mHS42&#xd;&#xa;KxBBJKAfvEngH6Yz+NWPDHgmyl0+C+1IGZplEiRAkKqnkZxyTjBqr8RNKmF5Dqka&#xd;&#xa;FoWQRyED7rA8E/XOPwqPRvH7afpsNnc2RmMKBEdHxkDoCMV87KVKOOm8Vt0vsfVw&#xd;&#xa;hXll1NYLfrbRm141sbSy8JulrbRQr5qcRoBVP4af8e+o/wC/H/JqxvEXjRtcsDZL&#xd;&#xa;ZCCMsGLGTcTj8BW18NFItdQJBwXTB9eDVU61OrmMZUtrfoyKtCtQyqca3xN33v1R&#xd;&#xa;y/iP/kcLz/r4H9K9jrxnxOxTxXfsOqzZ/lXT2/xKXYBc6ad3dopOD+BHH50sDiqV&#xd;&#xa;CtVVR2u/1ZWY4KviaFF0Y3sv0Ru+OHVPCV2D1cxqPrvB/pXPfDNT52pNjgLGM/i1&#xd;&#xa;Y3iTxZN4gWOBYPIt0bds3bizdMk/0rtvBGjyaVope4QpPct5jKeqr/CD79T+NaU6&#xd;&#xa;ixWYKpT+GK3+/wDzMatKWCyuVKrpKb2+7/I43xrqk+peIJLNWPk2zeXGg7t3P1zx&#xd;&#xa;XW6P4E0yyhR72P7Xc4y24nYD6Ad/xrkPGemT6d4hlugp8m4bzY5Mcbu4+ua2rf4l&#xd;&#xa;AW6i404tMByUkwCfXpxWFGdCGJqPF730vr/XSx016eIng6UcD8NtbOz/AK3uR/Ea&#xd;&#xa;CG2j0qOCJIkHm4VFCj+DsK3PAH/Irp/11f8AnXDeJfEz+Int82qwLBu2gPuJ3Y6n&#xd;&#xa;A9K7rwEpXwvHkEZlcjI681rhKkKuYSnT2t/kY46jUo5VCnV+K/6tnB+HP+Rws/8A&#xd;&#xa;r4P9a9jrxzw5/wAjhZ/9fB/rXsdbZL/Cl6nPxD/Gh/h/U4X4loTZ6e+PlEjg/iB/&#xd;&#xa;gavfDyQP4bZRjKXDA/kD/Wr/AIt0h9Y0KSGEZnjYSxD1I7fiCa878O+JLnw3cTIY&#xd;&#xa;PNhc4kiY7SCO49DWdeaw2P8Aa1PhktzXDU3jMs9jT+KL2/r1PYaa7iNGdjhVBJrh&#xd;&#xa;J/iXH5f+j6axfH8cowPyHNavhPXpvEVpepeoodGx8i4XYw6fofzr0KePoVZqnTd2&#xd;&#xa;zy6uWYmjTdWrGyXmjgi134t8TKryYe4chc8iNBk4H0AP1r0bTvB2jaeqn7KtxKOs&#xd;&#xa;k/zZP06D8q8223vhTxErMn762cldw4kU5GR7EGur/wCFlxeWCNLcvjkecMfntrx8&#xd;&#xa;DVw9Nylivjv1Vz38yo4uqoRwf8O3R2/pWMPx4ip4mdUUKBEnAGO1drqn/JPm/wCv&#xd;&#xa;JP5CvNtc1eTXNTa8eFYiyhQinPSvSdVBX4fuCCCLJAQfoKvCzjOeInHZp/qZ42nK&#xd;&#xa;nTwsJ7pr9DmPhv8A8hm7/wCvf/2YV6XXmnw3/wCQzd/9e/8A7MK9Lrvyj/dV6s8z&#xd;&#xa;Pf8AfH6L8jxj/mcv+4h/7Ur2evGP+Zy/7iH/ALUr2esMn/5eep059/y69P8AI8s+&#xd;&#xa;If8AyMq/9e6fzavQ9C/5F7TP+vSL/wBAFeefEP8A5GVf+vdP5tXoehf8i9pn/XpF&#xd;&#xa;/wCgCngv99rCzH/kX0P66Hlnhz/kcLP/AK+D/Wu98eoW8KzEdEkQn88f1rgvDn/I&#xd;&#xa;4Wf/AF8H+teravYDVNJurInHmxkAns3UH88Vjl1N1MJVgt3f8jfNqipY2jN7K35n&#xd;&#xa;jmm/2pIZbbTDcky48xIM8gZxnHbk1vWPw/1a6Ie6eK1U8ncd7fkP8aytN1C/8K60&#xd;&#xa;5MWJEzHLC/AYf55BrrG+JcHl5XTJDJ6GUY/PH9K4cLDCOP8AtMmmump6ONqY5S/2&#xd;&#xa;SCafXS/4/wDBNHTfAWlWTpLM0tzKpDAs21QR7D/E1m/Ev/j307/fk/ktT+GvGV1r&#xd;&#xa;OvG1uIY44njJjWMHgjnk/TNQfEv/AI99O/35P5LXpVnh5YGboKy/4KPJw6xUcypx&#xd;&#xa;xLu9fyZqeAP+RXT/AK6v/Ouorl/AH/Irp/11f+ddRXo4L/doeiPKzH/e6nqzxzw5&#xd;&#xa;/wAjhZ/9fB/rXT/Ev/j307/fk/ktcx4c/wCRws/+vg/1rt/iBp8l5oaTxKWNtJvY&#xd;&#xa;AfwkYJ/lXh4aLlgKqXf/ACPo8XNQzKg5dvzug+Hn/ItN/wBfDfyWtPxWnmeFtQXn&#xd;&#xa;iLdx7EH+lcH4Y8YLoNjLaTWrTIz+YhVsEEgAg/lXb6LrMHirSLoND5QJaGSPduO0&#xd;&#xa;jrnA65P5V34PEUquHWHT96zVjzMfha9DFvFSj7iknc4/4cOF125Q9Wtjj8GWvTq8&#xd;&#xa;XBv/AAn4gzt2zwMcbh8sin+hFdYPiXF5OTpj+b6CUbfzx/SsMuxtKhSdKs7NNnTm&#xd;&#xa;uX1sTWVeguaLS6oq/EqQG+sI/wCJY2Y/iR/hXT+ClK+EbAEYOHP5uxrza7ub/wAV&#xd;&#xa;66GEYaeXCIi9EUf07k16zDHHouhqgBdLSD+EcttHP4mqwMva4qpiF8Nrfl/kRmUP&#xd;&#xa;YYKjhH8V7/n/AJmbrfg/TdZla4bfb3J6yR/xfUd647Uvh/qdojSWskd2g5wvyv8A&#xd;&#xa;kf8AGrVl8R7uMbb2yjn9GjbYf6g/pVm6+JSmFhaaewkI4aWTgH1wBz+YqK1TLa6c&#xd;&#xa;5Oz+d/8AI0w9PN8M1CKvHzat/mUfBfiO9i1WHTLmZ5babKqHOTG2OMH07Yr02vJf&#xd;&#xa;Ben3F/4khugp8qBjJLJjjOOB9Sa9arqyiVSVD39r6ehxZ7CnHErkVnbW3cKKKK9U&#xd;&#xa;8UKKKKACiiigBrKroyOoZWGCCMgisO48G6DcuXbT1Rj/AM83ZB+QOK3qKzqUqdT4&#xd;&#xa;4p+prSr1aWtOTXo7GJb+EtBtWDR6dEx/6aEv+jE1spGkSBI0VEHAVRgCnUUQpQp/&#xd;&#xa;BFL0FUrVKutSTfq7njfiMA+L70EZBuOn5V6NP4M0CdyxsFRj/wA83ZR+QOK868R/&#xd;&#xa;8jhef9fA/pXsdeNl1KnUqVueKevX5n0Ga16tKjQdOTXu9HbojKsfDWj6dIJbawjW&#xd;&#xa;Qch2Jcj6FicVq0UV7UKcIK0FZeR89UqzqPmm2356kU9vDdQtDcRJLG3VHUEH8DWJ&#xd;&#xa;J4J8PyPu+w7TnJCyuAfwzXQUVNSjTqfHFP1RdLEVaX8OTXo7GTaeGdFsmDQadCGH&#xd;&#xa;RnBcj/vrNaoGOBS0VUKcIK0Fb0IqVZ1Hecm35u5mQ+HtJtrlbmGwiSZTuVwOQfWt&#xd;&#xa;OiinGEYaRVgnUnN3m2/UKzL/AMP6Tqb+Zd2Mckh6uMqx+pGCa06KJwjNWkroIVJ0&#xd;&#xa;3zQbT8jn4vBWgRPuFhuOcjfIxH5ZrcgghtohFBEkUa9ERQAPwFSUVFOjTp/BFL0R&#xd;&#xa;dXEVav8AEk36u5VvdNs9SiEd5bRzqOm9ckfQ9qyP+EH8Pb932E4/u+c+P510NFE8&#xd;&#xa;PSqO84pvzQ6eJr0ly05tLybM+y0PS9OIa1sYI3HR9uWH4nmrdxbxXVu8E6CSJxhl&#xd;&#xa;PQipaKqNOEVypaGcqk5S5pNt9yhY6Np2mytJZ2kcLsNrMo6ir9FFOMYxVoqyFOcp&#xd;&#xa;u8ndmZ/wjukfaftP2CHzt/mb8c7s5z+dadFFEYRh8KsOdSc/jbdu5n3miaZqM/nX&#xd;&#xa;dnFNLjbuYc4q7DFHBCkMShI41Cqo7ADAFPooUIpuSWrCVScoqLbaRmQ+HtJtrlbm&#xd;&#xa;GwiSZTuVwOQfWtOiiiMIw0irBOpObvNt+pSv9I0/VABe2kUxAwGYfMPoRzWWvgjw&#xd;&#xa;+r7vsJPsZnwP1roaKznh6M3eUU36GkMVXprlhNpeTZWs9Ps9Pi8u0tooF7hFxn6+&#xd;&#xa;tNvtLstTCC9tknCZK7+2at0Vfs48vLbTsZ+0mpc93fv1K9nZW2n24gtIViiBJ2r0&#xd;&#xa;zViiiqSSVkTKTk7t3ZmQ+HtJtrlbmGwiSZTuVwOQfWtIgEYIyKWilGEYK0VYqdSc&#xd;&#xa;3ebb9TCn8G6BcTGV7BVYnJCOyg/gDgfhWjYaXY6XEY7K2jhVvvbRy31PU1coqI0K&#xd;&#xa;UJc0YpP0Lnia048s5trs2yre6bZalGI7y2jmUdN68j6HtWOfA/h7fu+wnH93znx/&#xd;&#xa;OuiopTw9Ko7zin6odPE16StTm0vJsp2GlWGmIVsrWKHPUqOT9T1NXKKK0jFRVoqy&#xd;&#xa;MpTlN80ndmVe+G9H1By9zYRM55LLlCfqVxmqcfgnw/G+77Du54DSuQP1roaKylhq&#xd;&#xa;MndwV/RG0cXiIrljUaXqyK3toLSEQ20KRRL0RFwKloorZJJWRg227sKKKKYgoooo&#xd;&#xa;AKKKKACiiigAooooAyo9B0tr6a9eyikuHkJLyDdz7A8CtWiiohCMV7qsaVKk5v3n&#xd;&#xa;ewUUUVZmFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRR&#xd;&#xa;RQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRR&#xd;&#xa;RQB//9llbmRzdHJlYW0NCmVuZG9iag0KNyAwIG9iag0KPDwNCi9UeXBlIC9QYWdl&#xd;&#xa;DQovUGFyZW50IDMgMCBSDQovUmVzb3VyY2VzIDQgMCBSDQovQ29udGVudHMgOCAw&#xd;&#xa;IFINCi9NZWRpYUJveFsgMCAwIDU5NS4zIDg0MS45IF0NCi9Dcm9wQm94WyAwIDAg&#xd;&#xa;NTk1LjMgODQxLjkgXQ0KL1JvdGF0ZSAwDQo+Pg0KZW5kb2JqDQo4IDAgb2JqDQo8&#xd;&#xa;PCAvTGVuZ3RoIDIyNDYgL0ZpbHRlciAvRmxhdGVEZWNvZGUgPj4NCnN0cmVhbQ0K&#xd;&#xa;eJztWb1y48gRzrdq32ESl3kuCpofzF8IUdQWXRSpI6kN7HWApSAdtkhCB1Krd7oX&#xd;&#xa;cOwHcHRPcOEFFzlz5B78zoADUbLrqjaw6vYkcr7u6a+7p6cb+PH9ux/fv8Pozwij&#xd;&#xa;L+/fEfiFEUFcBBIpLIKQY0zRegtLASxV/8zfZwWGcYB41ykPpAy1RmdM64DIClVt&#xd;&#xa;UEqfuVu4tpSfAiVVyEjINKiRRFP0uq/yh1IVOUWrWqJcGoMYDUL4HpmdJZawWv46&#xd;&#xa;cz/WRB1KpYpWw2mu31v//T8M30QYvjdbti5cfED2R0PnYtVhIpUKlCZoBfrOrzCS&#xd;&#xa;AFzdv383WCT3AdJEEUXZdyvLAYTrQJvQYM0bMd6KPaDrJF/Hu0O6QXcJuojzdbLJ&#xd;&#xa;dvEQ3WebNAN5PDxkW/gjpHS4ST/nGVJCDvfJep3+a4foT8Mfsi8xIgQLMkx3+3We&#xd;&#xa;PhYr5KfhaHJ1FmFFtNSMlGa5hEmHsEtW6kAJ2litaqtRoeqE7xoHQBAE6MIBC2td&#xd;&#xa;pNV1ES1G4+l8FqHLP0Y38CG6Hs9WS3R9O5uMJjfRdImWketRwiDekocBZp5IRB8D&#xd;&#xa;ZPSg6fzDP5eryQhRekaFT0XIA8jeQsUAKxxi1Frj/PiEKTgnlKXwKtn8ep/tMqRZ&#xd;&#xa;wCEnOQQYe4VIIHmZB4PokOyKQMUbNNqkye6QIA25ShVi4GxXnhEVQAJJajZovEhw&#xd;&#xa;zXo0vx4vRpNoaiis5lP4iEbz2fJ2upovxuDDqVcdIYHWjQ8tdVO0GoNchP4SXYyn&#xd;&#xa;UxQMERmiTbYGY6lXFcZByEpmVAvw5dXtePZhsphPIx9emJNUue/T4Pof0+hD9Ok7&#xd;&#xa;BxkSHgglAIoDQj2hJnDAQ4LOESLeLSSkt/bkb3QeoeXtMoIwGx+totlqMnM0FPkv&#xd;&#xa;GKSYanOWiFrBVbw+POWxR4TSQJHjLL+MD9ke2WLjVV2P7CIjaAD/w5ArTVhoy3f2&#xd;&#xa;722AfHsTOAyUO4KmIiW5yTAXSjlkkItcpY+Z63gOsWEu6CpZ/xCj8TbdQ8o66MJm&#xd;&#xa;rsOgOg2OqwkUEIKhBDOhfSZbcgNf+SzNtVE3i/nl7Wg1dy0WkMhcO0CGzwk5p5go&#xd;&#xa;j7kCMoSQYxeXNOePSR6vu0TBOKhktuhgnqcPic8dUPWV8qRej1GVaktqML+C+jeL&#xd;&#xa;lmgE9XARTcdLzzaQoYyyYxpVPXH3EDIQ3JEZXKZ5dY9cpXs42+4x4hRS2sXPJugM&#xd;&#xa;wbVydFB1V3OR8aMM7iuP3XAfUh0eu6ctYx4hc/5CUapvq5wHCDeO1KoEvlAEa4dY&#xd;&#xa;xryl8NXitlkvVr5awDavp/RVrrctu9CUUbhAqNf1NvIy26brdJMeZ3CNBpO1YscF&#xd;&#xa;dbwE/VgqU1j/VPyUJdarBLetEKQ1uvst3r+lxSAU7kkUahWE9T2A3tRYFAU3VNDp&#xd;&#xa;KnFccaO6UObo0yDdPmb5IdmjZIeSpzzbd9xNodIpYww0KU2bZh2nmyT/LbvLapXF&#xd;&#xa;gfEqgI6JcOvGaC7UDlyRAg7GQ609Pgaz7OtZp0KEICIp/JIBDUPPDtBgEIaHVd/R&#xd;&#xa;c70Q4GfqO+yLPWUjWj8l+Z17YAm0HBJrR2gQPUKfGm9NkXHRVITQUXAXPcp26+Sx&#xd;&#xa;g2TKFDvRQZpG+C6+c6nDyEOgMXKQN1C4oD2+3aWHOE879xeMP0y6+EmZAu6VrQLj&#xd;&#xa;DHAK8XQXTLotWNHbOfBBdFP0mtH079Nxp7aACaqDHj1lhxgKLXTrnQMF/Q0RLpi4&#xd;&#xa;mxsucLl1MLyJd0udw75dXQEMQV1kST5kASXVFd9D2IacJmyjl0n+FSpRcQ9sHzfJ&#xd;&#xa;FtLFBGvfw9+WDTvpL6AXUR0MOSaFSSCMm1xVPeRNXtG6W5DER96GFOSnAbocT9Fy&#xd;&#xa;7qdv40/G2wbTnnjbGKjNvfF2dEHa91CGoosZf5GyDXkNZRv/6ohDZ42VK9shBpcl&#xd;&#xa;k13IcbzhiJ9GFdTNUFBPKExSH3UbYqjfLj5AD+BlbUNPBtoGU+4PtI0hoj/QNs54&#xd;&#xa;sY8tBjh5ma0FOcXWgr41xrZsT4wdSG+MX0YVrDG0TbwpZ8zH2oYY1leLaDYaL0do&#xd;&#xa;FF1f/Oxlb4ucjLUN7ou1jSG6P9Y2LoQ//awZDD1CyJdYO5DXsXZE3hhzR9YfcxfS&#xd;&#xa;F/MTKNMBml5KaN8zEdc2GEBBJUVUkoAy1eDbJ1HxPkGmTdilnzduo2C6LmiaHdlO&#xd;&#xa;w9U0QNIECvogaNeIanqPp2QP81AnyjCzig7UBFwOmV8nDAW+GbvTW0po7mVooweT&#xd;&#xa;j1FRwin5Q2fMgInNUdzDKhTYuNrCeQ1lTJlsoyEwk7pxsa4tXcHZ2aAY3cQPce5u&#xd;&#xa;ICHlw0LSJJCnvYV1ZTZEbX9bPEct5DGcK11MQRp0mJOozRPh88kWo8sMQRvMGYxp&#xd;&#xa;YBqDQVsoGCY4DN3mmzxBoJ/TMGhXCTUrBlOuhpwHrFmFRKL2onlM1CxS6LusRcbA&#xd;&#xa;n5ZibGqYtU5BGWk1h+6+7uqRzRUljov8MctgWahc4Z7VRlhDEopqGUYXV9a7WPkK&#xd;&#xa;Zh2MxZGvasXmuKlS1kSRuq6shP2urBZ7XFnv2+PKWrPflT1WHT3op+bVQTMi2U/y&#xd;&#xa;EkjhTWKe1d+30+ALMxehYBAUcQI1BGvP0HWZxkeqmsMMztRcOsKDVZx/ASuKafZp&#xd;&#xa;35mqGDT7mrsCbfVuduqcPg7dNWc924BE+jW+i/fHxZeAP+Wxk5DvxycNJ1XVs3/f&#xd;&#xa;z8ckR4+/PKS7GO3Th6fjB1vFQx+4KDCpGsDJ7j7Lt+WYDnFKQSD/dd/EqNgbiq8U&#xd;&#xa;cBWLogK2eWKHjoamqTbPtmH0bm+Y5u3Nx3SfHhK0M8U9j9Fz8hk9Pz8H+/hzHCR7&#xd;&#xa;Oyf8r/sEZDjm6r983Ve+47LWK9XVyy9XufdFH9wpz6jztOWvfwPIXbFB/a9+sfe/&#xd;&#xa;ipaczbOnwqwt1GvpfLNBS7PBq16VUgydAadwRH8H37nKvxHfQUGEkiewMav0Hdx5&#xd;&#xa;cOu1377Ff6FpE8Tv5D9X+TfhP+g6gbN5KFL7TznfeHz3H33j3FwNCmVuZHN0cmVh&#xd;&#xa;bQ0KZW5kb2JqDQoxMiAwIG9iag0KPDwNCi9UeXBlIC9QYWdlDQovUGFyZW50IDMg&#xd;&#xa;MCBSDQovUmVzb3VyY2VzIDQgMCBSDQovQ29udGVudHMgMTMgMCBSDQovTWVkaWFC&#xd;&#xa;b3hbIDAgMCA1OTUuMyA4NDEuOSBdDQovQ3JvcEJveFsgMCAwIDU5NS4zIDg0MS45&#xd;&#xa;IF0NCi9Sb3RhdGUgMA0KPj4NCmVuZG9iag0KMTMgMCBvYmoNCjw8IC9MZW5ndGgg&#xd;&#xa;MjQ2MCAvRmlsdGVyIC9GbGF0ZURlY29kZSA+Pg0Kc3RyZWFtDQp4nO2bTXIcuRFG&#xd;&#xa;94rQHbAzHUFC+C0A3lGUNEGHpJkRae/bnOa4FRTbJqk51NzFB/HaFzCKndXMbOLL&#xd;&#xa;0ey8cIQUYouvsr6H6gJRyKazzjj6++m7/Zfz37ufX754ffnyxat33uT++vL65Yu3&#xd;&#xa;/fU/H/8482fjzOeXL3z/x5mOTLaY6iabsnPBXH3p32LV5q9PHpmYOzL8fsi2lNSa&#xd;&#xa;OYmtWV+IohPsjj6Rp5BZdq9sLTVFn2LrZYpvwXzbf83Ccyn/W1r0rZDLHCgGm/r/&#xd;&#xa;m/nMxZX+3d0/J/LlIiqUdiWeKvy264/sz/8vw//EZfhxd5+IqKVWW5s3l1/mG8iZ&#xd;&#xa;QjfQ0af1tTXNV19D/OMlM/S52TaPvWt5f1h+Ouxn82F9d7W6fdjcmJ/W5vXq7mp9&#xd;&#xa;s71dHZvr7c1m2493xw/bL/2LFMLxzeZvd1tTp3J8v7662vzn1oRfj/++/bwy3rvJ&#xd;&#xa;H29u76/uNv94/I7/9fjs/N3Jqau+lRb9Y6zHO92k0F3mfCHZaKZgvSnZW5/rPFCv&#xd;&#xa;zr9482ZrDgbAB2eDKVOzNU57lWlReX366ezt++8/npo3fzj9ob84/fD24+WFkaNB&#xd;&#xa;NUIfk7nC0Ye/fDw/O//h9P2FuTgVaMjBOufFCY9O/2rNXNu8//67f11cnp+ZEE7C&#xd;&#xa;ZIyrLjnzlMFcrm/+fb293ZoWbe7vg9zH3JnTh/Xt4+CsbszZzWZ9+7A2rb8BQjXR&#xd;&#xa;9TeiSLAbl5hsTqTrTV1036wfVjc36/maXa+uHr7erea6+zGe3PxuCdW2Pqapeltz&#xd;&#xa;f39mc9dxeWv26dkPpmf5tvOxX5zB2243uk6WO5ztl1Il2RqSmVqXyDT+sbiDC9Qj&#xd;&#xa;x2SKy3vo1bvwdMY3m9Uz4f0li9N8N4qDjy5Xd5/7WN2b9a35er8VB8TobezTlTjg&#xd;&#xa;Yn33y+Zqs703+zPdiaNSTn1YIzhNP2Lzy+qn1b306m/53M80tcm2qaCRfMKTTf0+&#xd;&#xa;5/iR86+8l8L9wrp+gQXWpGItNh4icsxz92g+SMQfIP0mcEkih5HJcJ6iSh4jZMUR&#xd;&#xa;F6AVx4CVqDS20hCy0iIvVv2GqlG3YoiL2IphyIpXAlYKslgpkcmqBDvRjxNkxRGX&#xd;&#xa;oBXHgJWoNLbSELLSIpPV1KfM1lQrjrj8zKoU66dJYt6NtUSpsZYoM9bSMpNWn4qz&#xd;&#xa;A/ceaXHETVCLY0hLlBpraQhpaZlJK1WbvD5fcMQVqMUxpCVKjbU0hLS0zIuWszHo&#xd;&#xa;EwZHXMVaDINavBTQUpBFS8lMWn01G6I+Y3DENajFMaQlSo21NIS0tMyk1ReiPupT&#xd;&#xa;Bke8g1oC82MtwYy1NIS0tMyk5fvyOOlTBkf88xXGoiWxsZZgxlocAVdLy0xarvQF&#xd;&#xa;mD5lcMQ/X2IsWgIDWoIZa3EEaGmZd1p9/rd1UqcMgfjnawzSkthYSzJDLYGMtdTM&#xd;&#xa;i5bvD/7qlCEQ/3yRsdfiGNLiDNBiCNJSMpNWjXYq6pQhEA9XGRILYy3OhLGWKDPW&#xd;&#xa;0jKTVsk2V3XKEIiHqwyJAS3OAC2OgKulZSatqfTs6pQhEA9XGRIDWpwBWhwBWlpm&#xd;&#xa;0srNJqdPGRzxcJUhMaDFGaDFEaClZV60+nO516cMjni4ypAY0mIM0mII0lIyk1aK&#xd;&#xa;Nnh9yuBIgKsMgfk41uJMHGuJMmMtLTNpxWx90KcMjgS4yhAY0uIM0OIIuFpaZtIK&#xd;&#xa;xbqoTxkcCXCVITCkxRmgxRGgpWUmLV9tS/qUwZGAVxkcQ1qcAVocAVpa5kXL2Zr1&#xd;&#xa;KYMjAa8yOAa1GIO0GIK0lMyk5YItWZ8yOBLwKoNjPo21OJPGWqLMWEvLvNNKLdkJ&#xd;&#xa;7SPutAQS4CpDYEBLMGMtgYyvlpqZtOpks773KZAAVxkCQ1qcAVocAVpaZtIq1SZ9&#xd;&#xa;81MgAa4yBIa0OAO0OAK0tMyLlrNR3/0USICrDIFBLcYgLYYgLSUzaU3BBn37UyAR&#xd;&#xa;rjIE5stYizNlrCXONtZSMs/rKhceuy5hvJW4r4IRHzsS+uCkyXq0c7d75hPI5fZh&#xd;&#xa;dbO+PxieviQqSYIxH/6kiDbNY8ihDAaIM22spuReBihW68a7d/sqGPHR9SvQByg0&#xd;&#xa;28Bm2byPlrxE9t2yPxlzoOdD6Gus2Hlv67JRdfr56/3D2ry9f1jdXm1W/aiTdnCW&#xd;&#xa;Yqfas/poy7IP9HgZOpvq2GsQWm9x7ivM7c3Ur8Mk92Z+X0szNmfzsgsSiz8Yhl1L&#xd;&#xa;M7ayh353S5Mf/E0tTXHAN7c0x6fRW5qx9ue5ApvDh3MPx0ctTZp7BOan4dwjSw1v&#xd;&#xa;LRXZvXkEMp5SY+2Dqu/1CGTQ09xrMQxq8VJAS0EWLSUzac0Tmb7XI5BBU3PR4hjS&#xd;&#xa;EqXGWhpCWlpm0pr6s52+1yOQQVdz0eIY0hKlxloaQlpaZtLKPZS+1yMQ3NYUGNIS&#xd;&#xa;pcZaGkJaWmbSSs06fa9HILitKTCkJUqNtTSEtLTMi5br1fQpgyO4rSkwqMVLAS0F&#xd;&#xa;WbSUzKTV1wBV3+sRCG5rCgxpiVJjLQ0hLS0zaYVki77XIxDc1hQY0hKlxloaQlpa&#xd;&#xa;ZtLyk530vR6B4LamxIAWZ4CWhpCWlpm0XLVZ3+sRCG5rSgxocQZoaQhpaZkXLWeT&#xd;&#xa;vtcjENzWlBjSYgzSUpBFS8m80wot2Kjv9QgEtzUlNtYSzFhLRXZaambSqv1hU9/r&#xd;&#xa;EQhua0oMaHEGaGkIaWmZSav0B80aVC2O4LamxIAWZ4CWhpCWlpm0pv7kq+/1CAS3&#xd;&#xa;NQ+wsRZngJaGkJaWmbTmT3frez0CwW1NiQEtzgAtDSEtLfOi5W1zk67FENzWlBjS&#xd;&#xa;YgzSUpBFS8lMWinaqn/UTSC4rSkxoMUZoKUhpKVlJq2YbdE/6iYQ3NYUGNLiDNDS&#xd;&#xa;ENLSMpNWKFb/NA4ncFOTU8iJIUBJIchIiUtCvtmsf8hNILihKTDkxBkgpSFkpWVe&#xd;&#xa;tLxN+ofcBIIbmgKDWoxBWgqyaCmZScvFfsKkanEENzQFhrQ4A7Q0hLS0zDst37IN&#xd;&#xa;+m0lENzQFBjQEsxYS0V2Wmpm0uon9PqH3ASCG5oCQ1qcAVoaQlpaZtIqzbpSVS2O&#xd;&#xa;4IamwJAWZ4CWhpCWlnnRcrbpG58CwQ1NgUEtxiAtBVm0lMykNQVb9Y1PgeCGpsCQ&#xd;&#xa;FmeAloaQlpaZtHLqqPpIIhDc0BQY0uIM0NIQ0lIyU7/Op8mW8SbivgpGloamj9VO&#xd;&#xa;aM9u19AUiNbQFGA6+G3E/fhwCIyPhpCZEnsZn+hsDsMF9VMViCzNyrkJmcAuWUz9&#xd;&#xa;sbFIhPczD381ce489AHwycZlg+p5O9M9u0z9J4d3kw28pfwM3Cs9zzv/Pud/AZ3q&#xd;&#xa;CUcNCmVuZHN0cmVhbQ0KZW5kb2JqDQoxNCAwIG9iag0KPDwNCi9UeXBlIC9QYWdl&#xd;&#xa;DQovUGFyZW50IDMgMCBSDQovUmVzb3VyY2VzIDQgMCBSDQovQ29udGVudHMgMTUg&#xd;&#xa;MCBSDQovTWVkaWFCb3hbIDAgMCA1OTUuMyA4NDEuOSBdDQovQ3JvcEJveFsgMCAw&#xd;&#xa;IDU5NS4zIDg0MS45IF0NCi9Sb3RhdGUgMA0KPj4NCmVuZG9iag0KMTUgMCBvYmoN&#xd;&#xa;Cjw8IC9MZW5ndGggMjQyMyAvRmlsdGVyIC9GbGF0ZURlY29kZSA+Pg0Kc3RyZWFt&#xd;&#xa;DQp4nO2bzW4byRWF9wb8DrWLA0jl+uuu6uzkv4ED2zNjK9kzMj2hIYuJJM9DzbvM&#xd;&#xa;g2SdF0i1eJu+V9Pn2INssghgwaL5dfX5iuxy9b1k8MEF+Xn73fHX+ef6p4cPnpw/&#xd;&#xa;fPD4RXC1Pz7/8PDB8/74n3d/gvuzC+7jwwex/xVcdMPoq2th9GUIIbmLT/0pNdr8&#xd;&#xa;++kdk4eOrD6fBl9rmSZ3mqfJxyqUnOBw9Kk9hc1yeORbbSXHkqc+TI1Tct/2T7Pw&#xd;&#xa;PFT8mpY8lYY6B8rJl/7vbj5zDbU/e/jr1D5cRI3SYYgvI3zd9Uf15/8vw//Ey/Dj&#xd;&#xa;4ToxUWtrvk3RnfcDHr3dfvBuii22lP94rqziMPlpnu8wDXfofK0Ncq31w35yr7fX&#xd;&#xa;F5ur292le791TzbXF9vL/dXmxH3YX+72/fhwcrv/1H8pKZ1c7v52vXdtrCc324uL&#xd;&#xa;3b+vXPrl5O/7jxsXYxjjye7q5uJ694+7Z+IvJ09fvjg9Cy1OdcrxLtbd1e1K6vnn&#xd;&#xa;fKn47Mbko6tD9HFo8+Q8fvkpumd7d086puCTq+PkWx6PKuOi8uTs7dPnr75/c+ae&#xd;&#xa;/eHsh/7g7PXzN+fvnJ0NGSP1Obmbt9d/efPy6csfzl69c+/ODJqG5EOI5oSPzv7q&#xd;&#xa;3Ty2e/X9d7++O3/51KV0mkbnQgsluC8Z3Pn28l8f9ld7N2U/9Nd+6HMe3Nnt9upu&#xd;&#xa;cjaX7unlbnt1u3VTf9FTczn0N99xjsYwv8Kp+anPSWnRt6G/pwZ3vXUf7OXUl9S4&#xd;&#xa;sqTat0rMfXLjcdKWtfbRYXaCHe7+Cr0MVYtvqbhxaj4MMn+5pnsT3CPn4moYjtDj&#xd;&#xa;F+nLGZ/tNu7D5uL28/Vmngg75XmcryBz8KPzzfXH7e3mxm2v3OebvTkg5+hzX2LM&#xd;&#xa;Ae+21z/vLnb7G3c807U5qgylT2sGp+lH7H7evN/cWK/+lh36mcZp9NNY0Ux+wYsv&#xd;&#xa;/drU+KMQH8dohWv1cRwtFkfr2KrP/U1ghzLI0EWmmDjS38WhWOR+ZlGc15U6rCOi&#xd;&#xa;pZGQoJbGkJYZal2LIaLFMi9a/ZJqmWspJGSspTCopYcCWgRZtEhm0arJj8v/AkBL&#xd;&#xa;I6FALY0hLTPUuhZDRItlFq2x+GGaqJZGwgC1NIa0zFDrWgwRLZZZtPpyPARw+YmW&#xd;&#xa;RsIItTSGtMxQ61oMES2WWbRK8yXyJUMjoUItjSEtM9S6FkNEi2VetILPiS8ZGgkN&#xd;&#xa;aykMaumhgBZBFi2SWbT6LjRlvmRoJExQS2NIywy1rsUQ0WKZRatvJmPmS4ZGYoBa&#xd;&#xa;BgNamgFaDBEtllm0Yt/iFr5kaCTiXYbBgJZmgBZDRItlFq1Q+yaMLxkaiXiXYTCg&#xd;&#xa;pRmgxRDRYpkPWn39922kS4ZBItxlWGxdyzDrWhQ5aNHMi1bsN+x0yTBIhLsMiyEt&#xd;&#xa;xSAtgixaJLNotezHSpcMg0S4y7AY0NIM0GKIaLHMolUHPzS6ZBgkwl3GPWxdSzNA&#xd;&#xa;iyGixTKL1lh7drpkGCTCXYbFgJZmgBZDRItlFq1h8iXwJUMjEe4yLAa0NAO0GCJa&#xd;&#xa;LPOi1e/NI18yNBLhLsNiSEsxSIsgixbJLFol+xT5kqGRBHcZBkNamgFaDBEtllm0&#xd;&#xa;8uBj4kuGRhLcZRgMaWkGaDFEtFhm0UrVh8yXDI0kuMswGNLSDNBiiGixzKIVm58K&#xd;&#xa;XzI0kvAuQ2NISzNAiyGixTIvWsG3gS8ZGkl4l6ExqKUYpEWQRYtkFq2QfB34kqGR&#xd;&#xa;hHcZGkNamgFaDBEtlvmgVabiR1RKPGgZJMFdhsGAlmHWtShy0KKZRauNfuDlT4Mk&#xd;&#xa;uMswGNLSDNBiiGixzKJVmy+8/GmQBHcZBkNamgFaDBEtlnnRCj7z8qdBEtxlGAxq&#xd;&#xa;KQZpEWTRIplFa0w+8fKnQTLcZRgMaWkGaDFEtEjmeV8V0l3nJa2XEo+jYCTmjqQ+&#xd;&#xa;OWX0EVXuDvd8Bjnf324utzf3pqdviWqxYGlhfX40BOaHIWJGYi/zk5sP68W74ygY&#xd;&#xa;iXONrHT5NPkJ1Mpy8bHfZRnk2DD7k3M2ekx9llqfgBR9W8pUZx8/39xu3fOb283V&#xd;&#xa;xW7z24P6yzRmV2L2dakB3b0EvyGPTiuBeYfzOMLc3Sz9NRhtWeb3dTTzFPywFEBy&#xd;&#xa;vddAl45mnuoR+t0dTX3wN3U0zQHf3NFcPw3vaObWb+Uq7A3fX3Y0TjqaBgPLjh1q&#xd;&#xa;9bKiyOHNY5D11TS3Pqm8zGMQ3NE0GNTSQwEtgixaJLNozWsYL/MYBHc0DYa0zFDr&#xd;&#xa;WgwRLZZZtMZ+W8fLPAbBHU2DIS0z1LoWQ0SLZRatoYfiZR6D4I6mwZCWGWpdiyGi&#xd;&#xa;xTKLVpl84GUeg+COpsGQlhlqXYshosUyL1qhj8aXDI3gjqbBoJYeCmgRZNEimUWr&#xd;&#xa;bxEaL/MYBHc0DYa0zFDrWgwRLZZZtFLxlZd5DII7mgZDWmaodS2GiBbLLFpx9CMv&#xd;&#xa;8xgEdzQtBrQ0A7QYIloss2iF5gde5jEI7mhaDGhpBmgxRLRY5kUr+MLLPAbBHU2L&#xd;&#xa;IS3FIC2CLFok80ErTclnXuYxCO5oWmxdyzDrWhQ5aNHMotX6fSYv8xgEdzQtBrQ0&#xd;&#xa;A7QYIloss2jVfpPZEtXSCO5oWgxoaQZoMUS0WGbRGvtdLy/zGAR3NO9h61qaAVoM&#xd;&#xa;ES2WWbTmD2fzMo9BcEfTYkBLM0CLIaLFMi9a0U9h5FoKwR1NiyEtxSAtgixaJLNo&#xd;&#xa;lewb/5SbQXBH02JASzNAiyGixTKLVh585Z9yMwjuaBoMaWkGaDFEtFhm0UrV8w/i&#xd;&#xa;aAL3MzWFnBQClAghRiSuCMXJD/zzbQbBvUyDISfNACmGiBXLvGhFX/jn2wyCe5kG&#xd;&#xa;g1qKQVoEWbRIZtEKuZ+wUC2N4F6mwZCWZoAWQ0SLZT5oxWnwiV9WBsG9TIMBLcOs&#xd;&#xa;a1HkoEUzi1Y/YeSfbzMI7mUaDGlpBmgxRLRYZtGqkw+1US2N4F6mwZCWZoAWQ0SL&#xd;&#xa;ZV60gp944dMguJdpMKilGKRFkEWLZBatMfnGC58Gwb1MgyEtzQAthogWyyxaQ+ko&#xd;&#xa;vSUxCO5lGgxpaQZoMUS0SGbp1cUy+rpeRDyOgpGllxlz8yOq2R16mQZhvUwDol6m&#xd;&#xa;gcD8METMSOxlfnLwQ1rdUH8ZBSJLLzOm5Auokkkv0yBf72XGWHxeClTf2MuMYfRJ&#xd;&#xa;d5NhK5Pknb8BPPV3w/xVteGwvj1+0R8u/bYXu6v5G7jvt338y+3dofM3QefpdG30&#xd;&#xa;Y5ib+T37f/NF0BaOn8tf6fXNp/sPtzwYdA0KZW5kc3RyZWFtDQplbmRvYmoNCjEg&#xd;&#xa;MCBvYmoNCjw8DQovVHlwZSAvQ2F0YWxvZw0KL1BhZ2VzIDMgMCBSDQo+Pg0KZW5k&#xd;&#xa;b2JqDQoyIDAgb2JqDQo8PA0KL1R5cGUgL0luZm8NCi9Qcm9kdWNlciAoT3JhY2xl&#xd;&#xa;IFhNTCBQdWJsaXNoZXIgNS42LjMpDQo+Pg0KZW5kb2JqDQozIDAgb2JqDQo8PA0K&#xd;&#xa;L1R5cGUgL1BhZ2VzDQovS2lkcyBbDQo3IDAgUg0KMTIgMCBSDQoxNCAwIFINCl0N&#xd;&#xa;Ci9Db3VudCAzDQo+Pg0KZW5kb2JqDQo0IDAgb2JqDQo8PA0KL1Byb2NTZXQgWyAv&#xd;&#xa;UERGIC9UZXh0IF0NCi9Gb250IDw8IA0KL0YwIDkgMCBSDQovRjEgMTAgMCBSDQov&#xd;&#xa;RjIgMTEgMCBSDQo+Pg0KL1hPYmplY3QgPDwgDQovSW0wIDUgMCBSDQovSW0xIDYg&#xd;&#xa;MCBSDQo+Pg0KPj4NCmVuZG9iag0KOSAwIG9iag0KPDwNCi9UeXBlIC9Gb250DQov&#xd;&#xa;U3VidHlwZSAvVHlwZTENCi9CYXNlRm9udCAvSGVsdmV0aWNhDQovRW5jb2Rpbmcg&#xd;&#xa;L1dpbkFuc2lFbmNvZGluZw0KPj4NCmVuZG9iag0KMTAgMCBvYmoNCjw8DQovVHlw&#xd;&#xa;ZSAvRm9udA0KL1N1YnR5cGUgL1R5cGUxDQovQmFzZUZvbnQgL0hlbHZldGljYS1C&#xd;&#xa;b2xkDQovRW5jb2RpbmcgL1dpbkFuc2lFbmNvZGluZw0KPj4NCmVuZG9iag0KMTEg&#xd;&#xa;MCBvYmoNCjw8DQovVHlwZSAvRm9udA0KL1N1YnR5cGUgL1R5cGUxDQovQmFzZUZv&#xd;&#xa;bnQgL0hlbHZldGljYS1PYmxpcXVlDQovRW5jb2RpbmcgL1dpbkFuc2lFbmNvZGlu&#xd;&#xa;Zw0KPj4NCmVuZG9iag0KMTYgMCBvYmoNClsgMTQgMCBSIC9YWVogNTEuMyA3OC41&#xd;&#xa;MTQgbnVsbCBdDQplbmRvYmoNCjE3IDAgb2JqDQpbIDE0IDAgUiAvWFlaIDUxLjMg&#xd;&#xa;NzguNTE0IG51bGwgXQ0KZW5kb2JqDQp4cmVmDQowIDE4DQowMDAwMDAwMDAwIDY1&#xd;&#xa;NTM1IGYNCjAwMDAwMjM5OTggMDAwMDAgbg0KMDAwMDAyNDA1MyAwMDAwMCBuDQow&#xd;&#xa;MDAwMDI0MTMxIDAwMDAwIG4NCjAwMDAwMjQyMTUgMDAwMDAgbg0KMDAwMDAwMDAx&#xd;&#xa;MCAwMDAwMCBuDQowMDAwMDAwNDU5IDAwMDAwIG4NCjAwMDAwMTYxNTIgMDAwMDAg&#xd;&#xa;bg0KMDAwMDAxNjMxMCAwMDAwMCBuDQowMDAwMDI0MzU3IDAwMDAwIG4NCjAwMDAw&#xd;&#xa;MjQ0NjIgMDAwMDAgbg0KMDAwMDAyNDU3MyAwMDAwMCBuDQowMDAwMDE4NjM1IDAw&#xd;&#xa;MDAwIG4NCjAwMDAwMTg3OTUgMDAwMDAgbg0KMDAwMDAyMTMzNSAwMDAwMCBuDQow&#xd;&#xa;MDAwMDIxNDk1IDAwMDAwIG4NCjAwMDAwMjQ2ODcgMDAwMDAgbg0KMDAwMDAyNDcz&#xd;&#xa;OSAwMDAwMCBuDQp0cmFpbGVyDQo8PA0KL1NpemUgMTgNCi9Sb290IDEgMCBSDQov&#xd;&#xa;SW5mbyAyIDAgUg0KL0lEIFs8NDlhNDU3OThiNWM0OTkwOGI2ZWZjZDgyY2MxYjVj&#xd;&#xa;MDE+PDQ5YTQ1Nzk4YjVjNDk5MDhiNmVmY2Q4MmNjMWI1YzAxPl0NCj4+DQpzdGFy&#xd;&#xa;dHhyZWYNCjI0NzkxDQolJUVPRg0K\\\"";
		*/
		String pdf_prueba = "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qWdQ1Jh2X/il3vabrGh9p3r3FVeqPPt1Hk7yJ9J6TPPXvwFyW21Q/9Zf3/1W0a3P4aFVZdY9ztgmn9yRSdjgWV+ICnQW0nDvfw/uUuVfCXco61JQyYNZW+7Q5uLv5tOX8KfCQGAEk78Hf6nyr4I/i/ZRYRiQPJgV+HPJJxnu/gdaLba0DQplbmRzdHJlYW0NCmVuZG9iag0KMSAwIG9iag0KPDwNCi9UeXBlIC9DYXRhbG9nDQovUGFnZXMgMyAwIFINCj4+DQplbmRvYmoNCjIgMCBvYmoNCjw8DQovVHlwZSAvSW5mbw0KL1Byb2R1Y2VyIChPcmFjbGUgWE1MIFB1Ymxpc2hlciA1LjYuMykNCj4+DQplbmRvYmoNCjMgMCBvYmoNCjw8DQovVHlwZSAvUGFnZXMNCi9LaWRzIFsNCjYgMCBSDQpdDQovQ291bnQgMQ0KPj4NCmVuZG9iag0KNCAwIG9iag0KPDwNCi9Qcm9jU2V0IFsgL1BERiAvVGV4dCBdDQovRm9udCA8PCANCi9GMCA4IDAgUg0KL0YxIDkgMCBSDQovRjIgMTAgMCBSDQo+Pg0KL1hPYmplY3QgPDwgDQovSW0wIDUgMCBSDQo+Pg0KPj4NCmVuZG9iag0KOCAwIG9iag0KPDwNCi9UeXBlIC9Gb250DQovU3VidHlwZSAvVHlwZTENCi9CYXNlRm9udCAvSGVsdmV0aWNhDQovRW5jb2RpbmcgL1dpbkFuc2lFbmNvZGluZw0KPj4NCmVuZG9iag0KOSAwIG9iag0KPDwNCi9UeXBlIC9Gb250DQovU3VidHlwZSAvVHlwZTENCi9CYXNlRm9udCAvSGVsdmV0aWNhLUJvbGQNCi9FbmNvZGluZyAvV2luQW5zaUVuY29kaW5nDQo+Pg0KZW5kb2JqDQoxMCAwIG9iag0KPDwNCi9UeXBlIC9Gb250DQovU3VidHlwZSAvVHlwZTENCi9CYXNlRm9udCAvSGVsdmV0aWNhLU9ibGlxdWUNCi9FbmNvZGluZyAvV2luQW5zaUVuY29kaW5nDQo+Pg0KZW5kb2JqDQoxMSAwIG9iag0KWyA2IDAgUiAvWFlaIDUxLjMgNTguMTY4IG51bGwgXQ0KZW5kb2JqDQoxMiAwIG9iag0KWyA2IDAgUiAvWFlaIDUxLjMgNTguMTY4IG51bGwgXQ0KZW5kb2JqDQp4cmVmDQowIDEzDQowMDAwMDAwMDAwIDY1NTM1IGYNCjAwMDAwMDI4NTMgMDAwMDAgbg0KMDAwMDAwMjkwOCAwMDAwMCBuDQowMDAwMDAyOTg2IDAwMDAwIG4NCjAwMDAwMDMwNTQgMDAwMDAgbg0KMDAwMDAwMDAxMCAwMDAwMCBuDQowMDAwMDAwNDU5IDAwMDAwIG4NCjAwMDAwMDA2MTcgMDAwMDAgbg0KMDAwMDAwMzE4MyAwMDAwMCBuDQowMDAwMDAzMjg4IDAwMDAwIG4NCjAwMDAwMDMzOTggMDAwMDAgbg0KMDAwMDAwMzUxMiAwMDAwMCBuDQowMDAwMDAzNTYzIDAwMDAwIG4NCnRyYWlsZXINCjw8DQovU2l6ZSAxMw0KL1Jvb3QgMSAwIFINCi9JbmZvIDIgMCBSDQovSUQgWzw2ZjAzZmQyM2RiMDM4NGJhZWE1Y2U2OGM0YjQ5MzNiND48NmYwM2ZkMjNkYjAzODRiYWVhNWNlNjhjNGI0OTMzYjQ+XQ0KPj4NCnN0YXJ0eHJlZg0KMzYxNA0KJSVFT0YNCg==";
		getPdfFacturaClienteResponse.setS_pdf(pdf_prueba);
		getPdfFacturaClienteResponse.setS_cod_error(null);
		return getPdfFacturaClienteResponse;
	}
}
