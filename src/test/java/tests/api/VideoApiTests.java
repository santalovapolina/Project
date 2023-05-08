package tests.api;

import io.qameta.allure.Owner;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.ApiSteps;

import java.util.List;


@Tag("api")
@Owner("Santalova Polina")
public class VideoApiTests {

    private ApiSteps steps = new ApiSteps();
    int shelfNumber = 4;

    @Test
    void checkShelfTitleText() {
        JsonPath jsonPath = steps.getMoviesData();
        String title = steps.getShelfTitle(jsonPath, shelfNumber);
        steps.verifyShelfTitle(title);
    }

    @Test
    void checkMovieOnShelf() {
        JsonPath jsonPath = steps.getMoviesData();
        List<String> titles = steps.getShelfItemsTitles(jsonPath, shelfNumber);
        steps.verifyItemTitle(titles);
    }

    @Test
    void checkItemsHaveMovieContentId() {
        JsonPath jsonPath = steps.getMoviesData();
        List<String> movieContentId = steps.getAllShelvesItemsMovieContentIds(jsonPath);
        steps.verifyShelvesItemsMovieContentIds(movieContentId);
    }







}



