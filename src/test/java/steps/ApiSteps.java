package steps;

import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static specs.Specs.baseRequestSpec;
import static specs.Specs.baseResponseSpecCode200;

public class ApiSteps {


    @Step("Getting data")
    public JsonPath getMoviesData() {
        Response response = given()
                .queryParam("offset","0")
                .spec(baseRequestSpec)
                .when()
                .get("/MOVIES")
                .then()
                .spec(baseResponseSpecCode200)
                .extract().response();
        return response.jsonPath();
    }

    @Step("Getting particular shelf title")
    public String getShelfTitle(JsonPath jsonPath, int shelfNumber) {
        String title = jsonPath.getString("shelves["+ shelfNumber +"].title");
        return title;
    }

    @Step("Verify shelf title")
    public void verifyShelfTitle(String title) {
        assertTrue(title.contains("Фильмы KION Originals"));
    }

    @Step("Getting particular shelf items titles")
    public List<String> getShelfItemsTitles(JsonPath jsonPath, int shelfNumber) {
        List<String> titles = jsonPath.get("shelves["+ shelfNumber +"].items.title");
        return titles;
    }

    @Step("Verify particular item title")
    public void verifyItemTitle(List<String> titles) {
        assertTrue(titles.contains("Дуров"));
    }

    @Step("Getting shelf items movie content ids")
    public List<String> getAllShelvesItemsMovieContentIds(JsonPath jsonPath) {
        List<String> movieContentId = jsonPath.get("shelves.items.link.movieContentId");
        return movieContentId;
    }

    @Step("Verify particular item title")
    public void verifyShelvesItemsMovieContentIds(List<String> movieContentId) {
        assertNotNull(movieContentId);
    }
}
