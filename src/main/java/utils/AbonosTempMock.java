package utils;

import json.*;


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

        userResponseNoVerified.setEmail("usuario.noverified@intelygenz.com");
        userResponseNoVerified.setId("2445");
        userResponseNoVerified.setLanguage("CAST");
        userResponseNoVerified.setName("Usuario");
        userResponseNoVerified.setNewsletter(true);
        userResponseNoVerified.setPassword("12345678");
        userResponseNoVerified.setSurname("NoVerified");
        userResponseNoVerified.setBirthDate("04/02/1979");
        userResponseNoVerified.setS_cod_cli(null);
        
        userResponseVerified2.setBirthDate("18/07/1980");
        userResponseVerified2.setEmail("usuario.verified.sin.imp@intelygenz.com");
        userResponseVerified2.setId("2446");
        userResponseVerified2.setLanguage("CAST");
        userResponseVerified2.setName("Usuario verificado");
        userResponseVerified2.setNewsletter(true);
        userResponseVerified2.setPassword("12345678");
        userResponseVerified2.setSurname("Sin impagos");
        userResponseVerified2.setS_cod_cli("180444");

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
		if (request.getP_abono().equalsIgnoreCase("S")) {
			List<ProdAbono> listaAbonos = new ArrayList<ProdAbono>();
			ProdAbono prodAbono1 = new ProdAbono();
			ProdAbono prodAbono2 = new ProdAbono();
			ProdAbono prodAbono3 = new ProdAbono();

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
			prodAbono1.setFechaHoraVenta("2018/06/05 13:44:25");
			prodAbono1.setFechaInicio("12/01/2018");
			prodAbono1.setImporteVentaConIVA("193.21");
			prodAbono1.setLocalizadorVenta("5626512");
			prodAbono1.setTipoAbono("Abono mes");
			prodAbono1.setViaT("4524-2222-2222-1212");

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
			prodAbono2.setParking("Parking Madrid");
			prodAbono2.setFechaHoraVenta("2018/06/05 13:44:25");
			prodAbono2.setFechaInicio("14/01/2018");
			prodAbono2.setImporteVentaConIVA("83.21");
			prodAbono2.setLocalizadorVenta("190000OM0028");
			prodAbono2.setTipoAbono("Abono mes");
			prodAbono2.setViaT("4524-3333-4455-4455");

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
			prodAbono3.setParking("Parking Madrid");
			prodAbono3.setFechaHoraVenta("2018/06/05 13:44:25");
			prodAbono3.setFechaInicio("10/06/2018");
			prodAbono3.setImporteVentaConIVA("21.4");
			prodAbono3.setLocalizadorVenta("902202122");
			prodAbono3.setTipoAbono("Abono mes");
			prodAbono3.setViaT("3233-4344-6565-7676");

			//Si buscamos con tramites pendientes
			if (request.getP_solo_tramite().equalsIgnoreCase("S")) {
				listaAbonos.add(prodAbono1);
				listaAbonos.add(prodAbono2);
			} else {
				listaAbonos.add(prodAbono1);
				listaAbonos.add(prodAbono2);
				listaAbonos.add(prodAbono3);
			}

			findPurchasesByUserResponse.setS_sabalist_prodsAbono(listaAbonos);
			findPurchasesByUserResponse.setS_cod_error(null);
		}else {
			List<Purchase> listaProductos = new ArrayList<Purchase>();
			Purchase purchase = new Purchase();
	        purchase.setId("3232");
	        purchase.setPurchaseDate("10/06/2018");
	        purchase.setExpirationDate("10/08/2018");
	        purchase.setProductLocalizator("201856454");
	        purchase.setProductSICASCode("12122");
	        purchase.setParkingCode("32323432");
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
	        listaProductos.add(purchase);
	        findPurchasesByUserResponse.setS_sabalist_prodsVenta(listaProductos);
		}
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
				response.setS_impago("true");
				response.setS_importe_total("1234.4");
				List<NonPayment> lista_impagos = new ArrayList<NonPayment>();
				lista_impagos.add(nonPayment);
				lista_impagos.add(nonPayment2);

				response.setS_lista_impagos(lista_impagos);
			} else {
				response.setS_impago("false");
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
        customerS.setS_apellido_2("Verificado");
        customerS.setS_cod_cli("180444");
        customerS.setS_cod_postal("28080");
        customerS.setS_direccion_fiscal("Gran Vía 30");
        customerS.setS_nacionalidad("España");
        customerS.setS_partita_iva(null);
        customerS.setS_pec(null);
        customerS.setS_poblacion("Madrid");
        customerS.setS_telefono(910000000);
        customerS.setS_nombre("Usuario");
        customerS.setS_txt_nombreCompleto("Usuario Verificado Verificado");
        customerS.setS_txt_nif("00000001T");
        getCustomerResponse.setS_cod_error(null);
        getCustomerResponse.setS_datos_cliente(customerS);


        return getCustomerResponse;

    }
    
	public static VincultaAbnViaTResponse mockGetVincultaAbnViaT(VincultaAbnViaTRequest request) {

		VincultaAbnViaTResponse vincultaAbnViaTResponse = new VincultaAbnViaTResponse();

		if (request.getP_org_id() != null && request.getP_cod_idioma() != null && request.getP_cod_usu() != null
				&& request.getP_cod_cli() != null && request.getP_cod_viat() != null
				&& request.getP_loc_venta() != null) {
			if (request.getP_cod_usu().equalsIgnoreCase("2444")) {
				vincultaAbnViaTResponse.setS_cod_error(null);
			} else {
				vincultaAbnViaTResponse.setS_cod_error("2446");
			}
		} else {
			vincultaAbnViaTResponse.setS_cod_error("SVD-002");
		}

		return vincultaAbnViaTResponse;
	}
    

}
