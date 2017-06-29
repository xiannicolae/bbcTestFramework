package steps_definition;

import contracts.Article;
import contracts.PageData;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverUtils;
import org.openqa.selenium.WebElement;
import page_n_components.pages.page_implementation.SportsPage;
import page_n_components.pages.page_implementation.SportsPage.*;
import static junit.framework.Assert.assertTrue;
import static page_n_components.components.components_implementation.UpperMenu.MainMenuSections.SPORT;

/**
 * Created by christiann on 08/06/2017.
 */
public class SportsPageSteps {

    private final SportsPage sportPage = new SportsPage();
    private PageData pageData;

    public SportsPageSteps(PageData article) { this.pageData = article; }


    @Then("^User should be redirected to the Sport page$")
    public void checkIfOnSportsPage() {
        assertTrue(sportPage.getUrl().matches(DriverUtils.getCurrentPageUrl()));
        assertTrue(sportPage.isLogoDisplayed());
    }

    @When("^User opens the BBC Sport page$")
    public void userOpensTheBBCSportPage() {
        UpperHeaderSteps.clickOnUpperNav(SPORT);
        checkIfOnSportsPage();
    }

    @And("^User clicks on main navigation section ([^\"]*)$")
    public void userClicksOnSport(SportMainNav section) {
        assertTrue(sportPage.isMainNavDisplayed());
        sportPage.clickOnMainNavSport(section);

    }

    @And("^Selected main navigation section ([^\"]*) is successfully loaded$")
    public void sportMainSectionIsLoaded(SportMainNav section) {
        assertTrue(sportPage.isSectionLogoDisplayed());
        assertTrue(sportPage.isMainNavSectionDisplayed(section));
    }

    @And("^All the commented articles are loaded$")
    public void sportCommentedArticlesAreLoaded() {
        for(WebElement element : sportPage.getAllCommentedArticles()) {
            assertTrue(element.isDisplayed());

            Article commentedArticle = new Article();
            commentedArticle.setTitle(sportPage.getArticleTitle(element));
            commentedArticle.setCommentsCounter(sportPage.getArticleCommentCounter(element));
            commentedArticle.setUrl(sportPage.getArticleUrl(element));
            commentedArticle.setLocator(element);
            pageData.articleList.add(commentedArticle);
        }
    }

    @Then("^User clicks on the most commented sport article$")
    public void userClicksOnMostCommented() {
        sportCommentedArticlesAreLoaded();

        Article theMostCommented = new Article();
        int max = pageData.articleList.get(0).getCommentsCounter();

        for(Article sportArticle : pageData.articleList) {
            if (max <= sportArticle.getCommentsCounter()) theMostCommented = sportArticle;
        }

        pageData.url = theMostCommented.getUrl();
        theMostCommented.getLocator().click();
    }

    @Then("^The sport article is successfully loaded$")
    public void sportArticleIsLoaded() {
        assertTrue(DriverUtils.getCurrentPageUrl().contains(pageData.url));
    }
}
