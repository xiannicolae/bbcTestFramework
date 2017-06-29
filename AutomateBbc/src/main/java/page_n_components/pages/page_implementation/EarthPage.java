package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page_n_components.pages.page_interface.BasePage;

/**
 * Created by christiann on 23/06/2017.
 */
public class EarthPage implements BasePage {

    private static final String BBC_EARTH_URL = "http://www.bbc.com/earth/world";
    private static final By EARTH_LOGO = By.cssSelector("#brand[href='/earth']");

    private static final By EARTH_ARTICLES_GROUP_1 = By.cssSelector(".article-list-group-1");
    private static final By FIRST_ARTICLES = By.cssSelector(".article-list-group-1 .promo-unit-wrapper");
    private static final By ARTICLE_CATEGORY_NAME = By.cssSelector(".article-list-group-1 .context-heading");
    private static final By ARTICLE_TITLE = By.cssSelector(".article-list-group-1 .promo-unit-title");

    private static final By ARTICLE_CATEGORY_NAME_ON_PAGE = By.cssSelector(".hero-unit-lining .context-heading");
    private static final By ARTICLE_TITLE_ON_PAGE = By.cssSelector(".hero-unit-lining .primary-heading");

    private static final By FOLLOW_US_FACEBOOK = By.cssSelector(".follow-us-item-facebook");
    private static final By FOLLOW_US_TWITTER = By.cssSelector(".follow-us-item-twitter");
    private static final By FOLLOW_US_YOUTUBE = By.cssSelector(".follow-us-item-youtube");
    private static final By FOLLOW_US_INSTAGRAM = By.cssSelector(".follow-us-item-instagram");


    @Override
    public String getUrl() {
        return BBC_EARTH_URL;
    }

    public boolean isEarthLogoDisplayed() {
        return DriverInteractions.isLocatorDisplayed(EARTH_LOGO);
    }

    public boolean isFirstArticleGroupDisplayed() {
        return DriverInteractions.isLocatorDisplayed(EARTH_ARTICLES_GROUP_1);
    }

    public String articleCategoryName(int no) {
        try {
            return returnArticleElement(no).findElement(ARTICLE_CATEGORY_NAME).getText();
        }catch(Exception e){
            return "";
        }
    }

    public String articleTitle(int no) {
        return DriverInteractions.findElementsList(ARTICLE_TITLE).get(no - 1).getText();
    }

    public void clickOnTheMainArticleNo(int no) {
        returnArticleElement(no).click();
    }

    public String categoryNameOnPage() {
        return DriverInteractions.getElementText(ARTICLE_CATEGORY_NAME_ON_PAGE);
    }

    public String titleNameOnPage() {
        return DriverInteractions.getElementText(ARTICLE_TITLE_ON_PAGE);
    }

    public boolean isSocialMediaItemDisplayed(SocialMedia socialMedia) {
        switch (socialMedia) {
            case FACEBOOK:
                return DriverInteractions.isLocatorDisplayed(FOLLOW_US_FACEBOOK);
            case TWITTER:
                return DriverInteractions.isLocatorDisplayed(FOLLOW_US_TWITTER);
            case YOUTUBE:
                return DriverInteractions.isLocatorDisplayed(FOLLOW_US_YOUTUBE);
            case INSTAGRAM:
                return DriverInteractions.isLocatorDisplayed(FOLLOW_US_INSTAGRAM);
            default:
                throw new IllegalArgumentException(socialMedia + " item is not covered yet!");
        }
    }

    private WebElement returnArticleElement(int no) {
        return DriverInteractions.findElementsList(FIRST_ARTICLES).get(no - 1);
    }

    public enum SocialMedia {
        FACEBOOK, TWITTER,
        YOUTUBE, INSTAGRAM
    }

}
