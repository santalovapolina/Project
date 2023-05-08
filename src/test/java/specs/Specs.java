package specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static helpers.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;

public class Specs {

    public static RequestSpecification baseRequestSpec = with()
            .baseUri("https://kion.ru")
            .basePath("/api/mgw-hostess/pages")
            .headers("X-Device-Model", "PC_Widevine_v3",
                    "X-Device-Id", "4dc1aa32-b14d-4792-92da-21323ce3a077",
                    "X-App-Version", "3.15.4")
            .log().all()
            .filter(withCustomTemplates())
            .contentType(ContentType.JSON);

    public static ResponseSpecification baseResponseSpecCode200 = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(200)
            .build();



}
