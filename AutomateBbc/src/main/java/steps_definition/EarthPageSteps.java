package steps_definition;

import contracts.Article;
import contracts.PageData;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverUtils;
import page_n_components.pages.page_implementation.EarthPage;
import page_n_components.pages.page_implementation.EarthPage.*;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static page_n_components.components.components_implementation.UpperMenu.MainMenuSections.EARTH;

/**
 * Created by christiann on 23/06/2017.
 */

public class EarthPageSteps {

    private final EarthPage earthPage = new EarthPage();
    private  PageData pageData;

    public EarthPageSteps(PageData pageData) { this.pageData = pageData; }

    @Then("^I should be redirected to the Earth page$")
    public void checkIfOnEarthPage() {
        assertTrue(earthPage.getUrl().matches(DriverUtils.getCurrentPageUrl()));
        assertTrue(earthPage.isEarthLogoDisplayed());
    }

    @When("^User opens the BBC Earth page$")
    public void userOpensTheBBCEarthPage() {
        UpperHeaderSteps.clickOnUpperNav(EARTH);
        checkIfOnEarthPage();
    }

    @And("^User click on the main story no. '([123])'$")
    public void userClickOnTheMainEarthStoryNo(int no) {
        assertTrue(earthPage.isFirstArticleGroupDisplayed());

        Article article = new Article();
        article.setCategory(earthPage.articleCategoryName(no));
        article.setTitle(earthPage.articleTitle(no));
        pageData.articleList.add(article);

        earthPage.clickOnTheMainArticleNo(no);
    }

    @Then("^The story is successfully loaded$")
    public void theEarthStoryIsLoaded() {
        Article checkArticleData = pageData.articleList.get(0);

        if (checkArticleData.getCategory() != "") {
            assertTrue(earthPage.categoryNameOnPage().matches(checkArticleData.getCategory()));
        } else {
            assertTrue(earthPage.titleNameOnPage().matches(checkArticleData.getTitle()));
        }
    }

    @Then("^User can see the Social Media options to follow BBC Earth$")
    public void socialMediaOption(List<SocialMedia> socialMedia) {
        for( SocialMedia option : socialMedia) {
            assertTrue(earthPage.isSocialMediaItemDisplayed(option));
        }
    }
}
