/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import page_n_components.pages.page_interface.BasePage;

import java.util.LinkedList;
import java.util.List;


/**
 * @author christiann
 */
public class SportsPage implements BasePage {

    private static final String BBC_SPORT_URL = "http://www.bbc.com/sport";
    private static final By SPORT_LOGO = By.cssSelector(".global-header__logo[href='/sport']");
    private static final By SPORT_SECTION_LOGO = By.cssSelector(".global-header__section");

    private static final By SPORT_NAV = By.cssSelector(".primary-nav");
    private static final By SPORT_NAV_HOME = By.cssSelector(".primary-nav__link[href='/sport']");
    private static final By SPORT_NAV_ALL_SPORTS = By.cssSelector(".primary-nav__link[href='/sport/all-sports']");
    private static final By SPORT_NAV_FOOTBALL = By.cssSelector(".primary-nav__link[href='/sport/football']");
    private static final By SPORT_NAV_FORMULA1 = By.cssSelector(".primary-nav__link[href='/sport/formula1']");
    private static final By SPORT_NAV_TENNIS = By.cssSelector(".primary-nav__link[href='/sport/tennis']");

    private static final By SPORT_ARTICLES = By.cssSelector(".gel-layout__item");
    private static final By SPORT_ARTICLE_TITLE = By.cssSelector(".lakeside__body .lakeside__title-text");
    private static final By SPORT_ARTICLE_SECTION = By.cssSelector(".lakeside__body .section-tag");
    private static final By SPORT_ARTICLE_URL = By.cssSelector("h3.lakeside__title>a");
    private static final By SPORT_ARTICLE_COMMENTS_COUNTER = By.cssSelector(".lakeside__body .comments-tag .dna-comment-count-show");
    private static final By SPORT_ARTICLE_LINK = By.cssSelector(".faux-block-link__overlay");

    public boolean isLogoDisplayed() {
        return DriverInteractions.isLocatorDisplayed(SPORT_LOGO);
    }

    public boolean isMainNavDisplayed() {
        return DriverInteractions.isLocatorDisplayed(SPORT_NAV);
    }

    public boolean isSectionLogoDisplayed() {
        return DriverInteractions.isLocatorDisplayed(SPORT_SECTION_LOGO);
    }

    @Override
    public String getUrl() {
        return BBC_SPORT_URL;
    }

    public void clickOnMainNavSport(SportMainNav section) {
        switch (section) {
            case HOME:
                DriverInteractions.clickOn(SPORT_NAV_HOME);
                break;
            case FOOTBALL:
                DriverInteractions.clickOn(SPORT_NAV_FOOTBALL);
                break;
            case FORMULA_1:
                DriverInteractions.clickOn(SPORT_NAV_FORMULA1);
                break;
            case TENNIS:
                DriverInteractions.clickOn(SPORT_NAV_TENNIS);
                break;
            default:
                throw new IllegalArgumentException(section + " method is not implemented yet!");
        }
    }

    public boolean isMainNavSectionDisplayed(SportMainNav section) {
        return DriverInteractions.getElementText(SPORT_SECTION_LOGO).matches(String.valueOf(section));
    }

    public List<WebElement> getAllArticles() {
        return DriverInteractions.findElementsList(SPORT_ARTICLES);
    }

    public List<WebElement> getAllCommentedArticles() {
        List<WebElement> commentedArticles = new LinkedList<>();

        for (WebElement element : getAllArticles()) {
            try {
                if (element.findElement(SPORT_ARTICLE_COMMENTS_COUNTER).isDisplayed()) {
                    commentedArticles.add(element);
                }
            } catch (NoSuchElementException e) {
                //ignore
            }
        }

        return commentedArticles;
    }

    public String getArticleTitle(WebElement element) {
        return element.findElement(SPORT_ARTICLE_TITLE).getText();
    }

    public int getArticleCommentCounter(WebElement element) {
        return Integer.parseInt(element.findElement(SPORT_ARTICLE_COMMENTS_COUNTER).getText());
    }

    public String getArticleUrl(WebElement element) {
        return element.findElement(SPORT_ARTICLE_URL).getAttribute("href");
    }


    public enum SportMainNav {
        HOME, FOOTBALL, FORMULA_1,
        CRICKET, RUGBY_U, TENNIS,
        GOLF, ATHLETICS, CYCLING
    }
}
